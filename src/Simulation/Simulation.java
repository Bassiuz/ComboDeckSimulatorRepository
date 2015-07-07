package Simulation;

import Cards.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bash
 */
public class Simulation {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void simulateAncestrallLotusBolt()
    {
        int highestWins = 0;
        int winningLotusCount = 0;
        int winningBoltCount = 0;
        int winningAncestraalCount = 0;
        
        for(int bolt = 0; bolt < 60; bolt++)
        {
            for (int lotus = 0; lotus + bolt < 60; lotus ++)
            {
                int ancestrall = 60 - bolt - lotus;
                //System.out.println("ancestrall:" + Integer.toString(ancestrall));
                //System.out.println("bolt:" + Integer.toString(bolt));
               // System.out.println("lotus:" + Integer.toString(lotus));
                int win = 0;
        int lose = 0;
        int totalGames = 10000;
                for (int i = 0; i < totalGames; i++)
        {
            
            
            Game game = new Game();
            game.setCardsInDeck(getDeck(lotus,bolt,ancestrall));
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();

        if (doIWinTurnOneAncestrallLotusBolt(game))
        {
            win++;
        }
        else
        {
            lose++;        
        }
        }
        ///System.out.println("Total games won:" + Integer.toString(win));
        ///System.out.println("Total games lost:" + Integer.toString(lose));
        ///System.out.println("Percentage Games Won:" + Double.toString((win*100)/totalGames));
        
        if (win > highestWins)
        {
            highestWins = win;
            winningLotusCount = lotus;
            winningBoltCount = bolt;
            winningAncestraalCount = ancestrall;
        }
        
            }
        }
        
        
        System.out.println("Total games won with winning list:" + Integer.toString(highestWins));
        System.out.println("Ancestralls:" + Integer.toString(winningAncestraalCount));
        System.out.println("Bolts:" + Integer.toString(winningBoltCount));
        System.out.println("Lotus::" + Integer.toString(winningLotusCount));





    }
    
    public boolean doIWinTurnOneAncestrallLotusBolt(Game game)
    {
        return makeNextMoveAncestrallLotusBolt(game);
    }
    
    public boolean makeNextMoveAncestrallLotusBolt(Game game)
    {
        if (game.howManyCardsWithNameDoIHaveInHand("LightningBolt") > 6 && game.howManyCardsWithNameDoIHaveInHand("BlackLotus") > 2)
        {
            return true;
        }
        else if (game.getCardFromHandWithName("AncestrallRecall")!= null && game.getBlueMana() > 0 && game.getCardsInDeck().size() > 2)
        {
            AncestrallRecall a = (AncestrallRecall) game.getCardFromHandWithName("AncestrallRecall");
            a.play(game);
           //System.out.println("play Ancestrall Recall");

            return makeNextMoveAncestrallLotusBolt(game);
        }
        else if (game.getCardFromHandWithName("BlackLotus")!= null)
        {
            BlackLotus a = (BlackLotus) game.getCardFromHandWithName("BlackLotus");
            a.play(game);
            a.activate(game, Mana.BLUE);
            //System.out.println("play Black Lotus");

            return makeNextMoveAncestrallLotusBolt(game);
        }
        else
        {
            return false;
        }
    }
            
    
     public ArrayList<Card> getDeck(int BlackLotus, int LightningBolt, int AncestrallRecall)
     {
        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < BlackLotus; i++)
        {
                deck.add(new BlackLotus());

        }
        for (int i = 0; i < LightningBolt; i++)
        {
                deck.add(new LightningBolt());

        }
        for (int i = 0; i < AncestrallRecall; i++)
        {
                deck.add(new AncestrallRecall());

        }
        return deck;
     }

    
    public ArrayList<Card> getDeck()
    {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());        
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());        
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());        
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());
        deck.add(new BlackLotus());        
        deck.add(new BlackLotus());
        deck.add(new LightningBolt());        
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());        
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());        
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());        
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new LightningBolt());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        deck.add(new AncestrallRecall());
        return deck;
    }
    
}
