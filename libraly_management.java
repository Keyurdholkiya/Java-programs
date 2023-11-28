import java.util.Scanner;
import java.util.ArrayList;
class library{
   int booksId;
   String booksName;
   int price;
   library(int bookId,String booksName,int price){
       this.booksId=bookId;
       this.booksName=booksName;
       this.price=price;
   }
   public int getBooksId(){
       return booksId;
   }
   public String getBooksName(){
       return booksName;
   }
   public int getPrice(){
       return price;
   }
}
public class libraly_management {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<library> array = new ArrayList<library>();
            System.out.print("enter books id number : ");
            int bookid = sc.nextInt();
            System.out.print("enter books name : ");
            String booksname = sc.nextLine();
            sc.nextLine();
            System.out.println("enter books price : ");
            int price = sc.nextInt();
            library l1 = new library(bookid, booksname, price);
            //System.out.println(l1.getBooksId());
            array.add(l1);
            System.out.println("item is added..!!");
            //display
//            System.out.println("enter the itemId to display all items");
//            int id=sc.nextInt();
            for (library item:array){
                    System.out.println("books id : "+item.getBooksId());
                    System.out.println("books name : "+item.getBooksName());
                    System.out.println("books price : "+item.getPrice());
            }
        }catch (Exception e){
            System.out.println("error...!!!");
        }
    }
}
