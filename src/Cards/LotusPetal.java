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
public class LotusPetal extends Card {
    
    public LotusPetal()
    {
        this.setCardName("LotusPetal");
    }
    
        public void play(BelcherGame belcherGame)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
    }
    
    public void activate(BelcherGame belcherGame, Mana manaColorOfChoice)
    {
        belcherGame.getCardsInPlay().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        
         switch (manaColorOfChoice) {
            case BLACK:
                belcherGame.setBlackMana(belcherGame.getBlackMana() + 1);
                break;
                
            case BLUE:
                belcherGame.setBlueMana(belcherGame.getBlueMana() + 1);

                break;
                
            case GREEN:
                belcherGame.setGreenMana(belcherGame.getGreenMana() + 1);

                break;
                                
            case RED:
                belcherGame.setRedMana(belcherGame.getRedMana() + 1);

                break;
          
            case WHITE:
                belcherGame.setWhiteMana(belcherGame.getWhiteMana() + 1);

                break;
                                
            case COLORLESS:
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() + 1);

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
