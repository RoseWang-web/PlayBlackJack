
/* File: Lab10b.java
        * Description:basic function to display cards in hand, like get cards, get value.
        * Lessons Learned:
Investigate a class that you will use and figure out how it works
Debug an Object-Oriented  program as necessary
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/24/2023
        */
package BlackJack;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

import java.util.ArrayList;

public class BJHand implements PHand {
    public ArrayList<BJCard> CardsInHand;
    public BJHand(){
        CardsInHand=new ArrayList<BJCard>();
    }
    @Override
    public int getSize() {

        return CardsInHand.size();
    }

    @Override
    public void addCard(PCard card) {
        CardsInHand.add((BJCard) card);
    }

    @Override
    public PCard getCard(int index) {
        return CardsInHand.get(index);
    }

    @Override
    public PCard removeCard(int index) {

        return CardsInHand.remove(index);
    }

    @Override
    public int getValue() {
        int value=0;
        for(BJCard b:CardsInHand){

            switch(b.r){
                case TWO:
                    value+=Rank.TWO.rank;
                    break;
                case THREE:
                    value+=Rank.THREE.rank;
                    break;
                case Four:
                    value+=Rank.Four.rank;
                    break;
                case FIVE:
                    value+=Rank.FIVE.rank;
                    break;
                case SIX:
                    value+=Rank.SIX.rank;
                    break;
                case SEVEN:
                    value+=Rank.SEVEN.rank;
                    break;
                case EIGHT:
                    value+=Rank.EIGHT.rank;
                    break;
                case NINE:
                    value+=Rank.NINE.rank;
                    break;
                case TEN:
                    value+=Rank.TEN.rank;
                    break;
                case JACK:
                    value+=10;
                    break;
                case QUEEN:
                    value+=10;
                    break;
                case KNIGHT:
                    value+=10;
                    break;
                case KING:
                    value+=10;
                    break;
                case ACE:
                    value+=11;
                    if(value>=21)
                    {
                        value-=10;
                    }
                    break;
            }

        }

        return value;
    }
}
