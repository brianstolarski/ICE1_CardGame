/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

 
 
  
 // CardTrick.java
/**
 * CardTrick class
 * Created by Kiransinh , Student #991778272
 * Date: 01-26-2025
 */

import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {
         
        Card[] hand = new Card[7];
        Random random = new Random();
        
         
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }

         
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // Example: lucky card number is 7
        luckyCard.setSuit("Hearts");  // Example: lucky card suit is Hearts
        
         
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("The lucky card was found in the magic hand! You win!");
        } else {
            System.out.println("The lucky card was not found in the magic hand. You lose.");
        }
    }
}
