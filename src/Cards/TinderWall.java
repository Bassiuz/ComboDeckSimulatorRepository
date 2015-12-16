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
public class TinderWall extends Card {
    
    public TinderWall()
    {
        this.setCardName("TinderWall");
    }
    
    public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
        belcherGame.setGreenMana(belcherGame.getGreenMana() -1);
    }
    
    public void activate(BelcherGame belcherGame)
    {
        belcherGame.getCardsInPlay().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setRedMana(belcherGame.getRedMana() +2);
        
    }
    
              @Override      public Mana getColor()
      {
          return Mana.GREEN;
      }
    
}
