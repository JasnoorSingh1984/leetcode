/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        
        int left=0;
        int right=arr.size()-1;
        while (left<right){
            if (!arr.get(left).equals(arr.get(right))){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
}