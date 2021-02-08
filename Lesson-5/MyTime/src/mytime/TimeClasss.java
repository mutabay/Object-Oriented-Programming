
package mytime;


public class TimeClasss {
    
    private int hour ;
    private int minute;
    private int second;
    
    public TimeClasss()
    {
        hour = minute = second = 0;
    }
    
    public TimeClasss(int hour , int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setHour(int hour)
    {   
        if ( hour <= 24)
            this.hour = hour;
        else
            System.out.println("Hour at max 24");
    }
    
    public void setMinute(int minute)
    {
        if( minute <= 60)
            this.minute = minute;
        
        else
            System.out.println("Minute at maximum 60");
    
    }
    
    public void setSecond(int second)
    {
        if (second <= 60)
            this.second = second;
        
        else
            System.out.println("Second at maximum 60");
    }
    
    public int getHour ()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public int getSecond()
    {
        return second;
    }
    
    public String getTimeString()
    {
        String str = "";
        
        str += hour + ":" + minute + ":" + second ;
        
        return str;
    }
    
        //ADD HOUR ADD MINUTE EKLEME FONKSİYONU YAP

        public void addHour (int hour)
        {
            this.hour = hour + this.hour;
        }
        
        public void addSecond (int second)
        {
            this.second = second + this.second;
            if (second > 59)
            {
                minute = minute + second / 60;
                this.second = this.second % 60;
            }
        }
        
        public void addMinute (int minute)
        {
            this.minute = minute + this.minute;
            if ( minute > 59)
            {
                hour = hour + minute / 60;
                this.minute = this.minute % 60;
            }
        }
        
     
        
        
        
        
        
        
        
        
            
    
    
    
}
