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
public class ChromeMox extends Card {
    
    Mana manacolor = null;
    boolean tap = false;
    
    public ChromeMox()
    {
        this.setCardName("ChromeMox");
    }
    
     public void play(BelcherGame belcherGame, Card card, Mana manaColorOfChoice)
    {
        belcherGame.getCardsInHand().remove(this);
        belcherGame.getCardsInPlay().add(this);
        belcherGame.getCardsInHand().remove(card);
        belcherGame.getCardsInExile().add(card);
        belcherGame.uppStormCount();
        manacolor = manaColorOfChoice;
    }
     
     public void playWithoutImprint(BelcherGame belcherGame)
     {
         belcherGame.getCardsInHand().remove(this);
         belcherGame.getCardsInPlay().add(this);
         belcherGame.uppStormCount();
     }
    
    public void activate(BelcherGame belcherGame)
    {
            tap = true;
        
         switch (manacolor) {
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

    public Mana getManacolor() {
        return manacolor;
    }

    public void setManacolor(Mana manacolor) {
        this.manacolor = manacolor;
    }
    
      @Override
      public Mana getColor()
      {
          return Mana.COLORLESS;
      }
    
    
}
