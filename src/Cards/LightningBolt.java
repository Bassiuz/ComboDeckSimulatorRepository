/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.BelcherGame;

/**
 *
 * @author Bash
 */
public class LightningBolt extends Card{
    
    public LightningBolt()
    {
        this.setCardName("LightningBolt");
    }
    
    public void play(BelcherGame belcherGame)
    {
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setRedMana(belcherGame.getRedMana() - 1);
        belcherGame.setOpponentLifeTotal(belcherGame.getOpponentLifeTotal() - 3);
    }

}
