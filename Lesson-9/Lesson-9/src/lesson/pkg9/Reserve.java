
package lesson.pkg9;

public class Reserve implements SoccerPlayer{

    public Reserve() {
        
    }
    
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
        return 7;
    }

    @Override
    public boolean CanUseHands() {
        return false;
    }
    
    @Override 
    public String toString()
    {
        return "type = " + GetPlayerType() + " IsPlaying = " + IsPlaying() + " Number = " + GetNumber() + " Can use hand " + CanUseHands() ;
    }
    
    
}
