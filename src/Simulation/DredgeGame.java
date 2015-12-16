package Simulation;

import Cards.Card;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by fhict on 16/12/15.
 */
public class DredgeGame {

    private ArrayList<Card> cardsInHand = new ArrayList<Card>();
    private ArrayList<Card> cardsInDeck = new ArrayList<Card>();
    private ArrayList<Card> cardsInExile = new ArrayList<Card>();

    public DredgeGame()
    {

    }

    public void drawCards(int amount)
    {
        for (double i = 0; i < amount; i++) {
            drawCard();
        }
    }

    public void drawCard()
    {
        Random rand = new Random();
        int  n = rand.nextInt(cardsInDeck.size());
        Card c = cardsInDeck.get(n);
        cardsInDeck.remove(c);
        cardsInHand.add(c);
    }



    public int howManyCardsWithNameDoIHaveInHand(String name)
    {
        int i = 0;
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals(name))
            {
                i++;
            }
        }
        return i;
    }


    public Card getCardFromHandWithName(String name)
    {
        for(Card c : cardsInHand)
        {
            if (c.getCardName().equals(name))
            {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public void setCardsInDeck(ArrayList<Card> cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }

    public String handToString()
    {
        String a = "";
        for (Card card : cardsInHand)
        {
            a = a + " " + card.getCardName();
        }
        return a;
    }

    public ArrayList<Card> getCardsInExile() {
        return cardsInExile;
    }

    public void setCardsInExile(ArrayList<Card> cardsInExile) {
        this.cardsInExile = cardsInExile;
    }

    public void exileHand()
    {
        cardsInExile.addAll(cardsInHand);
        cardsInHand = new ArrayList<Card>();
    }
}

