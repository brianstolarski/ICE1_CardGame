/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

 
 
   // CardTrick.java
/**
 * CardTrick class
 * Created by KIRANSINHRATHOD , Student #991778272
 * Date: 01-26-2025
 */

import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {
        // Array to hold a hand of 7 cards
        Card[] hand = new Card[7];
        Random random = new Random();
        
        // Populate the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }

        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // Example: lucky card number is 7
        luckyCard.setSuit("Hearts");  // Example: lucky card suit is Hearts
        
        // Search for the lucky card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report whether the lucky card was found
        if (found) {
            System.out.println("The lucky card was found in the magic hand! You win!");
        } else {
            System.out.println("The lucky card was not found in the magic hand. You lose.");
        }
    }
}
