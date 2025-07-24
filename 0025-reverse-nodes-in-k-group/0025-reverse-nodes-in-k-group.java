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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode();

        ListNode temp=dummy;
        ListNode prev=dummy;


        prev.next=head;

        while(check(temp,k))
        {
            int t=k;

           


            while(t!=0)
            {
                temp=temp.next;
                t--;
            }
            ListNode miss=temp.next;
            ListNode hd=prev.next;

            temp.next=null;
            prev.next=reverse(prev.next);
            temp=hd;
            temp.next=miss;
            prev=temp;
            //temp=miss;
        }

      return dummy.next;
        
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev=null; 
        ListNode temp=head;
        ListNode front;

        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public boolean check(ListNode head,int k)
    {
        ListNode temp=head;
     //   k--;

        while(k!=0 && temp!=null)
        {
            temp=temp.next;
            k--;
        }
       
       if(temp==null)
       {
         return false;
       }
       return true;
    }
}