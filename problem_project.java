import java.util.Objects;
import java.util.Scanner;

class Error_defined extends Exception{
    //indicated Errors
    public String toString(){
        return "login den ide...!!!";
    }
}
class Methods {
    //Logics
    String name;
    int password;

    public void setName(String userName){
        this.name = userName;
    }
    public void setPassword(int userPassword){
        this.password=userPassword;
    }

    public void checkedNamePassword() throws Error_defined {
        if (Objects.equals(name, "keyur") && password == 123456){
            System.out.println("login successfully..!!!");
        }
        else {
            throw new Error_defined();
        }
    }
}
public class problem_project {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Methods u1 = new Methods();
            System.out.print("Enter the your Name := ");
            String name = sc.nextLine();
            u1.setName(name);
            System.out.print("Enter your password := ");
            int pass = sc.nextInt();
            u1.setPassword(pass);
            u1.checkedNamePassword();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
