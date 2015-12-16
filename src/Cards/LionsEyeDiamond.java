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
public class LionsEyeDiamond extends Card {
    
    public LionsEyeDiamond()
    {
        this.setCardName("LionsEyeDiamond");
    }
    
        public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        //PAY MANA IN ALGORITHM
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
    }
     
public void activate(BelcherGame belcherGame, Mana manaColorOfChoice)
    {
        belcherGame.getCardsInPlay().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        belcherGame.getCardsInGraveyard().addAll(belcherGame.getCardsInHand());
        belcherGame.getCardsInHand().clear();
        
         switch (manaColorOfChoice) {
            case BLACK:
                belcherGame.setBlackMana(belcherGame.getBlackMana() + 3);
                break;
                
            case BLUE:
                belcherGame.setBlueMana(belcherGame.getBlueMana() + 3);

                break;
                
            case GREEN:
                belcherGame.setGreenMana(belcherGame.getGreenMana() + 3);

                break;
                                
            case RED:
                belcherGame.setRedMana(belcherGame.getRedMana() + 3);

                break;
          
            case WHITE:
                belcherGame.setWhiteMana(belcherGame.getWhiteMana() + 3);

                break;
                                
            case COLORLESS:
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() + 3);

                break;
                           
            default:
                break;
        }
    }

              @Override      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
}
