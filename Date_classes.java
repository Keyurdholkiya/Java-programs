import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_classes {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.print(date.getDate()+" : ");
        System.out.println(date.getTime());
       LocalDate time = LocalDate.now();
       System.out.println(time);
      LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        //System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        LocalDateTime time2 = LocalDateTime.now();
//        System.out.println(time2);
//        DateTimeFormatter mydate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String s1 = time1.format(mydate);
//        System.out.println(s1);
        // String s2 = "keyur";
        // System.out.println(s2.toUpperCase());
//        int a=5;
//        int b=2;
//        int result=0;
//        while(a>0){
//            if (a%2==0){
//                result=result+b;
//            }
//            a=a/2;
//            b=b*2;
//            System.out.println("a := "+a);
//            System.out.println("b := "+b);
//        }
//        System.out.println(result);
//    }
    }
}
