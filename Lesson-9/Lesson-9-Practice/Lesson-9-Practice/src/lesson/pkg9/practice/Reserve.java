
package lesson.pkg9.practice;

public class Reserve implements SoccerPlayer{
    
    @Override
    public String GetPlayerType()
    {
        return "Reserve";
    }
    @Override
    public boolean IsPlaying()
    {
        return false;
    }
    @Override
    public int GetNumber()
    {
        return 5;
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
