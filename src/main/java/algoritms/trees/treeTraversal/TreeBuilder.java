package algoritms.trees.treeTraversal;

import algoritms.trees.print_service.AbstractTreePrinter;

public class TreeBuilder implements Runnable {

    public final AbstractTreePrinter iTreePrinter = new CandidateTree();

    public void run() {

        try {

            ((CandidateTree) iTreePrinter).root = new CandidateTreeNodes('1');
            ((CandidateTree) iTreePrinter).root.left = new CandidateTreeNodes('2');
            ((CandidateTree) iTreePrinter).root.right = new CandidateTreeNodes('3');
            ((CandidateTree) iTreePrinter).root.left.left = new CandidateTreeNodes('4');
            ((CandidateTree) iTreePrinter).root.left.right = new CandidateTreeNodes('5');

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
