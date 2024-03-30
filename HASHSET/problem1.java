//Write a Java program to remove all of the elements from a hash set
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        System.out.print("Enter the range: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter a number: ");
            int x=sc.nextInt();
            set.add(x);
        }
        System.out.println("Given Hashset is: "+set);
        set.clear();
        System.out.println("Remove all the element: "+set);
        sc.close();
    }
}
