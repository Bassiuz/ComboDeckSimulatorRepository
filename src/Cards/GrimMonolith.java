/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.BelcherGame;
import Simulation.Mana;

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
    
    public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        //PAY MANA IN ALGORITHM
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
    }
     
    public void activate(BelcherGame belcherGame)
    {
        //ADD BELCHER LOGIC
        tap = true;
        belcherGame.setColorlessMana(belcherGame.getColorlessMana() + 3);
        
    }

    public boolean isTap() {
        return tap;
    }

    public void setTap(boolean tap) {
        this.tap = tap;
    }
    
              @Override      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
    
}
