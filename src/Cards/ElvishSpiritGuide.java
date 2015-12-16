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
public class ElvishSpiritGuide extends Card {
    
    public ElvishSpiritGuide()
    {
        this.setCardName("ElvishSpiritGuide");
    }
    
        public void play(BelcherGame belcherGame)
    {       
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInExile().add(this);
        belcherGame.setGreenMana(belcherGame.getGreenMana() + 1);
    }
        
      
        @Override      public Mana getColor()
      {
          return Mana.GREEN;
      }
    
}
