/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(0);
        ListNode dum = head;

        while(temp1 != null && temp2 != null){
           
            if(temp1.val <= temp2.val){
                dum.next = temp1;
                dum = dum.next;
                temp1 = temp1.next;
            }else{
               dum.next = temp2;
               dum = dum.next;
               temp2 = temp2.next;
            }
        }
           
        while(temp1 != null){
           dum.next = temp1;
                dum = dum.next;
                temp1 = temp1.next;
        }
        while(temp2 != null){
           dum.next = temp2;
            dum = dum.next;
            temp2 = temp2.next;
        }
        return head.next;

            
       
        

        
    }
}