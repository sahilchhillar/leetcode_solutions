public class Merge2SortedList {
    public static ListNode merge2SortedList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 != null){
            p.next = l1;
        }else{
            p.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
