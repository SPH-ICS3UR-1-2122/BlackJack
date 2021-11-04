/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author SPH_SHSM
 */
public class Card {
    int value;
    String suit;
    
    String name;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
        String[] types = {"","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        this.name=types[value]+" of "+suit;
    }
    
    
    
}
