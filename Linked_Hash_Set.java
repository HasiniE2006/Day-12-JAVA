import java.util.*;
public class  Linked_Hash_Set {
    public static void main(String args[])
    {
    LinkedHashSet <String> a=new LinkedHashSet<> ();
    a.add("Hello");
    a.add("Hello");
    a.add("Students");
    a.add("Ram");
    a.add("Student");
    System.out.println(a);
    a.remove("Ram");
    System.out.println(a);
    a.clear();
    System.out.println(a);
    }
    
}

