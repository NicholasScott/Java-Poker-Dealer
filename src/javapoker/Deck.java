/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapoker;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nick
 */
public class Deck {
    private ArrayList<Card> cards;
    
    Deck(){
        cards = new ArrayList<Card>();
        for(int suit =0; suit<=3; suit++)
        {
            for(int rank=0;rank<=12; rank++){
                cards.add(new Card(suit,rank));
            }
        }
    }
    public void Shuffle(){
        Collections.shuffle(cards);
    }
    public Card dealCardFromDeck(){
        return cards.remove(0);
    }
    public int getRemainingCards()
    {
        return cards.size();
    }
}
