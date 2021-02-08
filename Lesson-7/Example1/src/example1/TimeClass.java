
package example1;

public class TimeClass {
    
    private int second ,minute ,hour;
    
    public TimeClass()
    {
        second = 0;
        minute = 0;
        hour = 0;
    }
    
    public TimeClass(int second , int minute , int hour)
    {
        if (second > 59)
        {
            minute =minute + second / 60;
            second = second % 60;

        }
        
        if (minute > 59)
        {
            hour += minute / 60;
            minute = minute % 60;
        }
        
        
        
        this.second = second;
        this.minute = minute;
        this.hour = hour ;
    }
    
    
    public void setSecond (int second )
    {
        if (second < 59 )
        {
            this.second = second;
        }
        
        else
            System.out.println("Second must be less than 60");
    }
    
    public void setMinute (int minute )
    {
        if ( minute < 59)
        {
            this.minute = minute;
        }
        
        else
            System.out.println("Minute must be less than 60");
    }
    
    public void setHour (int hour )
    {
        if (hour < 24)
            this.hour = hour ;
        
        else
            System.out.println("Hour must be less than 24");
    }
    
    @Override
    public String toString()
    {
        return "Time is : " + hour + ":" + minute + ":" + second;
    }
    
    public TimeClass addTimes(TimeClass time2)
    {
        int second_part = second + time2.second;
        int minute_part = minute + time2.minute;
        int hour_part = hour + time2.hour;
        
        if (second_part > 59 )
        {  
            minute_part = minute_part + second_part / 60;
            second_part = second_part % 60;
        }
        
        if (minute_part > 59)
        {
            hour_part = hour_part + minute_part /60;
            minute_part = minute_part % 60;

        }
        
        return (new TimeClass(second_part , minute_part , hour_part));
    }
    
    
    
}
