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
public class RiteOfFlame extends Card {
    
    public RiteOfFlame()
    {
        this.setCardName("RiteOfFlame");
    }
    
            public void play(Game game)
    {        
        
        game.uppStormCount();
        int riteOfFlameInBin = 1;
        for(Card card :game.getCardsInGraveyard())
        {
            if (card.getCardName().equals("RiteOfFlame"))
            {
                riteOfFlameInBin++;
            }
        }
        
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        game.setRedMana(game.getRedMana() + riteOfFlameInBin);
    }
            
                   @Override      public Mana getColor()
      {
          return Mana.RED;
      }       
    
}
