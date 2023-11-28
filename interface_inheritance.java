interface cars{
    String[] carsName();
    String[] colors();
    int [] numbers();
    void welcome();
    default void keyur(){
        System.out.println("my name is keyur ");
    }
}
class userChoice implements cars{
    public void keyurName(){
        System.out.println("my name is keyur");
    }
    public int [] numbers(){
        int [] number={10,20,30,40};
        return number;
    }
    @Override
    public void welcome(){
        System.out.println("hello,welcome");
    }
    @Override
    public String[] carsName(){
        String[] carsName={"volvo","i10"};
        return carsName;
    }
    public  String[] colors(){
        String[] color={"red","black"};
        return color;
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        /*
        any time to access the data into upper class so first think is to take object and after to go upper class
        without object you cannot call upper class and this sentence is essential part
         */
        cars s2=new userChoice();
        s2.welcome();//allowed
        s2.keyur();//allowed
        //s2.keyurName();//not allowed
        /*
        means agar muje polimoprizem banate ho to me jiska object hu uski sare methods run karu ga but agar muje
        refrence ki methods ko tabhi call karu ga agar vo method object banara he vo is me ho otherwise me error
        throw karu ga
         */

        userChoice s1=new userChoice();
        for (String item: s1.carsName()){
            System.out.println(item);
        }
        for (String item1:s1.colors()) {
            System.out.println(item1);
        }
        for (int a : s2.numbers()){
            System.out.println(a);
        }
    }
}
