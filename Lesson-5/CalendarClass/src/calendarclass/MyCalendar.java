package calendarclass;



public class MyCalendar {
    
    private int day;
    private int month;
    private int year;
    
    public static final int FORMAT_DMY = 1;
    public static final int FORMAT_MDY = 2;
    public static final int FORMAT_YMD = 3;
    
    public static final int MODFOUR = 0;
    public static final int MODHUNDRED = 0;
    public static final int MODFOURHUNDRED = 0;
    
    
    
    
    
    public MyCalendar (){
        
        day = 1;
        month = 1;
        year = 1;

    }
    
  
    public MyCalendar ( int day, int month, int year){
        
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String GetDateString( String separator ,int pattern   ){
        
        String str = "" ;
        
        switch(pattern){
            
            case FORMAT_DMY:
                str += day + separator + month + separator + year;
                break;
                
            case FORMAT_MDY:
                str += month + separator + day + separator + year;
                break;
            
            case FORMAT_YMD:
                str += year + separator + month + separator + day;
                break;
                
                default:
                    str += "YOU FOOL!!";
                    
        }
        
        return str;
        
        
    }
    
    public boolean isLeapYear(){
        
        if (   year % 400 == MODFOURHUNDRED  || (year % 4 == MODFOUR && year % 100 != MODHUNDRED )) {
            
            return true;
        }
        
        else{
            return false;
        }
        
    }
    
    public static boolean isLeapYear ( int year) {
        
        if (   year % 400 == MODFOURHUNDRED  || (year % 4 == MODFOUR && year % 100 != MODHUNDRED )) {
            
            return true;
        }
        
        else{
            return false;
        }
        
        
    }
    

    
    
    
    
    
} 
