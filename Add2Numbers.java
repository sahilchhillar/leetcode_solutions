public class Add2Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode();
        ListNode p = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int val = num1 + num2 + carry;
            carry = val >= 10 ? 1 : 0;

            p.next = new ListNode(val % 10);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            p = p.next;
        }

        return dummy.next;
    }

    public static void display(ListNode head){
        if(head == null) return;

        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = addTwoNumbers(l1, l2);
        display(res);
    }
}
