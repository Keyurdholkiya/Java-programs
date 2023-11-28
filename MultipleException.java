import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Exception1{
    public void solveError(){
        Scanner sc=new Scanner(System.in);
        int[] a =new int [3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        //System.out.println(Arrays.toString(a)); to show the all list of element to shoe items
        System.out.print("enter the index number to perform addition := ");
        int b=sc.nextInt();
        System.out.print("enter the number to perform addition with array of index number := ");
        int c=sc.nextInt();
        try {
            System.out.println("you can choice this " + Arrays.toString(a) + "[" + b + "]");
            System.out.println("sum = " + (a[b] / c));
        }catch(ArithmeticException e){
            System.out.println("enter the wrong to divided");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("enter the wrong index number to divided");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("other exception");
        }finally {
            System.out.println("end of try catch block");
        }

    }
}
public class MultipleException {
    public static void main(String[] args) {
        Exception1 e1= new Exception1();
        e1.solveError();
    }
}
