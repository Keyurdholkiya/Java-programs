import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;
class CustomException extends Exception{
    public String toString(){
        return "this is index is out of bounce";
    }
    public String getMessage(){
        return "this statement not allowed";
    }
}
class ArrayList{

    int []a = {10,20,30,40};
    public void display(int b)throws CustomException{
        if (b>a.length){

            throw new CustomException();
        }
        System.out.println(Arrays.toString(a));
        System.out.println("the value of the array := " + a[b]);
    }
}
public class Custom_exception3 {
    public static void main(String[] args) {
        try {
            ArrayList a1= new ArrayList();
            Scanner sc= new Scanner(System.in);
            System.out.print("enter the index to want to print values := ");
            int b = sc.nextInt();
            a1.display(b);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
