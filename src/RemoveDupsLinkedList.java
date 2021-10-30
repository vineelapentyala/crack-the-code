public class RemoveDupsLinkedList {
    static class Node{
        Node next = null;
        int data;
        public Node(int d){
            data = d;
        }
        void appendToTail(int d){
            Node end = new Node(d);
            Node n = this;
            while(n.next != null){
                n = n.next;
            }
            n.next = end;
        }
    }
    //This can be implemented using single pointer as well
    public static void removeDups(Node head){
        Node leftPointer = head;
        Node rightPointer = head.next;
        while(rightPointer != null){
            if (leftPointer.data == rightPointer.data){
                leftPointer.next = rightPointer.next;
            }
            else{
                leftPointer = leftPointer.next;
            }
            rightPointer = rightPointer.next;
        }
    }
    public static void main(String[] args) {
        Node headNode = new Node(1);
        headNode.appendToTail(1);
        headNode.appendToTail(1);
        headNode.appendToTail(2);
//        headNode.appendToTail(3);
//        headNode.appendToTail(4);
//        headNode.appendToTail(6);
//        headNode.appendToTail(6);

        removeDups(headNode);
        Node pointer = headNode;
        while(pointer != null){
            System.out.println(pointer.data + " ");
            pointer = pointer.next;
        }
    }
}
