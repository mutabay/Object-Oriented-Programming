
package mytime;

public class MyTime {

    public static void main(String[] args) {

        TimeClasss time = new TimeClasss(10, 25 , 6);
        
        System.out.println("Time is "+ time.getTimeString() );
        
        
        time.addHour(2);
        System.out.println("Time is "+ time.getTimeString() );
        
        
        time.addMinute(65);
        System.out.println("Time is "+ time.getTimeString() );
        
        time.addSecond(95);
        System.out.println("Time is "+ time.getTimeString() );

        


    }
    
}
