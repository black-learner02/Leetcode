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
    public int pairSum(ListNode head) {

        ListNode sec=head;
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null)
        {
            temp=temp.next.next;
            prev=sec;
            sec=sec.next;
        }   

         prev.next=null;

         ListNode first=reverse(head);

         int sum=Integer.MIN_VALUE;

        while(first!=null)
        {
            int t=first.val+sec.val;
            if(t>sum)
            {
                sum=t;
            }
            first=first.next;
            sec=sec.next;
        }


      return sum;
        
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode front;
        ListNode temp=head;

        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}