/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.Game;
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
    
        public void playForMana(Game game)
    {        game.uppStormCount();

        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setBlueMana(game.getBlueMana() -1);
        game.drawCard();
    }
        
    public void playForLife(Game game)
    {        game.uppStormCount();

        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setLifeTotal(game.getLifeTotal() - 2);
        game.drawCard();
    }
    
          @Override      public Mana getColor()
      {
          return Mana.BLUE;
      }
}
