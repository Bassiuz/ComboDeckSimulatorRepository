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
public class BurningWish extends Card {
    
    public BurningWish()
    {
        this.setCardName("BurningWish");
    }
    
        
    public void play(Game game)
    {        
        game.getCardsInHand().remove(this);
        game.getCardsInExile().add(this);
        game.getCardsInHand().add(new EmptyTheWarrens());

    }
    
     @Override      public Mana getColor()
      {
          return Mana.RED;
      }
    
}
