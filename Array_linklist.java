import java.util.AbstractList;
import java.util.ArrayList;
public class Array_linklist {
    public static void main(String[] args) {
        //create empty array
        //syntax ArrayList<Datatype> object_name = new ArrayList<String>();
        //ArrayList<String> s1 = new ArrayList<>();
        ArrayList<Integer> s2= new ArrayList<Integer>();
        ArrayList<Float> s3= new ArrayList<>();
        ArrayList<Character> s4= new ArrayList<>();
        ArrayList<Double> s5= new ArrayList<>();

        //add to the value in empty array using add() method
        s2.add(5);
        s2.add(2);
        s2.add(6);
        s2.add(0,10);
        //using get() method to show the particular index value
        //String name = s1.get(1);
        //System.out.println(name);
        //System.out.println(s1.get(0));
        //using set() method to set the values particular location
        //String add = s1.set(0,"priyal");
        //System.out.println(s1.get(0));
        //s1.set(2,"kittu");
        //System.out.println(s1.get(2));
        //remove the values in array particular location
        //System.out.println(s1.remove(2));
       // System.out.println(s1.get(2));//throw error because 2 index is removed
        //collect all values in array using loop
        System.out.println("i am loop to display all the vales in array ");
//        for (String k : s1){
//            System.out.println(k);
//
//        }
//        for (int i=0;i<s1.size();i++){
//            System.out.println(s1.get(i));
//        }
        for (int i=0;i<s2.size();i++){
            if(s2.contains(i)){
                System.out.println(i+ " in the linkedList "+s2.get(i));
            } else {
                System.out.println(i+ " is not the linkedList "+s2.get(i));
            }
        }
        //to count how mach index in array using size() method
       // System.out.println("i am show what is size of array := "+s1.size());
        // to clear the array method using the clear() method
        //s1.clear();
       // System.out.println(s1.get(0));// throw error because clear() method clear the array so array s1 is destroy

    }
}
