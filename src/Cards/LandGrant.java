/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import Simulation.Game;

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
    {
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
     
}
