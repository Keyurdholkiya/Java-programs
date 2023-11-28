import java.util.*;
class Student{
    void  age(int a) {
        if (a > 18) {
            System.out.println("drive a cars");
        } else {
            System.out.println("not drive car in this age");
        }
    }
    void tables(int n){
        for (int i=1;i<10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    void sum(int a,int b){
        System.out.println("sum="+(a+b));
        System.out.println("mul="+(a*b));
        System.out.println("div="+(a/b));
        System.out.println("sub="+(a-b));
        System.out.println("mod="+(a%b));
    }
    int mul=1;
    void fabinoacy(int a){
        for (int i=a;i>0;i--){
            mul=mul*i;
        }
        System.out.println(mul);
    }
}
public class object {
    public static void main(String[] args) {
        Student keyur=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the your age to check your driving type := ");
        int b= sc.nextInt();
        keyur.age(b);
        System.out.print("gives number to print tables := ");
        int y=sc.nextInt();
        keyur.tables(y);
        System.out.println("gives number to print arithmetics opration");
        System.out.print("enter number 1 := ");
        int k=sc.nextInt();
        System.out.print("enter number 2 := ");
        int j= sc.nextInt();
        keyur.sum(k,j);
        System.out.print("enter to print fibonacy series :=");
        int x=sc.nextInt();
        keyur.fabinoacy(x);
    }
}
