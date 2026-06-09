public class p1{
    public static void main(String[]args){
        int[] arr = {5,3,4,2,1};
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max + " " + sum);
    }
}