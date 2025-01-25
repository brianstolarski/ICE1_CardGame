/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

 
 
  
 
/**
 * CardTrick class
 * Created by KiransinhRathod, Student #991778272
 
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
         
        Card[] hand = new Card[7];
        Random random = new Random();
        
       
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }

         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card number (1 to 13):");
        int number = scanner.nextInt();
        System.out.println("Pick a suit (0: Hearts, 1: Diamonds, 2: Clubs, 3: Spades):");
        int suit = scanner.nextInt();
        String suitString = Card.SUITS[suit];
        
        
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == number && card.getSuit().equals(suitString)) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Your card was found in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(7);  
        luckyCard.setSuit("Hearts");   
        
         
        found = false;
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
