/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;
import java.util.*;
/**
 *
 * @author SPH_SHSM
 */
public class Player {
    ArrayList<Card> hand;
    int handTotal;

    public Player() {
        this.hand=new ArrayList<>();
    }
    
    public void Hit(ArrayList<Card> d){
        this.hand.add(d.remove(0));
    }
    
    
    
}
