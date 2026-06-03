public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map=new HashMap<>();

        ListNode temp=headA;
        while (temp!=null){
            map.put(temp,1);
            temp=temp.next;
        }

        ListNode dummy=headB;
        while (dummy!=null){
            if (map.containsKey(dummy)){
                break;
            }
            dummy=dummy.next;
        }

        return dummy;
    }
}