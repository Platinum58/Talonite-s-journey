import java.util.*;
class search{
    static void sr(int[] arr, int tar){
        int high = arr.length-1, low = 0;
        while(low < high){
            int med = (low + ((arr.length-low)/2));
            if(arr[med] == tar){
                System.out.println("nnumbber exist " + arr[med]);
                return;
            }else if(arr[med] > tar){
                low = med;
            }else if(arr[med] < tar){
                high = med;
            }
        }
        System.out.println("no number");
        return;
    }
}
public class binary{
    public static void main(String[]argas){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        search.sr(arr,tar);

    }
}