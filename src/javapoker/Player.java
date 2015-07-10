/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapoker;

/**
 *
 * @author Nick
 */
public class Player {
    Hand hand;

    Player(Deck deck) {
      hand = new Hand(deck);
      hand.showHand();
    }
    private Hand getHand(){  
        return hand;
    }
}
