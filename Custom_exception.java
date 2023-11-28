import java.util.Scanner;

class Error extends Exception{
    @Override
    public String toString(){
        return "i am a tostring ";
    }
    @Override
    public String getMessage(){
        return "i am a get message";
    }
}
public class Custom_exception {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if (a<10){
            try{
                throw new Error();
            }catch (Exception e){
              // System.out.println(e.getMessage());
                //System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
