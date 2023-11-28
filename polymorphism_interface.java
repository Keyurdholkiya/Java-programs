interface Name{
    void firstName();

}
class FistName implements Name{
    public void firstName(){
        System.out.println("keyur");
    }
    public void lastName(){
        System.out.println("vipulkumar");
    }
}
class LastName2 extends FistName{
    public void lastName(){
        System.out.println("Dholakiya");
    }
    public void firstName(){
        System.out.println("keyur");
    }
}
public class polymorphism_interface {
    public static void main(String[] args) {
        Name f1 = new FistName();
        f1.firstName();//allowed
       // f1.lastName();//not allowed

    }
}
