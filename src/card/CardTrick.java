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
 * @modifier KHANG_VU_991797096
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        
        Card userCard = new Card();
        
        System.out.println("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        userCard.setValue(userValue);
        
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuit = input.nextInt();
        userCard.setSuit(Card.SUITS[userSuit]);
        
        
        boolean found = false;
        for (Card cardInHand : magicHand) {
            if (cardInHand.getValue() == userCard.getValue() && cardInHand.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulation! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
}
