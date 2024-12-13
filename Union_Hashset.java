import java.util.*;
 public class Union_Hashset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        Set <Integer> a=new HashSet<>();
        Set <Integer> b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        a.add(s1);
        Set <Integer> u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);

    }
    
}
