/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while (temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        ArrayList<Integer> nums=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        for (int i=0;i<arr.size();i++){
            if (!map.contains(arr.get(i))){
                map.add(arr.get(i));
                nums.add(arr.get(i));
            }
        }

        ListNode result=new ListNode(0);
        ListNode res=result;
        for (int i=0;i<nums.size();i++){
            res.next=new ListNode(nums.get(i));
            res=res.next;
        }

        return result.next;
    }
}