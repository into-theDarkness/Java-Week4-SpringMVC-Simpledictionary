package Model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
   private static Map<String, String> dictionary = new HashMap<>();
   static {
       dictionary.put("no", "khong");
       dictionary.put("one", "mot");
       dictionary.put("two", "hai");

   }
   public String finByID(String id){
       return dictionary.get(id);
   }
}
