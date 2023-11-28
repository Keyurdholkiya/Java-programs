class Error2 extends Exception{
    public String toString(){
        return "this is the exception to divided";
    }
    public String getMessage(){
        return "Error...!!!! this is zero divided";
    }
}
class exceptionWriter{
    public int divide(int a,int b)throws Error2{
        if(b==0){
            throw new Error2();
        }
        return a/b;
    }
}
public class Custom_exception2 {
    public static void main(String[] args)  {
        exceptionWriter l1=new exceptionWriter();
        try {
            int result = l1.divide(10, 5);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e);
       }
    }
}
