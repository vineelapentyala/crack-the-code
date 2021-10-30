public class Partition {
    static class ListNode{
        ListNode next = null;
        int data;
        public ListNode(int d){
            data = d;
        }
        void appendToTail(int d){
            ListNode end = new ListNode(d);
            ListNode n = this;
            while(n.next != null){
                n = n.next;
            }
            n.next = end;
        }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        boolean leftSet = false;
        boolean rightSet = false;
        ListNode leftPointer = new ListNode();
        ListNode rightPointer = new ListNode();
        ListNode pointer = head;
        while(pointer != null){
            if (pointer.val < x){
                if (!leftSet){
                    left.next = pointer;
                    left = left.next;
                    leftSet = true;
                }
                leftPointer.next = pointer;
                leftPointer = leftPointer.next;
            }
            else{
                if (!rightSet){
                    right.next = pointer;
                    right = right.next;
                    rightSet = true;
                }
                rightPointer.next = pointer;
                rightPointer = rightPointer.next;
            }
            pointer = pointer.next;

        }
        if (!leftSet || !rightSet) return head;
        rightPointer.next = null;
        leftPointer.next = right;
        return left;
    }
}
