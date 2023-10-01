/* File: Lab9a.java
        * Description: Test BJCard function
        * Lessons Learned:
        Investigate a class that you will extend and figure out how it works
        investigate a class that will test a class you create and ensure that your code will support the testing class
*
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/14/2023
        */
package BlackJack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BJCardTest {

    @Test
    void setRank() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        bj1.setRank(Rank.TWO);
        assertEquals(Rank.TWO.rank, bj1.getRank());
    }

    @Test
    void getRank() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        assertEquals(Rank.ACE.rank, bj1.getRank());
    }

    @Test
    void setSuit() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        bj1.setSuit(Suit.CLUB);
        assertEquals(Suit.CLUB.suit,bj1.getSuit());
    }

    @Test
    void getSuit() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        assertEquals(Suit.SPADE.suit,bj1.getSuit());
    }

    @Test
    void hideCard() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        bj1.hideCard();
        assertTrue(bj1.isHidden());
    }

    @Test
    void showCard() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        bj1.showCard();
        assertFalse(bj1.isHidden());
    }

    @Test
    void isHidden() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        assertFalse(bj1.isHidden());
    }

    @Test
    void getText() {
        BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        assertEquals(bj1.r.name+bj1.s.diagram,bj1.getText());
    }

}