public class Recursion {
    static int display(int a){
        if (a==0 || a==1){
            return 1;
        }else {
            return a*display(a-1);
        }
    }
    static void normal(){
        int mul=1;
        for (int i=5;i>1;i--){
            mul=mul*i;
        }
        System.out.println("factorial = "+mul);
    }
    static void fibonacy(){
        int a=0;
        int b=1;
        for (int i=0;i<5;i++) {
            int c = a + b;
            c = a;
            a = b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Recursion r1=new Recursion();
        System.out.println(r1.display(5));
        r1.normal();
        r1.fibonacy();
    }
}
