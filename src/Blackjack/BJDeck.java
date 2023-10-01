/* File: Lab9b.java
        * Description: Create BJDeck, 54 cards. Provide shuffle, add card, basic card functions.
        * Lessons Learned:
Investigate an interface that you will implement and figure out how it works
investigate a class that will test a class you create and ensure that your code will support the testing class
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/15/2023
        */
package BlackJack;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

import java.util.ArrayList;
import java.util.Collections;

public class BJDeck implements PDeck {
    public ArrayList<BJCard> cards=new ArrayList<BJCard>();
    public BJDeck() {
        for(Suit s:Suit.values()){
            for(Rank r: Rank.values()) {
                BJCard c = new BJCard(r, s);
                cards.add(c);
            }
        }

    }
    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void addCard(PCard card) {
        cards.add((BJCard) card);
    }

    @Override
    public PCard dealCard() {
        int cardNum=cards.size() - 1;
        try {
            return cards.remove(cardNum);
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public PCard dealHiddenCard() {
        int cardNum=cards.size() - 1;
        try{

            cards.get(cardNum).hideCard();
            return cards.remove(cardNum);
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public int cardCount() {
        return cards.size();
    }
}
