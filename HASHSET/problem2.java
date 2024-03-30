// Write a Java program to compare two sets and retain elements which are same on both sets
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set1=new HashSet<>();
        System.out.print("Enter the range: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter a number: ");
            int x=sc.nextInt();
            set1.add(x);
        }
        System.out.println("First set is: "+set1);
        HashSet<Integer> set2=new HashSet<>();
        for(int i=1;i<=n;i++){
            System.out.print("Enter a number: ");
            int y=sc.nextInt();
            set2.add(y);
        }
        System.out.println("Second set is :"+set2);
        set1.retainAll(set2);
        System.out.println("Hashset content: "+set1);
        sc.close();
    }
}
