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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null)
        {
            return null;
        }

        ListNode temp=head;
        int len=0;
        while(temp.next!=null)
        {
            len++;
            temp=temp.next;
        }
        len++;
        
        int rotate=k%len;


        if(rotate==0)
        {
            return head;
        }

         head=reverse(head);

        ListNode temp1=head;

        while(rotate>1)
        {
           temp1=temp1.next;
           rotate--;
        }
       
        ListNode mid=reverse(temp1.next);


        temp1.next=null;

        head=reverse(head);
        
        ListNode tra=head;

        while(tra.next!=null)
        {
            tra=tra.next;      
            
          }


        tra.next=mid;
        
        return head;

    }

    public ListNode reverse(ListNode head)
    {
        ListNode temp=head;
        ListNode front;
        ListNode prev=null;

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