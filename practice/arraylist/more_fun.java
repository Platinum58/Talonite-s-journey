import java.util.*;
public class more_fun {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kartik");
        arr.add("aryan");
        arr.add("ritik");
        arr.add("josh");
        System.out.println(arr);
        arr.set(0,"joshua");
        System.out.println(arr);
        System.out.println(arr.contains("ritik"));
        System.out.println(arr.indexOf("aryan"));
        System.out.println(arr.size());
    }
}