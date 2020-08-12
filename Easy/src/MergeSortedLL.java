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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode();
        ListNode temp = l3;
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                temp.next = l1;//Why not l3.val = l1?
                l1 = l1.next;
            }
            else
            {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;//Why?
        }
            if(l1!=null)
            {
                temp.next = l1;
            }
            if(l2!=null)
            {
                temp.next = l2;
            }
             return l3.next;
        }
    }
