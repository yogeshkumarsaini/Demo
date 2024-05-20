package Day13.Map_Java;

import java.util.HashMap;
import java.util.Map;
public class hash_map {
    public static void main(String[] args) {
       
        HashMap<Integer, String> hm = new HashMap<>();

        System.out.println(hm);

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println(hm);

        hm.put(null, "four"); 
        hm.put(null, "FOUR"); 
        hm.put(2, "TWO"); 
        hm.put(5, null);
        hm.put(6, null); 
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.containsKey(null));
        System.out.println(hm.containsValue("Two"));
        System.out.println(hm.entrySet());
        System.out.println(hm.putIfAbsent(9, "Nine"));
        System.out.println(hm);

      

       

    }
}
