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
public class AncestrallRecall extends Card{
    

    public AncestrallRecall()
    {
        this.setCardName("AncestrallRecall");
    }
    
    public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setBlueMana(game.getBlueMana() - 1);
        game.drawCard();
        game.drawCard();
        game.drawCard();

    }
    
}
