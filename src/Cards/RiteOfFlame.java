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
public class RiteOfFlame extends Card {
    
    public RiteOfFlame()
    {
        this.setCardName("RiteOfFlame");
    }
    
            public void play(BelcherGame belcherGame)
    {        
        
        belcherGame.uppStormCount();
        int riteOfFlameInBin = 1;
        for(Card card : belcherGame.getCardsInGraveyard())
        {
            if (card.getCardName().equals("RiteOfFlame"))
            {
                riteOfFlameInBin++;
            }
        }
        
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.setRedMana(belcherGame.getRedMana() + riteOfFlameInBin);
    }
            
                   @Override      public Mana getColor()
      {
          return Mana.RED;
      }       
    
}
