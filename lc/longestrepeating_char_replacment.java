public class longestrepeating_char_replacment {
    class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int [26];
        int left = 0, maxfre = 0, sub = 0;
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            fre[ch-'A']++;
            maxfre = Math.max(maxfre,fre[ch-'A']);
            while((i-left+1)-maxfre > k){
                fre[s.charAt(left )- 'A']--;
                left++;
            }
            sub = Math.max(i-left+1,sub);
        }
        return sub;
    }
}
}
