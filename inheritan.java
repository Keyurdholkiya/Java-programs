import java.util.Scanner;

class vehicle{
     int value1;
     int value2;
}
class sum extends vehicle{
    void display(int a){
        super.value1=a;
    }
    void display1(int b){
        super.value2=b;
    }
}
class sum1 extends sum{
    public int value1(){
        return value1;
    }
    public int value2(){
        return value2;
    }
}
class sum2 extends sum1{
    public int sum(){
        return value1+value2;
    }
    public int sub(){
        return value1-value2;
    }
    public int mul(){
        return value1*value2;
    }
    public int mod(){
        return value1%value2;
    }
}
public class inheritan extends sum2 {
    public static void main(String[] args) {
        inheritan n1= new inheritan();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        n1.display(x);
        n1.display1(y);
       // System.out.println(n1.value1());
       // System.out.println(n1.value2());
        System.out.println("sum := "+n1.sum());
        System.out.println("sub := "+n1.sub());
        System.out.println("mul := "+n1.mul());
        System.out.println("mod := "+n1.mod());
    }
}
