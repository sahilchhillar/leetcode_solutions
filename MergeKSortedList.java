import java.util.Arrays;

public class MergeKSortedList {
    public static ListNode merge2Lists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 != null) p.next = l1;
        else p.next = l2;

        return dummy.next;
    }

    public static ListNode mergeKLists(ListNode[] lists){
        ListNode result = lists[0];
        for(int i=1; i<lists.length; i++){
            result = merge2Lists(result, lists[i]);
        }

        return result;
    }

    public static ListNode mergeKListsOptimised(ListNode[] lists){
        if(lists.length == 0) return null;
        while(lists.length > 1){
            ListNode[] mergedLists = new ListNode[lists.length/2+1];
            int k=0;
            for(int i=0; i<lists.length; i=i+2){
                ListNode l1 = lists[i];
                ListNode l2 = null;
                if(i+1 < lists.length){
                    l2 = lists[i+1];
                }
                mergedLists[k++] = merge2Lists(l1, l2);
            }
            lists = Arrays.copyOf(mergedLists, mergedLists.length);
        }
        return lists[0];
    }

    public static void display(ListNode head){
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode head = mergeKListsOptimised(lists);

        display(head);
    }
}
