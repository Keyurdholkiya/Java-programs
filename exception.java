import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

class sum15{
    public void keyur(String name){
        if(Objects.equals(name, "keyur")){
            System.out.println("access successful");
            System.out.println("you can access the all service ");
        }
        else{
            throw new SecurityException("sorry you have not right person !!.. login denoted");
        }
    }
}
public class exception extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the your login name to requiring := ");
        String person = sc.nextLine();
        sum15 roll15=new sum15();
      //  System.out.println(roll15.getClass());
        roll15.keyur(person);
//        try {
//            int a = 10;
//             int b = 10;
//            System.out.println(a + b);
//        }catch (Exception e){
//            System.out.println("cannot declare the b variable datatype");
//        }
    }
}
