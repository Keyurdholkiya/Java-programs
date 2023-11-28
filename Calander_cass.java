import java.util.Calendar;
import java.util.TimeZone;

public class Calander_cass {
    public static void main(String[] args) {
        Calendar cal =  Calendar.getInstance();
       // System.out.println(TimeZone.getTimeZone("Asia/Singapore"));
        //System.out.println(cal.getCalendarType());
        //System.out.println(cal.getTime());
        //cal.add(Calendar.DATE,365); 
        //System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DATE)+ ":" + cal.get(Calendar.MONTH) +":"+ cal.get(Calendar.YEAR));
        System.out.println(cal.getWeekYear());
        //cal.add(Calendar.MONTH,-6);
        //System.out.println(cal);
        //System.out.println(cal.getTime());
        //System.out.println(cal.getTimeZone());

    }
}
