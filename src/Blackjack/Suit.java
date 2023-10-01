/* File: Lab10b.java
        * Description:The enum of Suit
        * Lessons Learned:
Investigate a class that you will use and figure out how it works
Debug an Object-Oriented  program as necessary
        * Instructor's Name: Barbara Chamberlin
        * @author     Rose Wang
        * @since       03/24/2023
        */
package BlackJack;

import java.awt.*;

public enum Suit {
    SPADE(1, Color.BLACK,"♠"),
    HEART(2, Color.RED,"♥"),
    DIAMOND(3, Color.RED,"⬥"),
    CLUB(4, Color.BLACK,"♣");

    public final int suit;
    public final Color color;
    public final String diagram;

    Suit(int suit, Color color, String diagram) {
        this.suit=suit;
        this.color=color;
        this.diagram=diagram;


    }
}
