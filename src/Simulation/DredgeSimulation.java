package Simulation;

import Cards.*;
import com.oracle.tools.packager.Log;

import java.util.ArrayList;

/**
 * Created by fhict on 16/12/15.
 */
public class DredgeSimulation {


    int cabalTherapy;
    int bridgeFromBelow;
    int narcomoeba;
    int ichorid;
    int gemstoneMine;
    int cityOfBrass;
    int manaConfluence;
    int cephalidColiseum;
    int lionsEyeDiamond;
    int failthlessLooting;
    int carefullStudy;
    int breakthrough;
    int streetWraith;
    int putridImp;
    int serumPowder;
    int golgariGraveTroll;
    int stinkweedImp;
    int golgariThug;
    int blank;

    public DredgeSimulation(int cabalTherapy, int bridgeFromBelow, int narcomoeba, int ichorid, int gemstoneMine, int cityOfBrass, int manaConfluence, int cephalidColiseum, int lionsEyeDiamond, int failthlessLooting, int carefullStudy, int breakthrough, int streetWraith, int putridImp, int serumPowder, int golgariGraveTroll, int stinkweedImp, int golgariThug, int blank) {
        this.cabalTherapy = cabalTherapy;
        this.bridgeFromBelow = bridgeFromBelow;
        this.narcomoeba = narcomoeba;
        this.ichorid = ichorid;
        this.gemstoneMine = gemstoneMine;
        this.cityOfBrass = cityOfBrass;
        this.manaConfluence = manaConfluence;
        this.cephalidColiseum = cephalidColiseum;
        this.lionsEyeDiamond = lionsEyeDiamond;
        this.failthlessLooting = failthlessLooting;
        this.carefullStudy = carefullStudy;
        this.breakthrough = breakthrough;
        this.streetWraith = streetWraith;
        this.putridImp = putridImp;
        this.serumPowder = serumPowder;
        this.golgariGraveTroll = golgariGraveTroll;
        this.stinkweedImp = stinkweedImp;
        this.golgariThug = golgariThug;
        this.blank = blank;
    }

    public double simulateDredge()
    {
        double win =0;
        double lose =0;
        double amountOfGames = 1;

        for (double i = 0; i < amountOfGames; i++) {
            if(getHand())
            {
                win++;
            }
            else
            {
                lose++;
            }
        }


        //System.out.println("Total good hands:" + Double.toString(win));
        ///System.out.println("Total bad hands:" + Double.toString(lose));
        ///System.out.println("Percentage:" + Double.toString(win/amountOfGames * 100));

        return win/amountOfGames * 100;

    }

    public boolean getHand() {
        int handsize = 7;
        boolean goodHand = false;
        while (handsize > 2 && goodHand == false) {
            if (goodDredgeOpener(handsize)) {
                    goodHand = true;
            }
            else
            {
                handsize--;
            }
        }
        return goodHand;
    }

    public boolean goodDredgeOpener(int cardsInHand)
    {
        DredgeGame dredgeGame = new DredgeGame();
        boolean repeat = true;

        dredgeGame.setCardsInDeck(getDredgeDeck());

        dredgeGame.drawCards(cardsInHand);
        while (repeat) {
            if (checkHand(dredgeGame.getCardsInHand())) {
                ///System.out.println("Keep hand with cards in hand:" + Integer.toString(cardsInHand));
                repeat = false;
                return true;
            } else if (dredgeGame.getCardFromHandWithName("SerumPowder") == null) {
                ///System.out.println("Mulligan");
                repeat = false;
                return false;
            }
            else
            {
                dredgeGame.exileHand();
                dredgeGame.drawCards(cardsInHand);
                ///System.out.println("SerumPowder");
            }
        }

        return false;

    }

    public boolean checkHand(ArrayList<Card> hand)
    {
        /// TODO: CHECK HAND LOGIC

        if (!isCardInList(hand, "GolgariGraveTroll") && !isCardInList(hand, "GolgariThug") && !isCardInList(hand, "StinkweedImp"))
        {
            return false;
        } else if (isCardInList(hand, "FaithlessLooting") && isCardInList(hand, "LionsEyeDiamond")) {
            return true;
        }
        else if (hasRainbowLand(hand))
        {
            if (hasDiscardSpell(hand) >0 && hasDrawSpell(hand) >0)
            {
                return true;
            }
            else if(hasDiscardAndDrawspell(hand) >0 && hasDrawSpell(hand) >0)
            {
                return true;
            }
            else if(hasDiscardSpell(hand) >0 && hasDiscardAndDrawspell(hand) >0)
            {
                return true;
            }
            else if (hasDiscardAndDrawspell(hand) >1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (isCardInList(hand, "CephalidColiseum"))
        {
            if (isCardInList(hand, "LionsEyeDiamond") && (countCardInList(hand, "CephalidColiseum") > 1 || isCardInList(hand, "CarefulStudy") || isCardInList(hand, "StreetWraith") || isCardInList(hand, "Breakthrough")))
            {
                return true;
            }
            else if (isCardInList(hand, "CarefulStudy") && (countCardInList(hand, "CephalidColiseum") > 1 || (countCardInList(hand, "CarefulStudy") > 1 || isCardInList(hand, "StreetWraith") || isCardInList(hand, "Breakthrough"))))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public int hasDiscardAndDrawspell(ArrayList<Card> cardsInHand)
    {
        int result = 0;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals("FaithlessLooting") || c.getCardName().equals("CarefulStudy"))
            {
                result++;
            }
        }

       return result;
    }

    public int hasDrawSpell(ArrayList<Card> cardsInHand)
    {
        int result = 0;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals("StreetWraith") || c.getCardName().equals("Breakthrough") || c.getCardName().equals("CephalidColiseum"))
            {
                result++;
            }
        }

        return result;
    }

    public int hasDiscardSpell(ArrayList<Card> cardsInHand)
    {
        int result = 0;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals("PutridImp") || c.getCardName().equals("LionsEyeDiamond") ||  c.getCardName().equals("CabalTherapy"))
            {
                result++;
            }
        }

        return result;
    }

    public Boolean hasRainbowLand(ArrayList<Card> cardsInHand)
    {
        Card result = null;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals("CityOfBrass") || c.getCardName().equals("ManaConfluence") ||  c.getCardName().equals("GemstoneMine"))
            {
                result = c;
            }
        }

        if (result == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Boolean isCardInList(ArrayList<Card> cardsInHand, String name)
    {
        Card result = null;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals(name))
            {
                result = c;
            }
        }

        if (result == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public int countCardInList(ArrayList<Card> cardsInHand, String name)
    {
        int result = 0;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals(name))
            {
                result ++;
            }
        }

        return result;
    }

    public ArrayList<Card> getDredgeDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();

        for (int i = 0; i < cabalTherapy; i++) {
            deck.add(new CabalTherapy());
        }
        for (int i = 0; i < bridgeFromBelow; i++) {
            deck.add(new BridgeFromBelow());
        }
        for (int i = 0; i < narcomoeba; i++) {
            deck.add(new Narcomoeba());
        }
        for (int i = 0; i < ichorid; i++) {
            deck.add(new Ichorid());
        }
        for (int i = 0; i < lionsEyeDiamond; i++) {
            deck.add(new LionsEyeDiamond());
        }
        for (int i = 0; i < gemstoneMine; i++) {
            deck.add(new GemstoneMine());
        }
        for (int i = 0; i < cityOfBrass; i++) {
            deck.add(new CityOfBrass());
        }
        for (int i = 0; i < manaConfluence; i++) {
            deck.add(new ManaConfluence());
        }
        for (int i = 0; i < cephalidColiseum; i++) {
            deck.add(new CephalidColiseum());
        }
        for (int i = 0; i < failthlessLooting; i++) {
            deck.add(new FaithlessLooting());
        }
        for (int i = 0; i < streetWraith; i++) {
            deck.add(new StreetWraith());
        }
        for (int i = 0; i < breakthrough; i++) {
            deck.add(new Breakthrough());
        }
        for (int i = 0; i < carefullStudy; i++) {
            deck.add(new CarefulStudy());
        }
        for (int i = 0; i < putridImp; i++) {
            deck.add(new PutridImp());
        }
        for (int i = 0; i < serumPowder; i++) {
            deck.add(new SerumPowder());
        }
        for (int i = 0; i < golgariGraveTroll; i++) {
            deck.add(new GolgariGraveTroll());
        }        for (int i = 0; i < golgariThug; i++) {
            deck.add(new GolgariThug());
        }        for (int i = 0; i < stinkweedImp; i++) {
            deck.add(new StinkweedImp());
        }        for (int i = 0; i < blank; i++) {
            deck.add(new Blank());
        }


        return deck;
    }


    public ArrayList<Card> getDredgeDeck(int CabalTherapy, int BridgeFromBelow, int Narcomoeba, int Ichorid,
                                          int LionsEyeDiamond, int GemstoneMine, int CityOrBrass, int ManaConfluence,
                                          int CephalidColiseum, int FaithlessLooting, int CarefulStudy, int Breakthrough, int StreetWraith,
                                          int PutridImp, int SerumPowder, int GolgariGraveTroll, int StinkweedImp, int GolgariThug,
                                         int Blank) {
        ArrayList<Card> deck = new ArrayList<Card>();

        for (int i = 0; i < CabalTherapy; i++) {
            deck.add(new CabalTherapy());
        }
        for (int i = 0; i < BridgeFromBelow; i++) {
            deck.add(new BridgeFromBelow());
        }
        for (int i = 0; i < Narcomoeba; i++) {
            deck.add(new Narcomoeba());
        }
        for (int i = 0; i < Ichorid; i++) {
            deck.add(new Ichorid());
        }
        for (int i = 0; i < LionsEyeDiamond; i++) {
            deck.add(new LionsEyeDiamond());
        }
        for (int i = 0; i < GemstoneMine; i++) {
            deck.add(new GemstoneMine());
        }
        for (int i = 0; i < CityOrBrass; i++) {
            deck.add(new CityOfBrass());
        }
        for (int i = 0; i < ManaConfluence; i++) {
            deck.add(new ManaConfluence());
        }
        for (int i = 0; i < CephalidColiseum; i++) {
            deck.add(new CephalidColiseum());
        }
        for (int i = 0; i < FaithlessLooting; i++) {
            deck.add(new FaithlessLooting());
        }
        for (int i = 0; i < StreetWraith; i++) {
            deck.add(new StreetWraith());
        }
        for (int i = 0; i < Breakthrough; i++) {
            deck.add(new Breakthrough());
        }
        for (int i = 0; i < CarefulStudy; i++) {
            deck.add(new CarefulStudy());
        }
        for (int i = 0; i < PutridImp; i++) {
            deck.add(new PutridImp());
        }
        for (int i = 0; i < SerumPowder; i++) {
            deck.add(new SerumPowder());
        }
        for (int i = 0; i < GolgariGraveTroll; i++) {
            deck.add(new GolgariGraveTroll());
        }        for (int i = 0; i < GolgariThug; i++) {
            deck.add(new GolgariThug());
        }        for (int i = 0; i < StinkweedImp; i++) {
            deck.add(new StinkweedImp());
        }        for (int i = 0; i < Blank; i++) {
            deck.add(new Blank());
        }


        return deck;
    }
}
