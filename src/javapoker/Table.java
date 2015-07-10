/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapoker;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Table {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Player> table;
    Deck deck;
    public void Deal(){
        deck = new Deck();
        deck.Shuffle();
        table = new ArrayList<Player>();
         for(int i = 0; i<5; i++){
        System.out.println("Player " + i + " has: ");
        Player player = new Player(deck);
        table.add(player);
    }
    }
    public static void main(String[] args) {
        Table table = new Table();
        table.Deal();
    }
    
}
