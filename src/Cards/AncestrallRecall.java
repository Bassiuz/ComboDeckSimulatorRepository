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
public class AncestrallRecall extends Card{
    

    public AncestrallRecall()
    {
        this.setCardName("AncestrallRecall");
    }
    
    public void play(BelcherGame belcherGame)
    {
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setBlueMana(belcherGame.getBlueMana() - 1);
        belcherGame.drawCard();
        belcherGame.drawCard();
        belcherGame.drawCard();

    }
    
}
