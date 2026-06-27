import java.util.Stack;

public class largest_rectangle_inhistogram {
    lass Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();

        int area = 0;
       
        for(int i = 0; i < heights.length; i++)
        {
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                int pop = s.pop();
                int left = s.isEmpty() ? -1 : s.peek();
                if(area < heights[pop]*(i-left-1)) area = heights[pop]*(i-left-1);
                
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int pop = s.pop();
            int left = s.isEmpty() ? -1: s.peek();
            if(area < heights[pop]*(heights.length-left-1)) area = heights[pop]*(heights.length-left-1);
            

        }
        return area;
        }
    } 
}
