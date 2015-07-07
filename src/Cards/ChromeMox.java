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
public class ChromeMox extends Card {
    
    Mana manacolor = null;
    boolean tap = false;
    
    public ChromeMox()
    {
        this.setCardName("ChromeMox");
    }
    
     public void play(Game game, Card card, Mana manaColorOfChoice)
    {
        game.getCardsInHand().remove(this);
        game.getCardsInPlay().add(this);
        game.getCardsInHand().remove(card);
        game.getCardsInExile().add(card);
        game.uppStormCount();
        manacolor = manaColorOfChoice;
    }
     
     public void playWithoutImprint(Game game)
     {
         game.getCardsInHand().remove(this);
         game.getCardsInPlay().add(this);
         game.uppStormCount();
     }
    
    public void activate(Game game)
    {
            tap = true;
        
         switch (manacolor) {
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
