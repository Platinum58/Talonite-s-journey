import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Car_fleet {
    class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Float> s = new ArrayDeque<>();
        Integer[] id = new Integer[speed.length];
        for(int i = 0; i < speed.length; i++){
            id[i] = i;
        }
        
        Arrays.sort(id,(a,b) -> position[b]-position[a]);
    
        for(int i : id){
           
                if(!s.isEmpty() && (target-position[i])/(float)speed[i] > (s.peek())){
                    s.push((target-position[i])/(float)speed[i]);
                }
            
            if(s.isEmpty()) s.push((target-position[i])/(float)speed[i]);
            

        }
        return s.size();
        

    }
}
}
