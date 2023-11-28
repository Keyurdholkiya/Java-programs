class This extends Thread{
    This(String name){
        super(name);

    }    public void run() {
        while(true) {
            System.out.println("welcome to keyur Threads := "+this.getName());
        }
    }
}
public class ThreadPriorities {

    public static void main(String[] args) {
        //This f1=new This();
        This t1 = new This("papa");//t1.getName()
        This t2 = new This("mom");
        This t3 = new This("big didi");
        This t4 = new This("small didi");
        This t5 = new This("keyur");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
       Thread t9 = new Thread("oye...!!");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t9.getName());
    }
}
