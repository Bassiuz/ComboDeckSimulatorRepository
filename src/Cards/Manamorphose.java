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
public class Manamorphose extends Card {
    
    public Manamorphose()
    {
        this.setCardName("Manamorphose");
    }
    
    
    public void play(BelcherGame belcherGame, Mana manaColorOfChoice1, Mana manaColorOfChoice2)
    {        belcherGame.uppStormCount();

        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInGraveyard().add(this);
        
         switch (manaColorOfChoice1) {
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
         
         switch (manaColorOfChoice2) {
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
          return Mana.RED;
      }
    
}
