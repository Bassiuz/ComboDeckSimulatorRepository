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
public class Taiga extends Card {
    
    boolean tap = false;
    
    public Taiga()
    {
        this.setCardName("Taiga");
    }
    
     public void play(BelcherGame belcherGame)
    {
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
    }
    
    public void activate(BelcherGame belcherGame, Mana manaColorOfChoice)
    {
        tap = true;
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
