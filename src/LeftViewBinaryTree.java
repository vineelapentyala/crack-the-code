import java.util.*;
class Node {
    int val;
    Node left;
    Node right;
    Node (int value){
        val = value;
    }
}
public class LeftViewBinaryTree {
    //DFS
    public static List<Integer> leftViewDFS(Node n){
        if (n == null) return null;
        Set<Integer> visitedDepths = new HashSet<>();
        Set<Node> visitedNodes = new HashSet<>();
        List<Integer> leftView = new ArrayList<>();
        int depth = 0;
        dfsHelper(n, visitedDepths, visitedNodes, leftView, depth);
        return leftView;
    }
    public static void dfsHelper(Node n, Set<Integer> visitedDepths, Set<Node> visitedNodes, List<Integer> leftView, int depth){
        if (n == null || visitedNodes.contains(n)) return;
        if (!visitedDepths.contains(depth)){
            leftView.add(n.val);
            visitedDepths.add(depth);
        }
        visitedNodes.add(n);
        dfsHelper(n.left, visitedDepths,visitedNodes, leftView, depth + 1);
        dfsHelper(n.right, visitedDepths,visitedNodes, leftView, depth + 1);
    }
    //BFS
    public static void leftViewBFS(Node n){
        Queue<Node> nodeQueue = new LinkedList<Node>();

    }
    public static void main(String[] args){
        Node n = new Node(1);
        n.left = new Node(2);
        n.left.right = new Node(4);
        n.right = new Node(3);
        n.right.left = new Node(5);
        n.right.right = new Node(6);
        n.right.left.right = new Node(7);
        n.right.right.right = new Node(8);
        n.right.right.right.left = new Node(9);
        List<Integer> leftView = leftViewDFS(n);
        for (int i: leftView){
            System.out.println(i);
        }
    }

}
