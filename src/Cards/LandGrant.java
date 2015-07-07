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
public class LandGrant extends Card {
    
    public LandGrant()
    {
        this.setCardName("LandGrant");
    }
    
        public void play(Game game)
    {        game.uppStormCount();

        //PAY MANA IN ALGORITHM
        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        
        
        Card c = null;
        for (Card card : game.getCardsInDeck())
        {
            if (card.getCardName().equals("Taiga"))
            {
                c = card;
            }
        }
        
        game.getCardsInHand().add(c);
        game.getCardsInDeck().remove(c);

    }
        public void playWithoutFindingAnything(Game game)
        {
            game.uppStormCount();
                game.getCardsInHand().remove(this);
                game.getCardsInGraveyard().add(this);
        }
        
                      @Override      public Mana getColor()
      {
          return Mana.GREEN;
      }
     
}
