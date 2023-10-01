
/* File: Lab10b.java
        * Description:The subclass of PCard class. have basic function for set/get Rank and Suit.
        * Lessons Learned:
Investigate a class that you will use and figure out how it works
Debug an Object-Oriented  program as necessary
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/24/2023
        */

package BlackJack;

import BlackJackBase.PCard;
import BlackJackTest.CardTest;

import java.awt.*;
import java.util.HashMap;

public class BJCard extends PCard {

    private boolean hidden;
    public Suit s;
    public Rank r;

    public BJCard(Rank rank,Suit suit){
        this.r=rank;
        this.s=suit;
        hidden=false;
    }

    public void setRank(Rank rank) {
        r=rank;
    }

    public int getRank() {
        return r.rank;
    }
    public void setSuit(Suit suit) {
        s= suit;
    }

    public int getSuit() {
        return s.suit;
    }

    @Override
    public void hideCard() {
        hidden=true;
    }

    @Override
    public void showCard() {
        hidden=false;
    }

    @Override
    public boolean isHidden() {
        if(hidden)
        {
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String getText() {


        return r.name+s.diagram;


    }
    public Color getFontColor() {
        return s.color;
    }

    public Color getBackColor() {
        return Color.PINK;
    }
    public Color getBorderColor() {
        return Color.RED;
    }
    public Color getStripeColor() {
        return Color.RED;
    }
}

