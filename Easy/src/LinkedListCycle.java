public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr.next != null && fastptr.next.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr == slowptr)
                return true;
        }
        return false;
    }
}
