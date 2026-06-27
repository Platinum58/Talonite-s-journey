import java.util.HashMap;

public class longest_substring_withoutrepeatingcharacters {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int size = 0;
        int l = 0;
        
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            
            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            
            map.put(c, r);
            size = Math.max(size, r - l + 1);
        }
        
        return size;
    }
}
}
