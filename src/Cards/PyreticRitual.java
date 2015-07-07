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
public class PyreticRitual extends Card {
    
    public PyreticRitual()
    {
        this.setCardName("PyreticRitual");
    }
    
        public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setRedMana(game.getRedMana() + 1);
    }
    
}
