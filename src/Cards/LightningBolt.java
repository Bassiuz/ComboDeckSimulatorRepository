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
public class LightningBolt extends Card{
    
    public LightningBolt()
    {
        this.setCardName("LightningBolt");
    }
    
    public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setRedMana(game.getRedMana() - 1);
        game.setOpponentLifeTotal(game.getOpponentLifeTotal() - 3);
    }

}
