/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.Game;
import Simulation.Mana;
import java.util.ArrayList;

/**
 *
 * @author Bash
 */
public class GoblinCharbelcher extends Card {
    
    public GoblinCharbelcher()
    {
        this.setCardName("GoblinCharbelcher");
    }
    
    public void play(Game game)
    {        game.uppStormCount();

        //PAY MANA IN ALGORITHM
        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
    }
    
    public boolean activate(Game game)
    {
        //ADD BELCHER LOGIC
        boolean stop = false;
        boolean taiga = false;
        ArrayList<Card> revealedCards = new ArrayList<Card>();
        while (!stop)
        {
            if (game.getCardsInDeck().size() > 0)
            {
                Card c = game.revealCardFromDeck();
                revealedCards.add(c);
                
                if (c.getCardName().equals("Taiga"))
                {
                    taiga = true;
                    stop = true;
                }
            }
            else
            {
                stop = true;
            }
        }
        
        if (taiga)
        {
            if (revealedCards.size() > 9)
            {
                return true;
            }
            else
            {
                game.setBelcherActivatedButFailed(true);
                return false;
              
            }
        }
        else
        {
            if (revealedCards.size() > 19)
            {
                return true;
            }
            else
            {
                game.setBelcherActivatedButFailed(true);
                return false;
            }
        }
    }
    
          @Override      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
}
