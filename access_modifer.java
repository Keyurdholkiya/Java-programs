import java.util.*;
class Student1{
    private String name;
    private int roll_no;
    private int modile_no;
    public void name(String name ){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void roll1(int id){
        roll_no=id;
    }
    public int roll(){
        return roll_no;
    }
}
public class access_modifer {
    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            try {
                Scanner sc = new Scanner(System.in);
                Student1 keyur = new Student1();
                String name1 = sc.nextLine();
                keyur.name(name1);
                System.out.println(keyur.getname());
                int rolln = sc.nextInt();
                keyur.roll1(rolln);
                System.out.println(keyur.roll());
            } catch (Exception e) {
                System.out.println("enter the wrong value , enter the integer value ");
            }
        }
        System.out.println("sorry you have enter the wrong value so access denaid...!!!");
    }
}
