package DSA.Linklist;


 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
   static void rotate(ListNode head){
        ListNode temp = head;
        while(temp.next.next!=null){
            temp.next.next = head;
            temp.next = null;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        for(int i=0;i<k;i++){
            Solution.rotate(head);
        }
        return head;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        
    }
}