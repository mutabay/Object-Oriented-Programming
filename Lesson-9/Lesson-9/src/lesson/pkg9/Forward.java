
package lesson.pkg9;
public class Forward implements SoccerPlayer{

    public Forward() {
    }
    
    
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
        return 24;
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
