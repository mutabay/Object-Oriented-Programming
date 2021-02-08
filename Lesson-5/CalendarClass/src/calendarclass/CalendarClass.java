
package calendarclass;

public class CalendarClass {

    public static void main(String[] args) {

        
        MyCalendar date1 = new MyCalendar(31,10, 2019 );
        
        System.out.println("Date : " + date1.GetDateString(".", MyCalendar.FORMAT_DMY));
        
        System.out.println(date1.getYear() + "İs Leap Year : " + date1.isLeapYear() );
        
        System.out.println(date1.getYear() + "İs Leap Year : " + date1.isLeapYear() );
        
        System.out.println("");
        
        
        
        

    }
    
}
