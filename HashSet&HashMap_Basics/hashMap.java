import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("china",140);
        map.put("india", 120);
        map.put("US", 30);
        // System.out.println(map.get("US"));
        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()==140){
                System.out.println(e.getKey());
            }            
            
        }
        // map.remove("china");
        // map.put("china", map.get("china")+10);
        // System.out.println(map);
        // if(map.containsValue(120)){
        //     System.out.println("true");
        // }

    }
    
}
