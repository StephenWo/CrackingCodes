package amazon;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode intToListNode(int[] nums){
        ListNode head = new ListNode(0);
        ListNode pt = head;
        for(int i = 0; i<nums.length; i++){
            pt.next = new ListNode(nums[i]);
            pt = pt.next;
        }
        return head.next;
    }

    public static void printListNode(ListNode head){
        while(head.next!=null){
            System.out.print( head.val + "->");
            head = head.next;
        }
        System.out.println(head.val);
    }


}
