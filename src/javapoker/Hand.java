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
public class Hand {
    Card[] hand = new Card[5];
    Hand(Deck deck){
        
        for(int i = 0; i <5; i++){
            hand[i] = deck.dealCardFromDeck();
        }
    }
   public void showHand(){
      for(int i = 0; i <5; i++){
           System.out.println(hand[i].toString());
           
       }
       
   }
         
}
