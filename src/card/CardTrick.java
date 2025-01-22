package card;

import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        // Create an array to hold 7 cards
        Card[] magicHand = new Card[7];

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1); // Random value between 1-13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Random suit (0-3)
            magicHand[i] = c;
        }

        // Display the cards in the magic hand (for debugging/testing)
        System.out.println("Magic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        // Ask the user for a card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        // Close the Scanner to prevent resource leaks
        scanner.close();

        // Search for the user's card in the magic hand
        boolean cardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equals(userSuit)) {
                cardFound = true;
                break;
            }
        }

        // Report the result
        if (cardFound) {
            System.out.println("Congratulations, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // Add and check the lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2); // Hardcoded lucky card value
        luckyCard.setSuit("Clubs"); // Hardcoded lucky card suit

        if (userValue == luckyCard.getValue() && userSuit.equals(luckyCard.getSuit())) {
            System.out.println("Wow! You found the lucky card!");
        } else {
            System.out.println("The lucky card was " + luckyCard.getSuit() + " " + luckyCard.getValue());
        }
    }
}
