class Solution {
    public ListNode reverseList(ListNode head) {
        return print(null,head);
    }

    public ListNode print(ListNode prev,ListNode curr){
        if (curr==null){
            return prev;
        }

        ListNode second=curr.next;

        curr.next=prev;
        prev=curr;
        curr=second;

        return print(prev,curr);        
    }
}