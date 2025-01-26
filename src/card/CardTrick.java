/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author srinivsi
 * @author Brian Stolarski - 991367847
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Step 3 - Fill hand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        // Step 4 - Ask the user for input
        System.out.println("Pick a card.");
        System.out.println("Enter a value from 1-13!");
        int input = scanner.nextInt();

        // Step 4.2 - Ask user for the suit
        System.out.println("Pick a suit: ");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ". " + Card.SUITS[i]);
        }
        int suit = scanner.nextInt();

        Card yourCard = new Card();
        yourCard.setValue(input);
        yourCard.setSuit(Card.SUITS[suit]);

        // Step 4.3 - Search for the card in the users hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == yourCard.getValue() && card.getSuit().equals(yourCard.getSuit())) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found your card!" : "Card not found!");
        
    }

}