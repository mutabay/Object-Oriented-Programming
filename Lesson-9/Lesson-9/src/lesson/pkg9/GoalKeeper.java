
package lesson.pkg9;

public class GoalKeeper implements SoccerPlayer {

    public GoalKeeper() {
    }
    
    @Override
    public String GetPlayerType()
    {
        return "GoalKeeper";
    }
    
    @Override
    public boolean IsPlaying()
    {
        return true;
    }
    
    @Override
    public int GetNumber()
    {
        return 10;
    }

    @Override
    public boolean CanUseHands() {
        return true;
    }
   
    @Override 
    public String toString()
    {
        return "type = " + GetPlayerType() + " IsPlaying = " + IsPlaying() + " Number = " + GetNumber() + " Can use hand " + CanUseHands() ;
    }
}
