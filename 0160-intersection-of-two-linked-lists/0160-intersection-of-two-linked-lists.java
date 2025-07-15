/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


          ListNode temp=headA;


         while(temp!=null)
         {
            ListNode poin=headB;
            while(poin!=null)
            {
                 if(temp==poin)
                 {
                    return temp;
                 }
                 poin=poin.next;
            }
            temp=temp.next;
         }
        
        return null;
    }
}