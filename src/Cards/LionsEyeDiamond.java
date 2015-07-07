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
public class LionsEyeDiamond extends Card {
    
    public LionsEyeDiamond()
    {
        this.setCardName("LionsEyeDiamond");
    }
    
        public void play(Game game)
    {
        //PAY MANA IN ALGORITHM
        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
    }
     
public void activate(Game game, Mana manaColorOfChoice)
    {
        game.getCardsInPlay().remove(this);
        game.getCardsInGraveyard().add(this);
        game.getCardsInGraveyard().addAll(game.getCardsInHand());
        game.getCardsInHand().clear();
        
         switch (manaColorOfChoice) {
            case BLACK:
                game.setBlackMana(game.getBlackMana() + 3);
                break;
                
            case BLUE:
                game.setBlueMana(game.getBlueMana() + 3);

                break;
                
            case GREEN:
                game.setGreenMana(game.getGreenMana() + 3);

                break;
                                
            case RED:
                game.setRedMana(game.getRedMana() + 3);

                break;
          
            case WHITE:
                game.setWhiteMana(game.getWhiteMana() + 3);

                break;
                                
            case COLORLESS:
                game.setColorlessMana(game.getColorlessMana() + 3);

                break;
                           
            default:
                break;
        }
    }
}
