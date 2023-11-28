class one {
    int sum;
   public one(int a){
       sum+=a;
       System.out.println("sum of uper Class := "+sum);
   }
}
class two extends one{
 public  two(int a,int b) {
     super(a);
     sum = a + b;
     System.out.println("sum of middle class := "+sum);
 }
}
class three extends two{
  public three(int a,int b,int c) {
      super(a, b);
      sum = a + b + c;
      System.out.println("sum of lower class := "+sum);
  }
}
public class constuctore_inheritance{
    public static void main(String[] args) {
        three t1=new three(10,20,30);
    }
}
