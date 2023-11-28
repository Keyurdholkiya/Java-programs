class thread implements Runnable {
    Thread t;
    public void run() {

        System.out.println("i am thread");
    }

}
public class runnable {
    public static void main(String[] args) {
        Runnable s1 = new thread();
        Thread t1 = new Thread(s1,"keyur");
        s1.run();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        //t1.start();
        //System.out.println();
    }
}
