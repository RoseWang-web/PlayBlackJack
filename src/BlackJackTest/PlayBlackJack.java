/* File: Lab10b.java
        * Description: play Black jack
        * Lessons Learned:
Investigate a class that you will use and figure out how it works
Debug an Object-Oriented  program as necessary
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/24/2023
        */
package BlackJackTest;

import BlackJack.*;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;
import BlackJackBase.PGame;
import BlackJackBase.PHand;

import java.awt.*;
import java.util.ArrayList;

public class PlayBlackJack{

    public static void main(String[] args){
  /*      BJCard bj1=new BJCard(Rank.ACE,Suit.SPADE);
        BJCard bj2=new BJCard(Rank.SIX,Suit.HEART);
        BJCard bj3=new BJCard(Rank.JACK,Suit.SPADE);
        BJCard bj4=new BJCard(Rank.KNIGHT,Suit.HEART);

        BJCard bj5=new BJCard(Rank.QUEEN,Suit.DIAMOND);

        BJCard bj6=new BJCard(Rank.KING, Suit.CLUB);
        CardTest.run(bj1);
        CardTest.run(bj2);
        CardTest.run(bj3);
        CardTest.run(bj4);
        CardTest.run(bj5);
        CardTest.run(bj6);
Add code to create a deck of cards and call the run method from DeckTest.
          BJDeck bjDeck=new BJDeck();
      DeckTest.run(bjDeck);
         BJHand hand=new BJHand();

         HandTest.run(bjDeck, hand);

*/
        BJDeck bjDeck=new BJDeck();
        BJHand dealer=new BJHand();
        PHand player=new BJHand();
        PGame.setBackgroundColor(Color.YELLOW);
        PGame.setBannerColor(Color.YELLOW);
        PGame.setBannerTextColor(Color.BLUE);
        PGame.setStatusTextColor(Color.BLUE);
        PGame.setButtonColor(Color.LIGHT_GRAY);
        PGame.setButtonHighlightColor(Color.BLUE);
        PGame.setButtonTextColor(Color.BLUE);
        PGame.setFont("Monospaced");
        PGame.run(bjDeck,dealer,player);

    }

}
