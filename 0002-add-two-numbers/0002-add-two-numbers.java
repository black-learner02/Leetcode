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

          StringBuilder first = new StringBuilder();

          StringBuilder sec = new StringBuilder();

         long res=-1;

         ListNode a=l1;
         ListNode b=l2;

         while(a!=null)
         {
             first.append(a.val);
             a=a.next;
         }

        while(b!=null)
        {
            sec.append(b.val);
            b=b.next;
        }
      
        
         res=reverse(first)+reverse(sec);

         System.out.println(res);

         if(res==0)
         {
            return new ListNode(0);
         }

         ListNode head=null;

         while(res!=0)
         {
            ListNode newNode = new ListNode((int)(res%10));

            if(head==null)
            {
                head=newNode;
                res/=10;
                continue;
            }
            
            ListNode temp=head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=newNode;
            res/=10;
            
         }
       

     return head;


    }

   public long reverse(StringBuilder num) {

    String rev = num.reverse().toString();
    return Long.parseLong(rev);
}

}