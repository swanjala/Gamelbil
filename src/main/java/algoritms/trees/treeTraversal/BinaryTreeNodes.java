package algoritms.trees.treeTraversal;

public class Node {
    char data;
    Node left, right;

    protected Node(char item) {
        data = item;
        left = right = null;
    }
}
