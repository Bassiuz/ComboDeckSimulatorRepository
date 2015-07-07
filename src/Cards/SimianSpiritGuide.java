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
public class SimianSpiritGuide extends Card {
    
    public SimianSpiritGuide()
    {
        this.setCardName("SimianSpiritGuide");
    }
    
    public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInExile().add(this);
        game.setGreenMana(game.getRedMana() + 1);
    }
}
