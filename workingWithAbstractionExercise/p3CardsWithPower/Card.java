package oop.workingWithAbstractionExercise.p3CardsWithPower;

public class Card {

    private CardRank cardRank;
    private CardSuits cardSuits;

    public Card(CardRank cardRank, CardSuits cardSuits) {
        this.cardRank = cardRank;
        this.cardSuits = cardSuits;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public int getCardPower(){
        return cardRank.getRankPower() + cardSuits.getSuitPower();
    }

}
