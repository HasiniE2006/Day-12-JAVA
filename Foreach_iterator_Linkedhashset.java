import java.util.*;
public class Foreach_iterator_Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet <String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Students");
        a.add("Hasini");
        for(String s : a)
        {
            System.out.println(s+" ");
        }
    }
    
}
