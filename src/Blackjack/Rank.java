/*
* File: Lab9a.java
* Description: The enum of Rank
* Lessons Learned:
Investigate a class that you will extend and figure out how it works
investigate a class that will test a class you create and ensure that your code will support the testing class
*
* Instructor's Name: Barbara Chamberlin
* @author     Rose Wang
* @since       03/14/2023
 */
package BlackJack;

public enum Rank {
    ACE (1,"A"),
    TWO(2,"2"),
    THREE(3,"3"),
    Four(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN (7,"7"),
    EIGHT(8,"8"),
    NINE (9,"9"),
    TEN (10,"10"),
    JACK (11,"J"),
    KNIGHT (12,"Kn"),
    QUEEN (13,"Q"),
    KING(14,"K");
    public final int rank;
    public final String name;

    Rank(int rank, String name) {
        this.rank=rank;
        this.name=name;
    }
}
