class rectangle{
     int length;
     int width;
     rectangle(){
         System.out.println("i am rectangle");
     }
//     rectangle(int l,int w){
//         this.length=l;
//         this.width=w;
//     }
    public void setLengthAndSetWidth(int l,int r){
         this.length=l;
         this.width=r;
    }
     public int rectangleArea(){
         System.out.println("i am area of rectangle");
         System.out.println("my length := "+length);
         System.out.println("my width := "+width);
         return this.length*this.width;
     }
}
class cube extends rectangle{
  int edge;
//    cube(int a,int b){
//      super(a,b);
//      this.edge=a;
//    }
public void cube(int a,int b){
    super.setLengthAndSetWidth(a,b);
    this.edge=a;
}
    public int volume(){
        System.out.println("i am volume of cube");
        System.out.println("my edge := "+edge);
        return edge*edge*edge;
    }
  public int cubeArea(){
      System.out.println("i am area of cube");
      return 6*edge*edge;
  }
}
public class problem_solve52 {
    public static void main(String[] args) {
        cube c1 = new cube();
        c1.cube(10, 20);
        System.out.println(c1.rectangleArea());
        System.out.println(c1.volume());
        System.out.println(c1.cubeArea());
    }
}


