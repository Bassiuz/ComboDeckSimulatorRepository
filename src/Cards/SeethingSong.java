/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.Game;

/**
 *
 * @author Bash
 */
public class SeethingSong extends Card {
    
    public SeethingSong()
    {
        this.setCardName("SeethingSong");
    }
    
    public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setRedMana(game.getRedMana() + 2);
    }
}
