import java.util.ArrayList;
import java.util.Scanner;
class InventoryItems{
    int itemId;
    String name;
    int quantity;
    double price;
    InventoryItems(int itemId,String name,int quantity,double price){
        this.itemId=itemId;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    int getQuantity(){
        return quantity;
    }
    double getPrice(){
        return price;
    }
}
public class inventory {
    public static void main(String[] args) {
        //inventoryitems k1=new inventoryitems(10,"toys",10,10000d);
        //System.out.println(k1.getItemid());
        //System.out.println(k1.getitemname());
        //System.out.println(k1.getQuantity());
        //System.out.println(k1.getPrice());
        ArrayList<InventoryItems> inventory= new ArrayList<InventoryItems>();
        Scanner sc=new Scanner(System.in);
            int Items = sc.nextInt();
            sc.nextLine();//consume the newline
            String ItemName = sc.nextLine();
            //sc.nextLine();
            int Quantity = sc.nextInt();
            //sc.nextLine();
            double ItemPrice = sc.nextDouble();
         InventoryItems k1 = new InventoryItems(Items,ItemName,Quantity,ItemPrice);

    }
}
