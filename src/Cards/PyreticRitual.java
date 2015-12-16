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
public class PyreticRitual extends Card {
    
    public PyreticRitual()
    {
        this.setCardName("PyreticRitual");
    }
    
        public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setRedMana(belcherGame.getRedMana() + 1);
    }
        
                  @Override      public Mana getColor()
      {
          return Mana.RED;
      }
    
}
