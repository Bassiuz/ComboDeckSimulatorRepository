/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.BelcherGame;
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
    
    public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        //PAY MANA IN ALGORITHM
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
    }
    
    public boolean activate(BelcherGame belcherGame)
    {
        //ADD BELCHER LOGIC
        boolean stop = false;
        boolean taiga = false;
        ArrayList<Card> revealedCards = new ArrayList<Card>();
        while (!stop)
        {
            if (belcherGame.getCardsInDeck().size() > 0)
            {
                Card c = belcherGame.revealCardFromDeck();
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
                belcherGame.setBelcherActivatedButFailed(true);
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
                belcherGame.setBelcherActivatedButFailed(true);
                return false;
            }
        }
    }
    
          @Override      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
}
