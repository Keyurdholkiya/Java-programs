import java.util.Scanner;

interface carsCompany{
    /*interface create more than class but abstract cannot create more than
    class interface provide extends class to another but abstract cannot provide
    in all method in interface defined another class to implement thought
    interface class.
     */
    void carName();
    void carColor();
    void carDesign();
    /*
    void sum(){this method not provide int interface only provide abstraction
      System.out.println("hello");
    }
    void sum();//only provide this method
    */
}
class honDe implements carsCompany{
    public void carName(){
        System.out.println("car name := i10");
    }
    public void carColor(){
        System.out.println("color name := white");
    }
    public void carDesign(){
        System.out.println("manufacture := indian");
    }
    public void hello(){
        System.out.println("hello friends");
    }
}
class toyota extends honDe implements carsCompany{
    public void carName(){
        System.out.println("thar");
    }
    public void carColor(){
        System.out.println("black");
    }
    public void carDesign(){
        System.out.println("indian");
    }
}
public class interface_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        honDe h1= new honDe();
        h1.carName();
        h1.carColor();
        //sc.nextLine();this is consume all bottom line means not executed below code
        h1.carDesign();
        toyota t1= new toyota();
        t1.carName();
        t1.carColor();
        t1.carDesign();
    }
}
