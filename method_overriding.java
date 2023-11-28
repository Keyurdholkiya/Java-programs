class value1{
    public void display(){
        System.out.println("hello my name is keyur");
    }
}
class value2 extends  value1{
    @Override
    public void display(){
        //super.display();
        System.out.println("hello i am second class keyur");
    }
}
public class method_overriding extends value2 {
    public static void main(String[] args) {
        method_overriding m1= new method_overriding();
       // value1 v1= new value1();
        //v1.display();
        m1.display();
    }
}
