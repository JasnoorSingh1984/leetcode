class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        print(l1,l2,0,result);
        return result.next;
    }

    public void print(ListNode l1,ListNode l2,int carry,ListNode result){
        if (l1==null && l2==null && carry==0){
            return;
        }

        ListNode temp=result;
        int sum=carry;

        if (l1!=null){
            sum+=l1.val;
            l1=l1.next;
        }

        if (l2!=null){
            sum+=l2.val;
            l2=l2.next;
        }

        temp.next=new ListNode(sum%10);
        temp=temp.next;
        carry=sum/10;

        print(l1,l2,carry,temp);
    }
}