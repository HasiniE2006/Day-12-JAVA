import java.util.*;
public class Printingkey_Hashmap {
  public static void main(String[] args) {
      HashMap<String,String> a=new HashMap<>();
      a.put("sno","01");
      a.put("sname","Hasini");
      System.out.println(a);
      //printing hashmap key value
      if(a.containsKey("sname"))
      {
        String d=a.get("sname");
        System.out.println(d);
      }
  }    
}
