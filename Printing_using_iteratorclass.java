import java.util.*;
public class Printing_using_iteratorclass {
    public static void main(String[] args) {
        LinkedHashSet <String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Students");
        a.add("Rajesh");
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
