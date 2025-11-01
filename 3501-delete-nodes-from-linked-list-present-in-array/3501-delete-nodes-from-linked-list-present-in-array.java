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
    public ListNode modifiedList(int[] nums, ListNode head) {
         Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            if (!set.contains(curr.val)) vals.add(curr.val);
            curr = curr.next;
        }

        if (vals.isEmpty()) return null;

        curr = head;
        ListNode prev = null;
        for (int v : vals) {
            curr.val = v;
            prev = curr;
            curr = curr.next;
        }

        if (prev != null) prev.next = null;
        return head;
    }
}