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
 * @author srinivsi
 * @modifier Karthik Srini Nair (Replace with your full name and student number)
 */
public class CardTrick {

    public static void main(String[] args) {
        // Create an array to hold 7 random Card objects
        Card[] magicHand = new Card[7]; 
        Random random = new Random();
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit (Hearts, Diamonds, Clubs, Spades)
            magicHand[i] = c;
        }

        // Ask the user to pick a card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.println("Pick a card suit (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int userSuitIndex = scanner.nextInt();

        // Create a card based on the user's input
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuitIndex]);

        // Search the magic hand for the user's card
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        // Report if the user's card is in the magic hand
        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        // Hardcode a "lucky card" with value 2 and suit "Clubs"
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Search the magic hand for the lucky card
        boolean luckyCardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        // Report if the lucky card is in the magic hand
        if (luckyCardFound) {
            System.out.println("You win! The lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println("You lose! The lucky card (2 of Clubs) is not in the magic hand.");
        }
    }
}
