import java.util.Random;
import java.util.Scanner;
class game{
    int userInput;
    int computer;
    game(int a,int b) {
        this.userInput = a;
        this.computer = b;
    }
    void check() {
        try {
            if (computer == userInput) {
                System.out.println("you guess right number");
            } else if (userInput < computer) {
                System.out.println("your value is small,try again");
            } else {
                System.out.println("your value is big,try again");
            }
        }catch(Exception e){
            System.out.println("game is not work properly");
        }
    }
    public int getComputer(){
        System.out.print("computer choice this value := ");
        return computer;
    }
}
public class gamerandom {
    public static void main(String[] args) {
        System.out.println("lets start to play game guess the number");
        while(true) {
            Scanner sc = new Scanner(System.in);
            Random ra = new Random();
            int y = ra.nextInt(0, 100);
            //System.out.println(y);
            System.out.print("guess the number := ");
            int x = sc.nextInt();
            game p1 = new game(x, y);
            p1.check();
            System.out.println(p1.getComputer());
        }
    }
}
