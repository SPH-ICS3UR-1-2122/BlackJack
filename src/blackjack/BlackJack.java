/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author SPH_SHSM
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Card> deck = new ArrayList<>();
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(new Card(i, suits[j]));
            }
        }
        Shuffle(deck);
        Player p=new Player();
        Player dealer=new Player();
        for (int i = 0; i < 2; i++) {
            p.Hit(deck);
            dealer.Hit(deck);
        }
        System.out.println();
    }

    public static void Shuffle(ArrayList<Card> d) {
        Random rnd = new Random();
        //Loop through every card.
        for (int i = 0; i < d.size(); i++) {
            //Swap the card with the card at a different random position.
            int pos = rnd.nextInt(d.size());
            Card temp = d.get(i);
            d.set(i, d.get(pos));
            d.set(pos, temp);
        }
    }
}
