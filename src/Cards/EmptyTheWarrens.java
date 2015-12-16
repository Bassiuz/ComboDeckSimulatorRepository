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
public class EmptyTheWarrens extends Card {
    
    public EmptyTheWarrens()
    {
        this.setCardName("EmptyTheWarrens");
    }
    
    public int play(BelcherGame belcherGame)
    {
        belcherGame.uppStormCount();
        return belcherGame.getStormCount() * 2;
    }
    
      @Override      public Mana getColor()
      {
          return Mana.RED;
      }
}
