package com.pluralsight;

import java.util.Scanner;

public class Main {
   static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand dealerHand = new Hand();
        deck.shuffle();

        System.out.print("Please enter your name: ");
        String player1 = keyboard.nextLine();

        hand1.deal(deck.deal());
        dealerHand.deal(deck.deal());

// deal 5 cards
        for(int i = 0; i < 5; i++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand1.deal(deck.deal());
            dealerHand.deal(deck.deal());
        }



        int playerHandValue = hand1.getValue();
        System.out.println("The player hand is worth " + playerHandValue);

        int dealerHandValue = dealerHand.getValue();
        System.out.println("Dealers hand is worth " + dealerHandValue);

        if(playerHandValue > dealerHandValue) {
            System.out.println(String.format("%s Won!", player1));
        } else {
            System.out.println("Dealer Won!");
        }
    }
}