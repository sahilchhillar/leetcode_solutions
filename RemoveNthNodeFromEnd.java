public class RemoveNthNodeFromEnd {
    public static ListNode removeNthNode(ListNode head, int n){
        ListNode nextPtr = head;
        for(int i=0; i<n; i++){
            nextPtr = nextPtr.next;
        }
        if(nextPtr == null){
            return head.next;
        }

        ListNode curr = head;
        while(nextPtr.next != null){
            curr = curr.next;
            nextPtr = nextPtr.next;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void display(ListNode head){
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        // n1.next = new ListNode(2);
        // n1.next.next = new ListNode(3);
        // n1.next.next.next = new ListNode(4);
        // n1.next.next.next.next = new ListNode(5);
        int n = 1;

        ListNode res = removeNthNode(n1, n);
        display(res);
    }
}
