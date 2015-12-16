/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combodecksimulator;

import Simulation.BelcherSimulation;
import Simulation.DredgeSimulation;

/**
 *
 * @author Bash
 */
public class ComboDeckSimulator {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DredgeSimulation bestDredgeSimulation = null;
        double bestWinPercentage = 0;
        int amountOfDecks = 0;

        for (int cabalTherapy = 0; cabalTherapy < 4; cabalTherapy++) {
            for (int bridgeFromBelow = 0; bridgeFromBelow < 4; bridgeFromBelow++) {
                for (int narcomoeba = 0; narcomoeba < 4; narcomoeba++) {
                    for (int ichorid = 0; ichorid < 4; ichorid++) {
                        for (int gemstoneMine = 0; gemstoneMine < 4; gemstoneMine++) {
                            for (int cityOfBrass = 0; cityOfBrass < 4; cityOfBrass++) {
                                for (int manaConfluence = 0; manaConfluence < 4; manaConfluence++) {
                                    for (int cephalidColiseum = 0; cephalidColiseum < 4; cephalidColiseum++) {
                                        for (int lionsEyeDiamond = 0; lionsEyeDiamond < 4; lionsEyeDiamond++) {
                                            for (int failthlessLooting = 0; failthlessLooting < 4; failthlessLooting++) {
                                                for (int carefullStudy = 0; carefullStudy < 4; carefullStudy++) {
                                                    for (int breakthrough = 0; breakthrough < 4; breakthrough++) {
                                                        for (int streetWraith = 0; streetWraith < 4; streetWraith++) {
                                                            for (int putridImp = 0; putridImp < 4; putridImp++) {
                                                                for (int serumPowder = 0; serumPowder < 4; serumPowder++) {
                                                                    for (int golgariGraveTroll = 0; golgariGraveTroll < 4; golgariGraveTroll++) {
                                                                        for (int stinkweedImp = 0; stinkweedImp < 4; stinkweedImp++) {
                                                                            for (int golgariThug = 0; golgariThug < 4; golgariThug++) {
                                                                                int decksum = cabalTherapy + bridgeFromBelow + narcomoeba + ichorid + gemstoneMine + cityOfBrass + manaConfluence +
                                                                                        cephalidColiseum + lionsEyeDiamond + failthlessLooting + carefullStudy + breakthrough + streetWraith + putridImp +
                                                                                        serumPowder + golgariGraveTroll + stinkweedImp + golgariThug;

                                                                                int blank = 0;

                                                                                if (decksum < 60)
                                                                                {
                                                                                    blank = 60 - decksum;
                                                                                }

                                                                                if (decksum + blank < 65)
                                                                                {
                                                                                    DredgeSimulation simulation = new DredgeSimulation(cabalTherapy, bridgeFromBelow, narcomoeba, ichorid, gemstoneMine, cityOfBrass, manaConfluence,
                                                                                            cephalidColiseum, lionsEyeDiamond, failthlessLooting, carefullStudy, breakthrough, streetWraith, putridImp, serumPowder, golgariGraveTroll, stinkweedImp, golgariThug, blank);

                                                                                    double winpercentage;
                                                                                    winpercentage = simulation.simulateDredge();
                                                                                    amountOfDecks++;

                                                                                    if (winpercentage > bestWinPercentage)
                                                                                    {
                                                                                        bestDredgeSimulation = simulation;
                                                                                        bestWinPercentage = winpercentage;
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
        }

        System.out.println("Percentage: " + Double.toString(bestWinPercentage));
        System.out.println("AmountOfDecks: " + Integer.toString(amountOfDecks));


    }
    
}
