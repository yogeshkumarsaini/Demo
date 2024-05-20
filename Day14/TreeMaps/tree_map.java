import java.util.Map;
import java.util.TreeMap;

public class tree_map {
    public static void main(String[] args) {

        Map<String,String> map2=new TreeMap<>();
        map2.put("hhh","2");
        map2.put("",null);
        map2.put("hjkhj","");
        map2.put("fff",null);
        System.out.println(map2);
        map2.put("hhh","2");
        System.out.println(map2);
        System.out.println(map2.get("hhh"));
        System.out.println(map2.keySet());
        System.out.println(map2.values());
        System.out.println(map2.size());
        System.out.println(map2.entrySet());
        System.out.println(map2.remove("fff"));
        System.out.println(map2.replace("hhh", "2","10"));
        System.out.println(map2);
        

    }
}
