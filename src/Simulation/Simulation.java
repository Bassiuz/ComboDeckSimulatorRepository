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

    public void simulateBelcher() {
        ArrayList<Card> winningDeck = new ArrayList<Card>();
        int highestWins = 0;

        for (int ChromeMox = 0; ChromeMox < 4; ChromeMox++) {
            for (int GoblinCharbelcher = 0; GoblinCharbelcher < 4; GoblinCharbelcher++) {
                for (int BurningWish = 0; BurningWish < 4; BurningWish++) {
                    for (int GrimMonolith = 0; GrimMonolith < 4; GrimMonolith++) {
                        for (int LionsEyeDiamond = 0; LionsEyeDiamond < 4; LionsEyeDiamond++) {
                            for (int LotusPetal = 0; LotusPetal < 4; LotusPetal++) {
                                for (int ElvishSpiritGuide = 0; ElvishSpiritGuide < 4; ElvishSpiritGuide++) {
                                    for (int SimianSpiritGuide = 0; SimianSpiritGuide < 4; SimianSpiritGuide++) {
                                        for (int TinderWall = 0; TinderWall < 4; TinderWall++) {
                                            for (int DesperateRitual = 0; DesperateRitual < 4; DesperateRitual++) {
                                                for (int PyreticRitual = 0; PyreticRitual < 4; PyreticRitual++) {
                                                    for (int SeethingSong = 0; SeethingSong < 4; SeethingSong++) {
                                                        for (int Taiga = 0; Taiga < 2; Taiga++) {
                                                            for (int EmptyTheWarrens = 0; EmptyTheWarrens < 4; EmptyTheWarrens++) {
                                                                for (int LandGrant = 0; LandGrant < 4; LandGrant++) {
                                                                    for (int GitaxianProbe = 0; GitaxianProbe < 4; GitaxianProbe++) {
                                                                        for (int RiteOfFlame = 0; RiteOfFlame < 4; RiteOfFlame++) {
                                                                            for (int Manamorphose = 0; Manamorphose < 4; Manamorphose++) {
                                                                                ArrayList<Card> deck = getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose);
                                                                                if (deck.size() == 60)
                                                                                {
                                                                                    int win = 0;
                int lose = 0;
                int totalGames = 10;
                for (int i = 0; i < totalGames; i++) {

                    Game game = new Game();
                    game.setCardsInDeck(getBelcherDeck(ChromeMox,GoblinCharbelcher,BurningWish,GrimMonolith,LionsEyeDiamond,LotusPetal,ElvishSpiritGuide,SimianSpiritGuide,TinderWall,DesperateRitual,PyreticRitual,SeethingSong,Taiga,EmptyTheWarrens,LandGrant,GitaxianProbe,RiteOfFlame,Manamorphose));
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();

                    if (doIWinTurnOneAncestrallLotusBolt(game)) {
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

        int win = 0;
        int lose = 0;
        int totalGames = 10000;
        for (int i = 0; i < totalGames; i++) {

            Game game = new Game();
            game.setCardsInDeck(getBelcherDeck(4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4, 4, 1, 3, 4, 2, 4, 2));
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();
            game.drawCard();

            if (doIWinTurnOneBelcher(game)) {
                win++;
            } else {
                lose++;
            }
        }
        System.out.println("Total games won:" + Integer.toString(win));
        System.out.println("Total games lost:" + Integer.toString(lose));
        System.out.println("Percentage Games Won:" + Double.toString((win * 100) / totalGames));

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

    public boolean doIWinTurnOneBelcher(Game game) {
        return makeNextMoveBelcher(game);
    }

    public boolean makeNextMoveBelcher(Game game) {
        if (!game.isTriedToPlayLandGrant() && game.getCardFromHandWithName("LandGrant") != null) {
            if (game.isLandDropMade() || game.getCardFromHandWithName("Taiga") != null) {
                if (game.getCardFromHandWithName("ChromeMox") != null) {
                    ChromeMox c = (ChromeMox) game.getCardFromHandWithName("ChromeMox");
                    c.play(game, game.getCardFromHandWithName("LandGrant"), Mana.GREEN);
                    c.activate(game);
                    System.out.println("play:" + "ChromeMox");
                    System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
                    return makeNextMoveBelcher(game);
                } else {
                    game.setTriedToPlayLandGrant(true);
                    return makeNextMoveBelcher(game);
                }
            } else {
                ((LandGrant) game.getCardFromHandWithName("LandGrant")).play(game);
                System.out.println("play:" + "LandGrant");
                return makeNextMoveBelcher(game);

            }

        } else if (game.getCardFromHandWithName("LionsEyeDiamond") != null) {
            LionsEyeDiamond c = (LionsEyeDiamond) game.getCardFromHandWithName("LionsEyeDiamond");
            c.play(game);
            System.out.println("play:" + "LionsEyeDiamond");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("TinderWall") != null && game.getGreenMana() > 0) {
            TinderWall c = (TinderWall) game.getCardFromHandWithName("TinderWall");
            c.play(game);
            c.activate(game);
            System.out.println("play:" + "TinderWall");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("SimianSpiritGuide") != null) {
            ((SimianSpiritGuide) game.getCardFromHandWithName("SimianSpiritGuide")).play(game);
            System.out.println("play:" + "SimianSpiritGuide");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("ElvishSpiritGuide") != null) {
            ((ElvishSpiritGuide) game.getCardFromHandWithName("ElvishSpiritGuide")).play(game);
            System.out.println("play:" + "ElvishSpiritGuide");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("GitaxianProbe") != null && game.getLifeTotal() > 2) {
            GitaxianProbe c = (GitaxianProbe) game.getCardFromHandWithName("GitaxianProbe");
            c.playForLife(game);
            System.out.println("play:" + "GitaxianProbe");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("Manamorphose") != null && game.getTotalMana() > 1 && (game.getGreenMana() > 0 || game.getRedMana() > 0)) {
            Manamorphose c = (Manamorphose) game.getCardFromHandWithName("Manamorphose");

            if (game.getColorlessMana() > 0) {
                game.setColorlessMana(game.getColorlessMana() - 1);
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
            } else {
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
            }
            Mana mana1 = null;
            if (game.getRedMana() > 0) {
                mana1 = Mana.GREEN;
            } else {
                mana1 = Mana.RED;
            }
            c.play(game, mana1, Mana.RED);
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            System.out.println("play:" + "Manamorphose");
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("Taiga") != null) {
            Taiga c = (Taiga) game.getCardFromHandWithName("Taiga");
            c.play(game);
            game.setLandDropMade(true);
            if (game.getRedMana() > 0) {
                c.activate(game, Mana.GREEN);
            } else {
                c.activate(game, Mana.RED);
            }

            System.out.println("play:" + "Taiga");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("LotusPetal") != null) {
            LotusPetal c = (LotusPetal) game.getCardFromHandWithName("LotusPetal");
            c.play(game);
            if (game.getRedMana() > 0) {
                c.activate(game, Mana.GREEN);
            } else {
                c.activate(game, Mana.RED);
            }

            System.out.println("play:" + "LotusPetal");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("PyreticRitual") != null && game.getRedMana() > 0 && game.getTotalMana() > 1) {
            PyreticRitual c = (PyreticRitual) game.getCardFromHandWithName("PyreticRitual");
            c.play(game);
            System.out.println("play:" + "PyreticRitual");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("DesperateRitual") != null && game.getRedMana() > 0 && game.getTotalMana() > 1) {
            DesperateRitual c = (DesperateRitual) game.getCardFromHandWithName("DesperateRitual");
            c.play(game);
            System.out.println("play:" + "DesperateRitual");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));

            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("SeethingSong") != null && game.getRedMana() > 0 && game.getTotalMana() > 2) {
            SeethingSong c = (SeethingSong) game.getCardFromHandWithName("SeethingSong");
            c.play(game);
            System.out.println("play:" + "SeethingSong");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));

            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("RiteOfFlame") != null && game.getRedMana() > 0) {
            RiteOfFlame c = (RiteOfFlame) game.getCardFromHandWithName("RiteOfFlame");

            c.play(game);
            System.out.println("play:" + "RiteOfFlame");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("GrimMonolith") != null && game.getTotalMana() > 1) {
            GrimMonolith c = (GrimMonolith) game.getCardFromHandWithName("GrimMonolith");

            if (game.getColorlessMana() > 1) {
                game.setColorlessMana(game.getColorlessMana() - 2);
            } else if (game.getColorlessMana() == 1) {
                game.setColorlessMana(game.getColorlessMana() - 1);
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
            } else {
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
                if (game.getRedMana() > 1 && game.getGreenMana() > 0) {
                    game.setRedMana(game.getRedMana() - 1);
                } else {
                    game.setGreenMana(game.getGreenMana() - 1);
                }
            }

            c.play(game);
            c.activate(game);
            System.out.println("play:" + "GrimMonolith");
            System.out.println("TotalMana: " + Integer.toString(game.getTotalMana()));
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("GoblinCharbelcher") != null && game.getTotalMana() > 6) {
            GoblinCharbelcher c = (GoblinCharbelcher) game.getCardFromHandWithName("GoblinCharbelcher");
            c.play(game);
            System.out.println("play:" + "GoblinCharbelcher");
            return c.activate(game);
        } else if (game.getCardFromHandWithName("GoblinCharbelcher") != null && game.getTotalMana() > 3 && game.getCardFromPlayWithName("LionsEyeDiamond") != null) {
            GoblinCharbelcher c = (GoblinCharbelcher) game.getCardFromHandWithName("GoblinCharbelcher");
            c.play(game);
            System.out.println("play:" + "GoblinCharbelcher");
            return c.activate(game);
        } else if (!game.isTriedToPlayChromeMox() && game.getCardFromHandWithName("ChromeMox") != null) {
            System.out.println("play:" + "ChromeMox");
            ChromeMox c = (ChromeMox) game.getCardFromHandWithName("ChromeMox");
            boolean win = false;
            int mostGoblinTokens = 0;
            for (Card card : game.getCardsInHand()) {
                if (card.getColor() != Mana.COLORLESS) {
                    Game subgame = new Game(game);
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
                game.setGoblinTokens(mostGoblinTokens);
                game.setTriedToPlayChromeMox(true);
                return makeNextMoveBelcher(game);
            }

        } else if (game.getCardFromHandWithName("BurningWish") != null && game.getRedMana() > 1 && game.getTotalMana() > 5 && game.getCardFromPlayWithName("LionsEyeDiamond") != null) {

            if (game.getColorlessMana() > 0) {
                game.setColorlessMana(game.getColorlessMana() - 1);
                game.setRedMana(game.getRedMana() - 1);
            } else {
                game.setRedMana(game.getRedMana() - 2);
            }

            game.setRedMana(game.getRedMana() + 3);

            BurningWish c = (BurningWish) game.getCardFromHandWithName("BurningWish");
            c.play(game);
            System.out.println("play:" + "BurningWish");
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("BurningWish") != null && game.getRedMana() > 1 && game.getTotalMana() > 2) {

            if (game.getColorlessMana() > 0) {
                game.setColorlessMana(game.getColorlessMana() - 1);
                game.setRedMana(game.getRedMana() - 1);
            } else {
                game.setRedMana(game.getRedMana() - 2);
            }

            BurningWish c = (BurningWish) game.getCardFromHandWithName("BurningWish");
            c.play(game);
            System.out.println("play:" + "BurningWish");
            return makeNextMoveBelcher(game);
        } else if (game.getCardFromHandWithName("EmptyTheWarrens") != null && game.getRedMana() > 0 && game.getTotalMana() > 3) {

            while (game.getCardFromHandWithName("ChromeMox") != null) {
                ChromeMox c = (ChromeMox) game.getCardFromHandWithName("ChromeMox");
                c.playWithoutImprint(game);
            }
            while (game.getCardFromHandWithName("LandGrant") != null) {
                LandGrant c = (LandGrant) game.getCardFromHandWithName("LandGrant");
                c.playWithoutFindingAnything(game);
            }

            EmptyTheWarrens c = (EmptyTheWarrens) game.getCardFromHandWithName("EmptyTheWarrens");
            game.setGoblinTokens(c.play(game));
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

                    Game game = new Game();
                    game.setCardsInDeck(getDeck(lotus, bolt, ancestrall));
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();
                    game.drawCard();

                    if (doIWinTurnOneAncestrallLotusBolt(game)) {
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

    public boolean doIWinTurnOneAncestrallLotusBolt(Game game) {
        return makeNextMoveAncestrallLotusBolt(game);
    }

    public boolean makeNextMoveAncestrallLotusBolt(Game game) {
        if (game.howManyCardsWithNameDoIHaveInHand("LightningBolt") > 6 && game.howManyCardsWithNameDoIHaveInHand("BlackLotus") > 2) {
            return true;
        } else if (game.getCardFromHandWithName("AncestrallRecall") != null && game.getBlueMana() > 0 && game.getCardsInDeck().size() > 2) {
            AncestrallRecall a = (AncestrallRecall) game.getCardFromHandWithName("AncestrallRecall");
            a.play(game);
            //System.out.println("play Ancestrall Recall");

            return makeNextMoveAncestrallLotusBolt(game);
        } else if (game.getCardFromHandWithName("BlackLotus") != null) {
            BlackLotus a = (BlackLotus) game.getCardFromHandWithName("BlackLotus");
            a.play(game);
            a.activate(game, Mana.BLUE);
            //System.out.println("play Black Lotus");

            return makeNextMoveAncestrallLotusBolt(game);
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
