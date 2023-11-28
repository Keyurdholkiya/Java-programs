import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        /*
        syntax HashMap<keys(Datatype),values(Datatype)>Object = new HashMap<>();
         */
        HashMap<String,String> array = new HashMap<>();
        //HashMap<String,Integer>array2 = new HashMap<>();
        //HashMap<String,Float>array2 = new HashMap<>();
        array.put("name := "," keyur");
        array.put("city := "," visnagar");
        array.put("collage := "," ganpat University");
        System.out.println(array.size());
       // System.out.println(array.get("name"));
        //System.out.println(array.get("keyur"));//throw error
//        for(String i : array.keySet()){
//            System.out.println(i+array.get(i));
//        }
//        for (String j : array.values()){
//            System.out.println(j);
//
//        }
    }
}
