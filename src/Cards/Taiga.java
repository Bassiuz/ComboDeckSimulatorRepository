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
public class Taiga extends Card {
    
    boolean tap = false;
    
    public Taiga()
    {
        this.setCardName("Taiga");
    }
    
     public void play(Game game)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
    }
    
    public void activate(Game game, Mana manaColorOfChoice)
    {
        tap = true;
         switch (manaColorOfChoice) {
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

    public boolean isTap() {
        return tap;
    }

    public void setTap(boolean tap) {
        this.tap = tap;
    }
    
        @Override      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
    
    
    
}
