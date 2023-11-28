import java.util.Scanner;

public class multi_level_exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c=sc.nextInt();
        int []a=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        try{
            System.out.println(a[1]);
            try{
                System.out.println(a[b]/c);
            }catch (Exception e){
                System.out.println(e);
            }

        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }finally {
            //System.out.println("sum := "+(a+b));
            System.out.println("good morning friends ");
        }
    }
}
