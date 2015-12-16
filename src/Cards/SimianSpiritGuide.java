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
public class SimianSpiritGuide extends Card {
    
    public SimianSpiritGuide()
    {
        this.setCardName("SimianSpiritGuide");
    }
    
    public void play(BelcherGame belcherGame)
    {
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInExile().add(this);
        belcherGame.setRedMana(belcherGame.getRedMana() + 1);
    }
    
              @Override      public Mana getColor()
      {
          return Mana.RED;
      }
}
