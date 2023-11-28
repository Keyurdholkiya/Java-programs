//import Number.*;
import java.util.*;
import java.lang.Thread;
class usingpack extends Thread {
    public static int amount=0;
    public static void main(String args[]) {
        usingpack s1 = new usingpack();
        s1.run();
    }
        public void run() {
            Random sc =new Random();
            int a=sc.nextInt(0,5);
            int b=sc.nextInt(0,5);
            System.out.print(a+"+");
            System.out.print(b+"=");
            System.out.println(a+b);
            System.out.print(a+"*");
            System.out.print(b+"=");
            System.out.println(a*b);
        }
}
//      pack t1=new pack();
       // LinkedList<String> car=new LinkedList<String>();
//        t1.sum(10,20,30,40,50,60,70,80,90);
//    }
//        for (int i=10;i>0;i--) {
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
       // car.add("keyur");
       // System.out.println(car);
  //  }
//}
// class one{
//    public void first(){
//        System.out.print("keyur");
//    }
//}
// class two extends one {
//    public void second(){
//        super.first();
//        System.out.println("dolkiya");
//    }
//
//}
//class three extends two{
//    public static void main(String args[]){
//        three t1=new three();
//        t1.second();
//    }
//}
