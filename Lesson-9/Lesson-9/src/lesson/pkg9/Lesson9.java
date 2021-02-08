
package lesson.pkg9;

public class Lesson9 {
   public static void printplayerinfo(SoccerPlayer player){
        System.out.println(player.toString());
   }

    public static void main(String[] args) {
        
        Forward forward = new Forward();
        Reserve reserve = new Reserve();
        GoalKeeper kaleci = new GoalKeeper();
        
        
        printplayerinfo(forward);
        System.out.println("-------------------------");
        printplayerinfo(kaleci);
        System.out.println("-------------------------");
        printplayerinfo(reserve);
        
//        System.out.println("Forward : \n\t" + forward.toString());
//        System.out.println("Reserve : \n\t" + reserve.toString() );
//        System.out.println("GoalKeeper : \n\t "+ kaleci.toString() );
    }
    
    
    
}
