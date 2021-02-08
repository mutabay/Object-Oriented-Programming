package lesson.pkg9.practice;

public class GoalKeeper implements SoccerPlayer {
    
   
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
        return 24;
    }
    @Override
    public boolean CanUseHands()
    {
        return true;
    }
    
    @Override
    public String toString()
    {
        return "Player Type = " + GetPlayerType() + " Is Playing = " + IsPlaying() + " Number = " + GetNumber() + " Can use Hands ? " + CanUseHands(); 
    }
}
