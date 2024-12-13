import java.util.*;
public class Operations_Hashmap {
  public static void main(String[] args) {
      HashMap<String,String> a=new HashMap<>();
    a.put("sno","01");
    a.put("sname","hasini");
    a.put("city","Chennai");
    System.out.println(a);
    //modifying 
    a.put("sno","90");
    System.out.println(a);
    //removing key
    a.remove("sname");
    System.out.println(a);
    a.clear();
    System.out.println(a);
  }    
}
