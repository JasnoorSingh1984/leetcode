
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;

        swap(prev,head);

        return dummy.next;
    }
    
    public void swap(ListNode prev,ListNode curr){
        if (curr==null || curr.next==null){
            return;
        }

        ListNode first=curr,second=curr.next;

        first.next=second.next;
        second.next=first;
        prev.next=second;

        swap(first,first.next);
    }
}    