
package lesson.pkg9.practice;

public class Lesson9Practice {

    public static void printSoccerPlayers(SoccerPlayer soccerPlayer)
    {
        System.out.println( soccerPlayer.toString());
    }
    
    public static void main(String[] args) {

        GoalKeeper keeper = new GoalKeeper();
        forward forwet = new forward();
        Reserve reserve = new Reserve();
        
        printSoccerPlayers(keeper);
        System.out.println("--------------------------------");
        printSoccerPlayers(forwet);
        System.out.println("--------------------------------");
        printSoccerPlayers(reserve);

    }
    
}
