/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Modified by: Sabaa Al-Gburi
 * Student ID: 991736646
 * Date: January 25, 2025
 */
import java.util.Random;
import java.util.Scanner; 

public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        // Fill magicHand array with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);  // Random value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]]);  // Random suit
            magicHand[i] = c;
        }
        
        // Hard-code the lucky card (2 of Clubs)
        Card luckyCard = new Card(2, "Clubs"); 

        // Search for the luckyCard in the magicHand array
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report if the luckyCard was found
        if (found) {
            System.out.println("The lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println("The lucky card (2 of Clubs) is not in the magic hand.");
        }
    }
}
