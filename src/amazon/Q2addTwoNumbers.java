package amazon;

public class Q2addTwoNumbers {
    public static void main(String[] args){
        ListNode ln1 = ListNode.intToListNode(new int[]{2,4,3});
        ListNode ln2 = ListNode.intToListNode(new int[]{5,6,4});
        ListNode.printListNode(addTwoNumbers(ln1,ln2));

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*This is carry adder, be careful with corner cases
        * */
        ListNode result = new ListNode(0);
        ListNode pt = result;
        int c = 0;
        int sum = 0;
        while(l1 != null && l2!=null){
            sum = l1.val + l2.val + c;
            c = sum >= 10 ? 1 : 0;
            pt.next = new ListNode(sum%10);
            l1 = l1.next;
            l2 = l2.next;
            pt = pt.next;
        }

        while (l1!=null){
            sum = l1.val + c;
            c = sum >= 10 ? 1 : 0;
            pt.next = new ListNode(sum%10);
            l1 = l1.next;
            pt = pt.next;
        }

        while (l2!=null){
            sum = l2.val + c;
            c = sum >= 10 ? 1 : 0;
            pt.next = new ListNode(sum%10);
            l2 = l2.next;
            pt = pt.next;
        }

        if(c == 1)
            pt.next = new ListNode(1);

        return result.next;

    }


}

