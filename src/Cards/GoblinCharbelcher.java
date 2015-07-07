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
public class GoblinCharbelcher extends Card {
    
    public GoblinCharbelcher()
    {
        this.setCardName("GoblinCharbelcher");
    }
    
    public void play(Game game)
    {
        //PAY MANA IN ALGORITHM
        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
    }
    
    public void activate(Game game)
    {
        //ADD BELCHER LOGIC
        
    }
    
}
