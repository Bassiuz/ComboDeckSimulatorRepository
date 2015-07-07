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
public class GrimMonolith extends Card {
    
    boolean tap = false;
    
    public GrimMonolith()
    {
        this.setCardName("GrimMonolith");
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
        tap = true;
        game.setColorlessMana(game.getColorlessMana() + 3);
        
    }

    public boolean isTap() {
        return tap;
    }

    public void setTap(boolean tap) {
        this.tap = tap;
    }
    
    
    
}
