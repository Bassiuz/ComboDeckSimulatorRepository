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
public class Manamorphose extends Card {
    
    public Manamorphose()
    {
        this.setCardName("Manamorphose");
    }
    
    
    public void play(Game game, Mana manaColorOfChoice1, Mana manaColorOfChoice2)
    {        game.uppStormCount();

        game.getCardsInHand().remove(this);
        game.getCardsInGraveyard().add(this);
        
         switch (manaColorOfChoice1) {
            case BLACK:
                game.setBlackMana(game.getBlackMana() + 1);
                break;
                
            case BLUE:
                game.setBlueMana(game.getBlueMana() + 1);

                break;
                
            case GREEN:
                game.setGreenMana(game.getGreenMana() + 1);

                break;
                                
            case RED:
                game.setRedMana(game.getRedMana() + 1);

                break;
          
            case WHITE:
                game.setWhiteMana(game.getWhiteMana() + 1);

                break;
                                
            case COLORLESS:
                game.setColorlessMana(game.getColorlessMana() + 1);

                break;
                           
            default:
                break;
        }
         
         switch (manaColorOfChoice2) {
            case BLACK:
                game.setBlackMana(game.getBlackMana() + 1);
                break;
                
            case BLUE:
                game.setBlueMana(game.getBlueMana() + 1);

                break;
                
            case GREEN:
                game.setGreenMana(game.getGreenMana() + 1);

                break;
                                
            case RED:
                game.setRedMana(game.getRedMana() + 1);

                break;
          
            case WHITE:
                game.setWhiteMana(game.getWhiteMana() + 1);

                break;
                                
            case COLORLESS:
                game.setColorlessMana(game.getColorlessMana() + 1);

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
