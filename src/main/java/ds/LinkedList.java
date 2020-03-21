package ds;

public class LinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(100);
        ListNode l2 = new ListNode(234);
        int x = addTwoNumbers(l1, l2).value;
        System.out.printf("%d ", x);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode head = null;
        int sum;
        int carry = 0;

        //go through all nodes
        while (l1 != null || l2 != null) {
            sum = carry;
            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
                System.out.println("l1 = " + l1 + ", sum = " + sum);
            }
            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
                System.out.println("l2 = " + l2 + ", sum = " + sum);
            }

            //add the elements then store only the last digit
            ListNode n = new ListNode(sum % 10); //334 % 10 = 4

            //add to the result list
            if (current == null) {
                current = n; // current = 4
                head = n;
            } else {
                current.next = n;
                current = current.next;
            }

            //calculate the carry
            carry = sum / 10;

            System.out.println("head value " + head.value);

        }

        //no more list elements
        //handle the carry value if available
        if (carry == 1) {
            current.next = new ListNode(1);
        }

        //handle the empty list scenarios
        return head != null ? head : new ListNode(0);
    }
}
