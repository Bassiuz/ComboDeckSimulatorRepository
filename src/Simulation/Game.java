package Simulation;


import Cards.Card;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bash
 */
public class Game {

    private int redMana;
    private int blueMana;
    private int blackMana;
    private int greenMana;
    private int whiteMana;
    private int colorlessMana;

    private ArrayList<Card> cardsInHand = new ArrayList<Card>();
    private ArrayList<Card> cardsInDeck = new ArrayList<Card>();
    private ArrayList<Card> cardsInPlay = new ArrayList<Card>();
    private ArrayList<Card> cardsInGraveyard = new ArrayList<Card>();
    private ArrayList<Card> cardsInExile = new ArrayList<Card>();

    private int lifeTotal;
    private int opponentLifeTotal;

    
    
    
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
    
    public int getRedMana() {
        return redMana;
    }

    public void setRedMana(int redMana) {
        this.redMana = redMana;
    }

    public int getBlueMana() {
        return blueMana;
    }

    public void setBlueMana(int blueMana) {
        this.blueMana = blueMana;
    }

    public int getBlackMana() {
        return blackMana;
    }

    public void setBlackMana(int blackMana) {
        this.blackMana = blackMana;
    }

    public int getGreenMana() {
        return greenMana;
    }

    public void setGreenMana(int greenMana) {
        this.greenMana = greenMana;
    }

    public int getWhiteMana() {
        return whiteMana;
    }

    public void setWhiteMana(int whiteMana) {
        this.whiteMana = whiteMana;
    }

    public int getColorlessMana() {
        return colorlessMana;
    }

    public void setColorlessMana(int colorlessMana) {
        this.colorlessMana = colorlessMana;
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

    public ArrayList<Card> getCardsInGraveyard() {
        return cardsInGraveyard;
    }

    public void setCardsInGraveyard(ArrayList<Card> cardsInLibrary) {
        this.cardsInGraveyard = cardsInLibrary;
    }

    public ArrayList<Card> getCardsInExile() {
        return cardsInExile;
    }

    public void setCardsInExile(ArrayList<Card> cardsInExile) {
        this.cardsInExile = cardsInExile;
    }

    public int getLifeTotal() {
        return lifeTotal;
    }

    public void setLifeTotal(int lifeTotal) {
        this.lifeTotal = lifeTotal;
    }

    public int getOpponentLifeTotal() {
        return opponentLifeTotal;
    }

    public void setOpponentLifeTotal(int opponentLifeTotal) {
        this.opponentLifeTotal = opponentLifeTotal;
    }

    public ArrayList<Card> getCardsInPlay() {
        return cardsInPlay;
    }

    public void setCardsInPlay(ArrayList<Card> cardsInPlay) {
        this.cardsInPlay = cardsInPlay;
    }

    
    
}
