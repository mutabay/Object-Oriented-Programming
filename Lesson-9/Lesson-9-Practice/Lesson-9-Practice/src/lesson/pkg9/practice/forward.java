
package lesson.pkg9.practice;

public class forward implements SoccerPlayer {
    
    @Override
    public String GetPlayerType()
    {
        return "Forward";
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
    public boolean CanUseHands()
    {
        return false;
    }
    
    @Override
    public String toString()
    {
        return "Player Type = " + GetPlayerType() + " Is Playing = " + IsPlaying() + " Number = " + GetNumber() + " Can use Hands ? " + CanUseHands(); 
    }
}
