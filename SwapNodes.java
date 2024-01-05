public class SwapNodes {
    public static ListNode swapNodes(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode curr = head, nextPtr = head.next;
        curr.next = nextPtr.next;
        nextPtr.next = curr;

        ListNode newHead = nextPtr, prev = curr;
        curr = curr.next;
        while(curr != null && curr.next != null){
            nextPtr = curr.next;
            prev.next = nextPtr;
            curr.next = nextPtr.next;
            nextPtr.next = curr;
            prev = curr;
            curr = curr.next;
        }

        return newHead;
    }

    public static void disp(ListNode head){
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode newHead = swapNodes(head);
        disp(newHead);
    }
}
