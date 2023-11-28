import java.util.LinkedList;
import java.util.ArrayList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> array = new LinkedList<String>();
        LinkedList<String> array2= new LinkedList<String>();
        array.add("keyur");
        array.add("prachi");
        array.add("priyal");
//        for (int i=0;i<array.size();i++){
//            System.out.println(array.get(i));
//        }
        System.out.println(array);
        /*
        array2.add(String.valueOf(array))this method is store the values into first linkedList to
        another linkList
         */
        //array2.add(String.valueOf(array));
        array2.addAll(array);
        System.out.println(array2);
//        System.out.println(array2);
        for (String i : array2){
            System.out.println(i);
        }
//        array.addFirst("k");
//        System.out.println(array);
//        array.removeFirst();
//        System.out.println(array);
//        array.removeLast();
//        System.out.println(array);
//        System.out.println(array.getFirst());
//        System.out.println(array.getLast());

    }
}
