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
public class LandGrant extends Card {
    
    public LandGrant()
    {
        this.setCardName("LandGrant");
    }
    
        public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        //PAY MANA IN ALGORITHM
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        
        
        Card c = null;
        for (Card card : belcherGame.getCardsInDeck())
        {
            if (card.getCardName().equals("Taiga"))
            {
                c = card;
            }
        }
        
        belcherGame.getCardsInHand().add(c);
        belcherGame.getCardsInDeck().remove(c);

    }
        public void playWithoutFindingAnything(BelcherGame belcherGame)
        {
            belcherGame.uppStormCount();
                belcherGame.getCardsInHand().remove(this);
                belcherGame.getCardsInGraveyard().add(this);
        }
        
                      @Override      public Mana getColor()
      {
          return Mana.GREEN;
      }
     
}
