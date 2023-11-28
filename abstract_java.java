abstract class phoneCompany{
    phoneCompany(){
        System.out.println("hello i am phone company to contain all company phone");
    }
    abstract public void phoneName();
}
class samsung extends phoneCompany{
    @Override
    public void phoneName() {
        System.out.println("Samsung company");
        System.out.println("phoneName := s23 ultra");
    }
}
public class abstract_java {
    public static void main(String[] args) {
        samsung s1=new samsung();
        s1.phoneName();
    }
}
