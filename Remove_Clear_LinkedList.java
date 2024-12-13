import java.util.*;
public class Remove_Clear_LinkedList {
public static void main(String[] args) {
    LinkedList <String> a=new LinkedList<>();
    a.add("Hello");
    a.add("Students");
    a.add("Hello");
    a.add("Students");
    a.add("Hasini");
    System.out.println(a);
    a.remove(0);
    System.out.println(a);
    a.clear();
    System.out.println(a);
}   
}
