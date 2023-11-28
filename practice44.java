class Cylinder{
   private double radius;
  private  double height;
    //final double pi=3.14d; use math.pi
//    public Cylinder(double radius,double height) {
//        this.radius = radius;
//        this.height = height;
//
//        formula = pi * radius * radius * height;
//        System.out.println(formula);
//    }
//}
    public void cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public double getRadius(){
        //values of cylinder
        return Math.PI*radius*radius*height;
    }
    public double getSurface(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}
public class practice44 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.cylinder(10,20);
        System.out.println("cylinder formula := "+c1.getRadius());
        System.out.println("surface area of a cylinder := "+c1.getSurface());
        //Cylinder k1=new Cylinder();

    }
}
