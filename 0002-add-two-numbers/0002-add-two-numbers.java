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
 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder first = new StringBuilder();
        StringBuilder sec = new StringBuilder();

        ListNode a = l1;
        ListNode b = l2;

        while (a != null) {
            first.append(a.val);
            a = a.next;
        }

        while (b != null) {
            sec.append(b.val);
            b = b.next;
        }

        BigInteger num1 = reverse(first);
        BigInteger num2 = reverse(sec);

        BigInteger res = num1.add(num2);  // ✅ Corrected addition

        if (res.equals(BigInteger.ZERO)) {  // ✅ Corrected comparison
            return new ListNode(0);
        }

        // Convert res to string to extract digits
        String resStr = res.toString();
        ListNode head = null;

        // Loop from end to start to get digits in reverse order
        for (int i = resStr.length() - 1; i >= 0; i--) {
            int digit = resStr.charAt(i) - '0';
            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        return head;
    }

    public BigInteger reverse(StringBuilder num) {
        String rev = num.reverse().toString(); 
        return new BigInteger(rev);
    }
}
