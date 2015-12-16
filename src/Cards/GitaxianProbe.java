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
public class GitaxianProbe extends Card {
    
    public GitaxianProbe()
    {
        this.setCardName("GitaxianProbe");
    }
    
        public void playForMana(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setBlueMana(belcherGame.getBlueMana() -1);
        belcherGame.drawCard();
    }
        
    public void playForLife(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setLifeTotal(belcherGame.getLifeTotal() - 2);
        belcherGame.drawCard();
    }
    
          @Override      public Mana getColor()
      {
          return Mana.BLUE;
      }
}
