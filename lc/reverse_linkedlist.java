class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
         
        
            while(curr != null){
                
                ListNode nex = curr.next;
                curr.next = pre;
                pre = curr;
                curr = nex;
            }
        
        return pre;
    }
}