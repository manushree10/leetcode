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
    public ListNode reverseList(ListNode head) {
        //   ListNode node = null;

        // while (head != null) {
        //     ListNode temp = head.next;
        //     head.next = node;
        //     node = head;
        //     head = temp;
        // }

        // return node; 

        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next; // Store next node
            curr.next = prev; // Reverse link
            prev = curr; // Move prev to current node
            curr = nextNode; // Move to next node
        }
        
        return prev; // New head of reversed list
    }
    
}  
