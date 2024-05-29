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
 * @modifier MohamedIdris, 991716127, 2024-05-28
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill the magicHand array with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Random suit
            magicHand[i] = c;
        }

        // Ask the user for a card
        System.out.println("Pick any card from 1 to 13: ");
        int userInput = scanner.nextInt();
        System.out.println("Pick a suit (Spades, Clubs, Hearts, Diamonds): ");
        String userSuit = scanner.next();

        // Search for the user's card in the magicHand array
        boolean inHand = false;
        for (Card i : magicHand) {
            if (i.getValue() == userInput && i.getSuit().equalsIgnoreCase(userSuit)) {
                inHand = true;
                break;
            }
        }

        
        if (inHand) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        Card magicCard = new Card();
        magicCard.setValue(1);
        magicCard.setSuit("Spades");
    }
}