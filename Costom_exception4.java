import java.util.Scanner;

public class Costom_exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int b;
        int i=0;
        boolean flag=true;
        while(flag && i<5){
            try {
                b = sc.nextInt();
                System.out.println("enter the index number to find in array := " + a[b]);
                break;
            }catch(Exception e){
                System.out.println(e);
                i++;
            }
            if (i==5){
                System.out.println("ERROR.....!!!!!");
            }
        }
    }
}
