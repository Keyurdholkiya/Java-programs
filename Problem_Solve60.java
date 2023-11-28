//
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("start to jump");
    }
    public void eat(){
        System.out.println("monkey start to eating");
    }
}
class Human extends Monkey implements BasicAnimal {
    public void eat(){
        //super.eat();
        System.out.println("human start to eat");
    }
    public void sleep(){
        System.out.println("human goto sleep");
    }
}
public class Problem_Solve60 {
    public static void main(String[] args) {
        try {
            Human robot = new Human();
            robot.jump();
           // robot.bite();
            robot.eat();
            robot.sleep();
            BasicAnimal human = new Human();
            human.eat();
            human.sleep();
            Monkey m1= new Human();
            m1.eat();
            //human.bite();//error this method not available in the interface class
           // human.jump();//error this method not available in the interface class
//        FountainPen pen = new FountainPen();
//        pen.changeNib();
//        pen.write();
//        pen.reFil();
//            //using the polymiprizem
//            Pen pen = new FountainPen();
//            pen.write();
//            pen.reFil();
            //  pen.changeNib();//throws error not run this object
        } catch (Exception e) {
            System.out.println("not output because this method not available in parent class");
        }
    }
}
