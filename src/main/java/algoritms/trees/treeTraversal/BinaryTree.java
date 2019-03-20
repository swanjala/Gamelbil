package algoritms.trees.treeTraversal;

import algoritms.trees.print_service.AbstractTreePrinter;

/**
 * Ordered or sorted trees.
 * Keep their keys in sorted order
 * traversed from root to leaf
 */
public class  BinaryTree extends AbstractTreePrinter {

    public BinaryTreeNodes root;

    private void printPostOrder(BinaryTreeNodes node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    private void printInOrder(BinaryTreeNodes node){
        if (node == null){
            return;
        }
        System.out.println(node.data + " ");
        printInOrder(node.right);

    }

    private void printPreOrder(BinaryTreeNodes node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " " );
        printPreOrder(node.left);
        printPreOrder(node.right);

    }


    public void printPostOrder() {
        printPostOrder(root);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }


}


