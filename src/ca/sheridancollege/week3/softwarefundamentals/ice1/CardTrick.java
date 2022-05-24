/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random num = new Random();
            int random = num.nextInt(13)+1;
            c.setValue(random);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int random2 = num.nextInt(3);
            c.setSuit(Card.SUITS[random2]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner view = new Scanner(System.in);
        System.out.println("Enter Card Value (1-13):");
        int value = view.nextInt();
        Card userCard = new Card();
        userCard.setValue(value);
        System.out.println("Enter Card Suit (Hearts Diamonds Spades Clubs):");
        String suit = view.next();
        userCard.setSuit(suit);
        boolean results = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i]== userCard){
                System.out.println("This Card was in the System");
                results = true;
            }
        }
        if(results == false){
            System.out.println("This Was not in the System");
        }
        
    }
    
}
