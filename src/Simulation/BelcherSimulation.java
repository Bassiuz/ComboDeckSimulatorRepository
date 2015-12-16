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
public class BelcherSimulation {
    
    public void simulateBelcher()
    {
        double win = 0;
        int lose = 0;
        int noGoblins = 0;
        int twoGoblins = 0;
        int fourGoblins = 0;
        int sixGoblins = 0;
        int eightGoblins = 0;
        int tenGoblins = 0;
        int twelveGoblins = 0;
        int fourteenGoblins = 0;
        int sixteenGoblins = 0;
        int eighteenGoblins = 0;
        int twentyormoreGoblins = 0;
        int belcherFails = 0;

                double totalGames = 100000;

                for (double i = 0; i < totalGames; i++) {

                    BelcherGame belcherGame = new BelcherGame();
                    //belcherGame.setCardsInDeck(getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose));
                    belcherGame.setCardsInDeck(getBelcherDeck(3,4,4,0  ,4,4,4,4,4,4,4,4,1,3,4,4,4,1)); //list from starcitygames
                    /// no empty belcherGame.setCardsInDeck(getBelcherDeck(4,4,0,4  ,4,4,4,4,4,4,4,4,1,0,4,4,4,3));
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();

                    if (doIWinTurnOneBelcher(belcherGame)) {
                        win++;
                    } else {
                        lose++;
                    }
                    if (belcherGame.getGoblinTokens() == 0)
                    {
                        noGoblins++;
                    } else if (belcherGame.getGoblinTokens() == 2)
                    {
                        twoGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 4)
                    {
                        fourGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 6)
                    {
                        sixGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 8)
                    {
                        eightGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 10)
                    {
                        tenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 12)
                    {
                        twelveGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 14)
                    {
                        fourteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 16)
                    {
                        sixteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 18)
                    {
                        eighteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() >= 20)
                    {
                        twentyormoreGoblins++;
                    }
                    
                    if (belcherGame.isBelcherActivatedButFailed())
                    {
                        belcherFails++;
                    }
                }
                
                System.out.println("Total games won:" + Double.toString(win));
                System.out.println("Total games lost:" + Integer.toString(lose));
                System.out.println("BelcherFails:" + Integer.toString(belcherFails));
                System.out.println("Percentage Games Won:" + Double.toString((win*100)/totalGames));
                System.out.println("Times no goblins made:" + Integer.toString(noGoblins));
                System.out.println("Times 2 goblins made:" + Integer.toString(twoGoblins));
                System.out.println("Times 4 goblins made:" + Integer.toString(fourGoblins));
                System.out.println("Times 6 goblins made:" + Integer.toString(sixGoblins));
                System.out.println("Times 8 goblins made:" + Integer.toString(eightGoblins));
                System.out.println("Times 10 goblins made:" + Integer.toString(tenGoblins));
                System.out.println("Times 12 goblins made:" + Integer.toString(twelveGoblins));
                System.out.println("Times 14 goblins made:" + Integer.toString(fourteenGoblins));
                System.out.println("Times 16 goblins made:" + Integer.toString(sixteenGoblins));
                System.out.println("Times 18 goblins made:" + Integer.toString(eighteenGoblins));
                System.out.println("Times 20+ goblins made:" + Integer.toString(twentyormoreGoblins));


                
    }
    
    public void simulateBelcherWithMulligan()
    {
        int totalGames = 1000;
        ArrayList<Double> percentageGamesWon = new ArrayList<Double>();
        ArrayList<Double> averageGoblinsMade = new ArrayList<Double>();

        
        
        
        for (int i = 1; i < 7; i++) {
            int win = 0;
            int lose = 0;
             int noGoblins = 0;
          int twoGoblins = 0;
        int fourGoblins = 0;
        int sixGoblins = 0;
        int eightGoblins = 0;
        int tenGoblins = 0;
        int twelveGoblins = 0;
        int fourteenGoblins = 0;
        int sixteenGoblins = 0;
        int eighteenGoblins = 0;
        int twentyormoreGoblins = 0;
        int totalGoblins = 0;
        int belcherFails = 0;
            
                for (int g = 0; g < totalGames; g++) {

                    BelcherGame belcherGame = new BelcherGame();
                    //belcherGame.setCardsInDeck(getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose));
                    belcherGame.setCardsInDeck(getBelcherDeck(3,4,4,0  ,4,4,4,4,4,4,4,4,1,3,4,4,4,1)); //list from starcitygames
                    /// no empty belcherGame.setCardsInDeck(getBelcherDeck(4,4,0,4  ,4,4,4,4,4,4,4,4,1,0,4,4,4,3));
                    
                    for (int j = 0; j < i; j++) {
                    belcherGame.drawCard();
                    }


                    if (doIWinTurnOneBelcher(belcherGame)) {
                        win++;
                    } else {
                        lose++;
                    }
                    totalGoblins = totalGoblins + belcherGame.getGoblinTokens();
                    
                    if (belcherGame.getGoblinTokens() == 0)
                    {
                        noGoblins++;
                    } else if (belcherGame.getGoblinTokens() == 2)
                    {
                        twoGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 4)
                    {
                        fourGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 6)
                    {
                        sixGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 8)
                    {
                        eightGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 10)
                    {
                        tenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 12)
                    {
                        twelveGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 14)
                    {
                        fourteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 16)
                    {
                        sixteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() == 18)
                    {
                        eighteenGoblins++;
                    }else if (belcherGame.getGoblinTokens() >= 20)
                    {
                        twentyormoreGoblins++;
                    }
                    
                    if (belcherGame.isBelcherActivatedButFailed())
                    {
                        belcherFails++;
                    }
                }
                
                System.out.println("Percentage Games Won:" + Double.toString((win*100)/totalGames));
                System.out.println("Average Amount Goblins:" + Double.toString(totalGoblins/totalGames));

                
        }       
    }
    
    public int simulateBelcherWithHand(ArrayList<Card> hand)
    {
        int amountWins = 0;
        
        return amountWins;
    }
    
    

    public void simulateMassBelcher() {
        ArrayList<Card> winningDeck = new ArrayList<Card>();
        int highestWins = 0;

        for (int ChromeMox = 4; ChromeMox <= 4; ChromeMox++) {
            for (int GoblinCharbelcher = 4; GoblinCharbelcher <= 4; GoblinCharbelcher++) {
                for (int BurningWish = 0; BurningWish <= 4; BurningWish++) {
                    for (int GrimMonolith = 0; GrimMonolith <= 4; GrimMonolith++) {
                        for (int LionsEyeDiamond = 0; LionsEyeDiamond <= 4; LionsEyeDiamond++) {
                            for (int LotusPetal = 4; LotusPetal <= 4; LotusPetal++) {
                                for (int ElvishSpiritGuide = 4; ElvishSpiritGuide <= 4; ElvishSpiritGuide++) {
                                    for (int SimianSpiritGuide = 4; SimianSpiritGuide <= 4; SimianSpiritGuide++) {
                                        for (int TinderWall = 0; TinderWall <= 4; TinderWall++) {
                                            for (int DesperateRitual = 0; DesperateRitual <= 4; DesperateRitual++) {
                                                for (int PyreticRitual = 0; PyreticRitual <= 4; PyreticRitual++) {
                                                    for (int SeethingSong = 4; SeethingSong <= 4; SeethingSong++) {
                                                        for (int Taiga = 0; Taiga <= 2; Taiga++) {
                                                            for (int EmptyTheWarrens = 0; EmptyTheWarrens <= 3; EmptyTheWarrens++) {
                                                                for (int LandGrant = 0; LandGrant <= 4; LandGrant++) {
                                                                    for (int GitaxianProbe = 0; GitaxianProbe <= 4; GitaxianProbe++) {
                                                                        for (int RiteOfFlame = 0; RiteOfFlame <= 4; RiteOfFlame++) {
                                                                            for (int Manamorphose = 0; Manamorphose <= 4; Manamorphose++) {
                                                                                ArrayList<Card> deck = getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose);
                                                                                if (deck.size() == 60)
                                                                                {
                                                                                    int win = 0;
                int lose = 0;
                int totalGames = 1000;
                for (int i = 0; i < totalGames; i++) {

                    BelcherGame belcherGame = new BelcherGame();
                    belcherGame.setCardsInDeck(getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose));
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();

                    if (doIWinTurnOneBelcher(belcherGame)) {
                        win++;
                    } else {
                        lose++;
                    }
                }
                ///System.out.println("Total games won:" + Integer.toString(win));
                ///System.out.println("Total games lost:" + Integer.toString(lose));
                ///System.out.println("Percentage Games Won:" + Double.toString((win*100)/totalGames));

                if (win > highestWins) {
                    highestWins = win;
                    winningDeck = deck;
                }
                                                                                }
                                                                                else
                                                                                {
                                                                                    ///System.out.println(Integer.toString(deck.size()));
                                                                                    //do not simulate
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
         System.out.println("most games won:" + Integer.toString(highestWins));
         System.out.println("winning deck:" + winningDeck.toString());

//        int win = 0;
//        int lose = 0;
//        int totalGames = 10000;
//        for (int i = 0; i < totalGames; i++) {
//
//            BelcherGame game = new BelcherGame();
//            game.setCardsInDeck(getBelcherDeck(4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4, 4, 1, 3, 4, 2, 4, 2));
//            game.drawCard();
//            game.drawCard();
//            game.drawCard();
//            game.drawCard();
//            game.drawCard();
//            game.drawCard();
//            game.drawCard();
//
//            if (doIWinTurnOneBelcher(game)) {
//                win++;
//            } else {
//                lose++;
//            }
//        }
//        System.out.println("Total games won:" + Integer.toString(win));
//        System.out.println("Total games lost:" + Integer.toString(lose));
//        System.out.println("Percentage Games Won:" + Double.toString((win * 100) / totalGames));

    }
    
    public int cardsPossibleAfterTotal(int total)
    {
        if (total < 57)
        {
            return 4;
        }
        else if (total < 61)
        {
           return 60 - total;
        }
        else
        {
            return 0;
        }
    }

    public boolean doIWinTurnOneBelcher(BelcherGame belcherGame) {
        return makeNextMoveBelcher(belcherGame);
    }

    public boolean makeNextMoveBelcher(BelcherGame belcherGame) {
        if (!belcherGame.isTriedToPlayLandGrant() && belcherGame.getCardFromHandWithName("LandGrant") != null) {
            if (belcherGame.isLandDropMade() || belcherGame.getCardFromHandWithName("Taiga") != null) {
                if (belcherGame.getCardFromHandWithName("ChromeMox") != null) {
                    ChromeMox c = (ChromeMox) belcherGame.getCardFromHandWithName("ChromeMox");
                    c.play(belcherGame, belcherGame.getCardFromHandWithName("LandGrant"), Mana.GREEN);
                    c.activate(belcherGame);
                    System.out.println("play:" + "ChromeMox");
                    System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
                    return makeNextMoveBelcher(belcherGame);
                } else {
                    belcherGame.setTriedToPlayLandGrant(true);
                    return makeNextMoveBelcher(belcherGame);
                }
            } else {
                ((LandGrant) belcherGame.getCardFromHandWithName("LandGrant")).play(belcherGame);
                System.out.println("play:" + "LandGrant");
                return makeNextMoveBelcher(belcherGame);

            }

        } else if (belcherGame.getCardFromHandWithName("LionsEyeDiamond") != null) {
            LionsEyeDiamond c = (LionsEyeDiamond) belcherGame.getCardFromHandWithName("LionsEyeDiamond");
            c.play(belcherGame);
            System.out.println("play:" + "LionsEyeDiamond");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("TinderWall") != null && belcherGame.getGreenMana() > 0) {
            TinderWall c = (TinderWall) belcherGame.getCardFromHandWithName("TinderWall");
            c.play(belcherGame);
            c.activate(belcherGame);
            System.out.println("play:" + "TinderWall");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("SimianSpiritGuide") != null) {
            ((SimianSpiritGuide) belcherGame.getCardFromHandWithName("SimianSpiritGuide")).play(belcherGame);
            System.out.println("play:" + "SimianSpiritGuide");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("ElvishSpiritGuide") != null) {
            ((ElvishSpiritGuide) belcherGame.getCardFromHandWithName("ElvishSpiritGuide")).play(belcherGame);
            System.out.println("play:" + "ElvishSpiritGuide");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("GitaxianProbe") != null && belcherGame.getLifeTotal() > 2) {
            GitaxianProbe c = (GitaxianProbe) belcherGame.getCardFromHandWithName("GitaxianProbe");
            c.playForLife(belcherGame);
            System.out.println("play:" + "GitaxianProbe");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("Manamorphose") != null && belcherGame.getTotalMana() > 1 && (belcherGame.getGreenMana() > 0 || belcherGame.getRedMana() > 0)) {
            Manamorphose c = (Manamorphose) belcherGame.getCardFromHandWithName("Manamorphose");

            if (belcherGame.getColorlessMana() > 0) {
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() - 1);
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
            } else {
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
            }
            Mana mana1 = null;
            if (belcherGame.getRedMana() > 0) {
                mana1 = Mana.GREEN;
            } else {
                mana1 = Mana.RED;
            }
            c.play(belcherGame, mana1, Mana.RED);
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            System.out.println("play:" + "Manamorphose");
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("Taiga") != null) {
            Taiga c = (Taiga) belcherGame.getCardFromHandWithName("Taiga");
            c.play(belcherGame);
            belcherGame.setLandDropMade(true);
            if (belcherGame.getRedMana() > 0) {
                c.activate(belcherGame, Mana.GREEN);
            } else {
                c.activate(belcherGame, Mana.RED);
            }

            System.out.println("play:" + "Taiga");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("LotusPetal") != null) {
            LotusPetal c = (LotusPetal) belcherGame.getCardFromHandWithName("LotusPetal");
            c.play(belcherGame);
            if (belcherGame.getRedMana() > 0) {
                c.activate(belcherGame, Mana.GREEN);
            } else {
                c.activate(belcherGame, Mana.RED);
            }

            System.out.println("play:" + "LotusPetal");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("PyreticRitual") != null && belcherGame.getRedMana() > 0 && belcherGame.getTotalMana() > 1) {
            PyreticRitual c = (PyreticRitual) belcherGame.getCardFromHandWithName("PyreticRitual");
            c.play(belcherGame);
            System.out.println("play:" + "PyreticRitual");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("DesperateRitual") != null && belcherGame.getRedMana() > 0 && belcherGame.getTotalMana() > 1) {
            DesperateRitual c = (DesperateRitual) belcherGame.getCardFromHandWithName("DesperateRitual");
            c.play(belcherGame);
            System.out.println("play:" + "DesperateRitual");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));

            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("SeethingSong") != null && belcherGame.getRedMana() > 0 && belcherGame.getTotalMana() > 2) {
            SeethingSong c = (SeethingSong) belcherGame.getCardFromHandWithName("SeethingSong");
            c.play(belcherGame);
            System.out.println("play:" + "SeethingSong");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));

            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("RiteOfFlame") != null && belcherGame.getRedMana() > 0) {
            RiteOfFlame c = (RiteOfFlame) belcherGame.getCardFromHandWithName("RiteOfFlame");

            c.play(belcherGame);
            System.out.println("play:" + "RiteOfFlame");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("GrimMonolith") != null && belcherGame.getTotalMana() > 1) {
            GrimMonolith c = (GrimMonolith) belcherGame.getCardFromHandWithName("GrimMonolith");

            if (belcherGame.getColorlessMana() > 1) {
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() - 2);
            } else if (belcherGame.getColorlessMana() == 1) {
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() - 1);
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
            } else {
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
                if (belcherGame.getRedMana() > 1 && belcherGame.getGreenMana() > 0) {
                    belcherGame.setRedMana(belcherGame.getRedMana() - 1);
                } else {
                    belcherGame.setGreenMana(belcherGame.getGreenMana() - 1);
                }
            }

            c.play(belcherGame);
            c.activate(belcherGame);
            System.out.println("play:" + "GrimMonolith");
            System.out.println("TotalMana: " + Integer.toString(belcherGame.getTotalMana()));
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("GoblinCharbelcher") != null && belcherGame.getTotalMana() > 6) {
            GoblinCharbelcher c = (GoblinCharbelcher) belcherGame.getCardFromHandWithName("GoblinCharbelcher");
            c.play(belcherGame);
            System.out.println("play:" + "GoblinCharbelcher");
            return c.activate(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("GoblinCharbelcher") != null && belcherGame.getTotalMana() > 3 && belcherGame.getCardFromPlayWithName("LionsEyeDiamond") != null) {
            GoblinCharbelcher c = (GoblinCharbelcher) belcherGame.getCardFromHandWithName("GoblinCharbelcher");
            c.play(belcherGame);
            System.out.println("play:" + "GoblinCharbelcher");
            return c.activate(belcherGame);
        } else if (!belcherGame.isTriedToPlayChromeMox() && belcherGame.getCardFromHandWithName("ChromeMox") != null) {
            System.out.println("play:" + "ChromeMox");
            ChromeMox c = (ChromeMox) belcherGame.getCardFromHandWithName("ChromeMox");
            boolean win = false;
            int mostGoblinTokens = 0;
            for (Card card : belcherGame.getCardsInHand()) {
                if (card.getColor() != Mana.COLORLESS) {
                    BelcherGame subgame = new BelcherGame(belcherGame);
                    System.out.println("exile to chrome mox:" + card.getCardName());

                    c.play(subgame, card, card.getColor());
                    c.activate(subgame);
                    if (makeNextMoveBelcher(subgame)) {
                        win = true;
                    }
                    if (subgame.getGoblinTokens() > mostGoblinTokens) {
                        mostGoblinTokens = subgame.getGoblinTokens();
                    }
                }
            }
            if (win) {
                return true;
            } else {
                belcherGame.setGoblinTokens(mostGoblinTokens);
                belcherGame.setTriedToPlayChromeMox(true);
                return makeNextMoveBelcher(belcherGame);
            }

        } else if (belcherGame.getCardFromHandWithName("BurningWish") != null && belcherGame.getRedMana() > 1 && belcherGame.getTotalMana() > 5 && belcherGame.getCardFromPlayWithName("LionsEyeDiamond") != null) {

            if (belcherGame.getColorlessMana() > 0) {
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() - 1);
                belcherGame.setRedMana(belcherGame.getRedMana() - 1);
            } else {
                belcherGame.setRedMana(belcherGame.getRedMana() - 2);
            }

            belcherGame.setRedMana(belcherGame.getRedMana() + 3);

            BurningWish c = (BurningWish) belcherGame.getCardFromHandWithName("BurningWish");
            c.play(belcherGame);
            System.out.println("play:" + "BurningWish");
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("BurningWish") != null && belcherGame.getRedMana() > 1 && belcherGame.getTotalMana() > 2) {

            if (belcherGame.getColorlessMana() > 0) {
                belcherGame.setColorlessMana(belcherGame.getColorlessMana() - 1);
                belcherGame.setRedMana(belcherGame.getRedMana() - 1);
            } else {
                belcherGame.setRedMana(belcherGame.getRedMana() - 2);
            }

            BurningWish c = (BurningWish) belcherGame.getCardFromHandWithName("BurningWish");
            c.play(belcherGame);
            System.out.println("play:" + "BurningWish");
            return makeNextMoveBelcher(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("EmptyTheWarrens") != null && belcherGame.getRedMana() > 0 && belcherGame.getTotalMana() > 3) {

            while (belcherGame.getCardFromHandWithName("ChromeMox") != null) {
                ChromeMox c = (ChromeMox) belcherGame.getCardFromHandWithName("ChromeMox");
                c.playWithoutImprint(belcherGame);
            }
            while (belcherGame.getCardFromHandWithName("LandGrant") != null) {
                LandGrant c = (LandGrant) belcherGame.getCardFromHandWithName("LandGrant");
                c.playWithoutFindingAnything(belcherGame);
            }

            EmptyTheWarrens c = (EmptyTheWarrens) belcherGame.getCardFromHandWithName("EmptyTheWarrens");
            belcherGame.setGoblinTokens(c.play(belcherGame));
            System.out.println("play:" + "Empty the Warrens");
            return false;
        } else {
            return false;
        }

    }

    public ArrayList<Card> getBelcherDeck(int ChromeMox, int GoblinCharbelcher, int BurningWish, int GrimMonolith,
            int LionsEyeDiamond, int LotusPetal, int ElvishSpiritGuide, int SimianSpiritGuide,
            int TinderWall, int DesperateRitual, int PyreticRitual, int SeethingSong, int Taiga,
            int EmptyTheWarrens, int LandGrant, int GitaxianProbe, int RiteOfFlame, int Manamorphose) {
        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < ChromeMox; i++) {
            deck.add(new ChromeMox());
        }
        for (int i = 0; i < GoblinCharbelcher; i++) {
            deck.add(new GoblinCharbelcher());
        }
        for (int i = 0; i < BurningWish; i++) {
            deck.add(new BurningWish());
        }
        for (int i = 0; i < GrimMonolith; i++) {
            deck.add(new GrimMonolith());
        }
        for (int i = 0; i < LionsEyeDiamond; i++) {
            deck.add(new LionsEyeDiamond());
        }
        for (int i = 0; i < LotusPetal; i++) {
            deck.add(new LotusPetal());
        }
        for (int i = 0; i < ElvishSpiritGuide; i++) {
            deck.add(new ElvishSpiritGuide());
        }
        for (int i = 0; i < SimianSpiritGuide; i++) {
            deck.add(new SimianSpiritGuide());
        }
        for (int i = 0; i < TinderWall; i++) {
            deck.add(new TinderWall());
        }
        for (int i = 0; i < DesperateRitual; i++) {
            deck.add(new DesperateRitual());
        }
        for (int i = 0; i < PyreticRitual; i++) {
            deck.add(new PyreticRitual());
        }
        for (int i = 0; i < SeethingSong; i++) {
            deck.add(new SeethingSong());
        }
        for (int i = 0; i < Taiga; i++) {
            deck.add(new Taiga());
        }
        for (int i = 0; i < EmptyTheWarrens; i++) {
            deck.add(new EmptyTheWarrens());
        }
        for (int i = 0; i < LandGrant; i++) {
            deck.add(new LandGrant());
        }
        for (int i = 0; i < GitaxianProbe; i++) {
            deck.add(new GitaxianProbe());
        }
        for (int i = 0; i < RiteOfFlame; i++) {
            deck.add(new RiteOfFlame());
        }
        for (int i = 0; i < Manamorphose; i++) {
            deck.add(new Manamorphose());
        }

        return deck;
    }

    public ArrayList<Card> getBelcherDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new ChromeMox());
        deck.add(new ChromeMox());
        deck.add(new ChromeMox());
        deck.add(new ChromeMox());
        deck.add(new GoblinCharbelcher());
        deck.add(new GoblinCharbelcher());
        deck.add(new GoblinCharbelcher());
        deck.add(new GoblinCharbelcher());
        deck.add(new BurningWish());
        deck.add(new BurningWish());
        deck.add(new BurningWish());
        deck.add(new GrimMonolith());
        deck.add(new LionsEyeDiamond());
        deck.add(new LionsEyeDiamond());
        deck.add(new LionsEyeDiamond());
        deck.add(new LionsEyeDiamond());
        deck.add(new LotusPetal());
        deck.add(new LotusPetal());
        deck.add(new LotusPetal());
        deck.add(new LotusPetal());
        deck.add(new ElvishSpiritGuide());
        deck.add(new ElvishSpiritGuide());
        deck.add(new ElvishSpiritGuide());
        deck.add(new ElvishSpiritGuide());
        deck.add(new SimianSpiritGuide());
        deck.add(new SimianSpiritGuide());
        deck.add(new SimianSpiritGuide());
        deck.add(new SimianSpiritGuide());
        deck.add(new TinderWall());
        deck.add(new TinderWall());
        deck.add(new TinderWall());
        deck.add(new TinderWall());
        deck.add(new DesperateRitual());
        deck.add(new DesperateRitual());
        deck.add(new DesperateRitual());
        deck.add(new DesperateRitual());
        deck.add(new PyreticRitual());
        deck.add(new PyreticRitual());
        deck.add(new PyreticRitual());
        deck.add(new PyreticRitual());
        deck.add(new SeethingSong());
        deck.add(new SeethingSong());
        deck.add(new SeethingSong());
        deck.add(new SeethingSong());
        deck.add(new Taiga());
        deck.add(new EmptyTheWarrens());
        deck.add(new EmptyTheWarrens());
        deck.add(new EmptyTheWarrens());
        deck.add(new BurningWish());
        deck.add(new LandGrant());
        deck.add(new LandGrant());
        deck.add(new LandGrant());
        deck.add(new LandGrant());
        deck.add(new RiteOfFlame());
        deck.add(new RiteOfFlame());
        deck.add(new RiteOfFlame());
        deck.add(new RiteOfFlame());
        deck.add(new Manamorphose());
        deck.add(new Manamorphose());
        return deck;
    }

    public void simulateAncestrallLotusBolt() {
        int highestWins = 0;
        int winningLotusCount = 0;
        int winningBoltCount = 0;
        int winningAncestraalCount = 0;

        for (int bolt = 0; bolt < 60; bolt++) {
            for (int lotus = 0; lotus + bolt < 60; lotus++) {
                int ancestrall = 60 - bolt - lotus;
                //System.out.println("ancestrall:" + Integer.toString(ancestrall));
                //System.out.println("bolt:" + Integer.toString(bolt));
                // System.out.println("lotus:" + Integer.toString(lotus));
                int win = 0;
                int lose = 0;
                int totalGames = 10000;
                for (int i = 0; i < totalGames; i++) {

                    BelcherGame belcherGame = new BelcherGame();
                    belcherGame.setCardsInDeck(getDeck(lotus, bolt, ancestrall));
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();
                    belcherGame.drawCard();

                    if (doIWinTurnOneAncestrallLotusBolt(belcherGame)) {
                        win++;
                    } else {
                        lose++;
                    }
                }
                ///System.out.println("Total games won:" + Integer.toString(win));
                ///System.out.println("Total games lost:" + Integer.toString(lose));
                ///System.out.println("Percentage Games Won:" + Double.toString((win*100)/totalGames));

                if (win > highestWins) {
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

    public boolean doIWinTurnOneAncestrallLotusBolt(BelcherGame belcherGame) {
        return makeNextMoveAncestrallLotusBolt(belcherGame);
    }

    public boolean makeNextMoveAncestrallLotusBolt(BelcherGame belcherGame) {
        if (belcherGame.howManyCardsWithNameDoIHaveInHand("LightningBolt") > 6 && belcherGame.howManyCardsWithNameDoIHaveInHand("BlackLotus") > 2) {
            return true;
        } else if (belcherGame.getCardFromHandWithName("AncestrallRecall") != null && belcherGame.getBlueMana() > 0 && belcherGame.getCardsInDeck().size() > 2) {
            AncestrallRecall a = (AncestrallRecall) belcherGame.getCardFromHandWithName("AncestrallRecall");
            a.play(belcherGame);
            //System.out.println("play Ancestrall Recall");

            return makeNextMoveAncestrallLotusBolt(belcherGame);
        } else if (belcherGame.getCardFromHandWithName("BlackLotus") != null) {
            BlackLotus a = (BlackLotus) belcherGame.getCardFromHandWithName("BlackLotus");
            a.play(belcherGame);
            a.activate(belcherGame, Mana.BLUE);
            //System.out.println("play Black Lotus");

            return makeNextMoveAncestrallLotusBolt(belcherGame);
        } else {
            return false;
        }
    }

    public ArrayList<Card> getDeck(int BlackLotus, int LightningBolt, int AncestrallRecall) {
        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < BlackLotus; i++) {
            deck.add(new BlackLotus());

        }
        for (int i = 0; i < LightningBolt; i++) {
            deck.add(new LightningBolt());

        }
        for (int i = 0; i < AncestrallRecall; i++) {
            deck.add(new AncestrallRecall());

        }
        return deck;
    }

    public ArrayList<Card> getDeck() {
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
