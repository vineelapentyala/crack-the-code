public class ReturnKthToLast {
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
    public static int returnKthToLastElement(Node head, int k){
        Node fastPointer = head;
        Node slowPointer = head;
        k--;
        while (k > 0){
            fastPointer = fastPointer.next;
            k--;
        }
        while(fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer.data;
    }

    public static void main(String[] args) {
        Node headNode = new Node(1);
        int i = 2;
        while ( i < 10){
            System.out.print(i + " ");
            headNode.appendToTail(i);
            i++;
        }
        System.out.println();
        System.out.println(returnKthToLastElement(headNode, 1));
    }
}
