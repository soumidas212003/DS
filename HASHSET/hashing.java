import java.util.HashSet;
import java.util.Iterator;
public class hashing{
    public static void main(String[] args) {
        //create
        HashSet<Integer> set=new HashSet<>();
        //Add--Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //print all element
        System.out.println(set);
        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //search--contains
        if(set.contains(4)){
            System.out.println("Contains");
        }else{
            System.out.println("Dose not contains");
        }
        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Not contains");
        }
        System.out.println(set);
        //size
        System.out.println("Size of set is: "+set.size());
    }
}