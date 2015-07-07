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
public class TinderWall extends Card {
    
    public TinderWall()
    {
        this.setCardName("TinderWall");
    }
    
    public void play(Game game)
    {        game.uppStormCount();

        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
        game.setGreenMana(game.getGreenMana() -1);
    }
    
    public void activate(Game game)
    {
        game.getCardsInPlay().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setRedMana(game.getRedMana() +2);
        
    }
    
              @Override      public Mana getColor()
      {
          return Mana.GREEN;
      }
    
}
