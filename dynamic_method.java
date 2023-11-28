class phone {
    //1
    public int sum(int a,int b){
        return a+b;
    }
    public void bye(){
        System.out.println("hello my name  is keyur buy new phone ");
    }
}
class smartphone extends phone{
    //2
    public int sum(int a,int b){
        return a+b;
    }
    /*
    this hello() method can't executed because this method are not available to super class
     */
    public void hello(){
        System.out.println("hello my name is keyur by phone :");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
        phone h1=new smartphone();
        /*means only this method executed available to super class same to
        sub class but executed sub class if method name is same , and executed
        different method only super class not sub class only same method only executed
        means same name method name super class and sub class
         */
        System.out.println(h1.sum(10,20));//allow executed 2 number not 1
       // h1.hello();//can not executed because this method not available to super class
        h1.bye();//this is executed because this is super class method
    }
}
