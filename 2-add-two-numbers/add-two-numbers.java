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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

         ListNode dummy = new ListNode(0);   // fester Anker, gehört nicht zum Ergebnis
         ListNode tail = dummy;              // wandert ans Ende der neuen Liste

         ListNode cur1 = l1;
         ListNode cur2 = l2;
         int carryout = 0;
         int sum = 0;


         while(cur1 != null || cur2 != null || carryout == 1){

            int v1 = (cur1 != null) ? cur1.val : 0;
            int v2 = (cur2 != null) ? cur2.val : 0;
            sum = v1 + v2 + carryout;

            
            tail.next = new ListNode(sum % 10);

            carryout = sum / 10;
        
            

            if(cur1 != null){
                cur1 = cur1.next;
            }
            if(cur2 != null){
                cur2 = cur2.next;
            }

            tail = tail.next;

       }

       return dummy.next;

    }
}