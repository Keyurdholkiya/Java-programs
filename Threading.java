 class Threading extends Thread{
    public void run(){
        while(true){
            System.out.println("i am in busy in coding..!!");
        }
    }
}
class Threading2 extends Thread{
    public void run(){
        while(true){
            System.out.println("i am busy with chatting her person");
        }
    }
}
class OperationInThreads{
    public static void main(String[] args) {
        Threading t1= new Threading();
        Threading2 t2=new Threading2();
        t1.start();
        t2.start();
    }
}
