public class ReverseNodesInKGroups {
    public static ListNode reverse(ListNode head, int k){
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while(true){
            ListNode kth = getKth(groupPrev, k);
            if(kth == null) break;
            
            ListNode groupNext = kth.next;
            ListNode prev = kth.next, curr = groupPrev.next;

            while(curr != groupNext){
                ListNode nextPtr = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextPtr;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        return dummy.next;
    }

    public static ListNode getKth(ListNode curr, int k){
        while(curr != null && k > 0){
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public static void disp(ListNode head){
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
        System.out.print("null");
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null, curr = head, nextPtr = head;
        while(curr != null){
            nextPtr = nextPtr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        return prev;
    }


    public static ListNode reverseInGroups(ListNode head, int k){
        int groupNum = 1;
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextPtr = null;

        while(temp != null && temp.next != null){
            ListNode kth = temp;

            for(int i=1; i<k; i++){
                if(kth == null) break;
                kth = kth.next;
            }

            if(kth == null) break;
            nextPtr = kth.next;
            kth.next = null;

            ListNode rev = reverseLinkedList(temp);
            if(groupNum == 1){
                head = kth;
            }else{
                prev.next = kth;
            }
            temp.next = nextPtr;
            prev = temp;
            temp = temp.next;
            groupNum++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        ListNode rev = reverseInGroups(head, 4);
        disp(rev);
    }
}
