import java.util.*;
public class newa{
    public static void main (String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.set(1,50);
        arr.remove(0);
        System.out.println(arr);
    }
}