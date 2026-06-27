import java.util.Arrays;

public class permutations_ina_string {
    class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){  // If s1 is longer, permutation is impossible
        return false;
        }
        int[] freq=new int[26];// Frequency of total char in s1
        int[] win=new int[26]; //Frequency of current char in window in s2
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;// Build frequency arrays
            win[s2.charAt(i)-'a']++;//Build current win 
            //both arrays should have same length bcs we are searching s1 in s2
            //so that means it is fixed length, use it to build first window
        }
        if(Arrays.equals(win,freq)){//after building compare both arrays 
            return true;
        }
        for(int j=n;j<m;j++){ //slide the fixed win 
            win[s2.charAt(j-n)-'a']--;//remove freq of outgoing char
            win[s2.charAt(j)-'a']++;//add freq of incoming char 
            if(Arrays.equals(win,freq)){//again compare curr win
                return true;
            }
        }

        return false; 
    }
}
}
