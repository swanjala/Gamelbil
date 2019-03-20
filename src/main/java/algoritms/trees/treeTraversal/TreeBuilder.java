package algoritms.trees.treeTraversal;

import algoritms.trees.print_service.AbstractTreePrinter;

public class TreeBuilder implements Runnable {

    public final AbstractTreePrinter iTreePrinter = new BinaryTree();

    public void run() {

        try {

            ((BinaryTree) iTreePrinter).root = new BinaryTreeNodes('1');
            ((BinaryTree) iTreePrinter).root.left = new BinaryTreeNodes('2');
            ((BinaryTree) iTreePrinter).root.right = new BinaryTreeNodes('3');
            ((BinaryTree) iTreePrinter).root.left.left = new BinaryTreeNodes('4');
            ((BinaryTree) iTreePrinter).root.left.right = new BinaryTreeNodes('5');

        } finally {

            System.out.println("Preorder traversal of binary tree is");
            iTreePrinter.printPreOrder();

            System.out.println("In Order traversal of binary tree is");
            iTreePrinter.printInOrder();

            System.out.println("Post Order traversal of binary tree is");
            iTreePrinter.printPostOrder();

        }
    }

}
