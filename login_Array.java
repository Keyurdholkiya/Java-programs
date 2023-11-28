import java.util.Scanner;
import java.util.Objects;
class Error_detection extends Exception{
    public String toString(){
        return "login din ide..!!!";
    }
}
class Logic_implement{
    String search;
    int password;
    //String []names = new String [5];
    public void setSearch(String name , int password){
        this.search=name;
        this.password=password;
    }
    public void implement()throws Error_detection{
        String[] names = {"keyur", "prachi", "priyal"};
        for (String name : names) {
            if (Objects.equals(search, name) && password == 123) {
                System.out.println("login successfully...!!!");
            } else {
                throw new Error_detection();
            }
        }
    }
}
public class login_Array {
    public static void main(String[] args)throws Error_detection {
            Scanner sc = new Scanner(System.in);
            Logic_implement l1 = new Logic_implement();

            System.out.print("enter your name := ");
            String search = sc.nextLine();

            System.out.print("enter your password := ");
            int pass = sc.nextInt();

            l1.setSearch(search,pass);
            l1.implement();
    }
}
