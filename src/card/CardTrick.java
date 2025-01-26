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
 *         Date: 2025-01-26
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

        // Step 3.1 - Display the 7 random cards
        // for (int i = 0; i < magicHand.length; i++) {
        //     System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        // }

        // Step 4 - Ask the user for input
        // System.out.println("Pick a card.");
        // System.out.print("Enter a value from 1-13: ");
        // int input = scanner.nextInt();

        // Step 4.2 - Ask user for the suit
        // System.out.print("Pick a suit (0-3 where 0 = Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        // int suit = scanner.nextInt();

        // Card yourCard = new Card();
        // yourCard.setValue(input);
        // yourCard.setSuit(Card.SUITS[suit]);

        // Step 4.3 - Search for the card in the users hand
        // boolean found = false;
        // for (Card card : magicHand) {
        //     if (card.getValue() == yourCard.getValue() &&
        //             card.getSuit().equals(yourCard.getSuit())) {
        //         found = true;
        //         break;
        //     }
        // }

        // System.out.println(found ? "Your card is in the magic hand!" : "Sorry, your card is not in the magic hand.");

        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("WOW! You found the lucky card! The 7 of Hearts!");
        } else {
            System.out.println("Sorry! None of the 7 cards you found were the lucky card! :(");
        }

    }

}
