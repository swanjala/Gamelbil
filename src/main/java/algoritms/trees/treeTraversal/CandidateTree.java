package algoritms.trees.treeTraversal;

import algoritms.trees.print_service.AbstractTreePrinter;

/**
 * Ordered or sorted trees.
 * Keep their keys in sorted order
 * traversed from root to leaf
 */
public class CandidateTree extends AbstractTreePrinter {

    protected CandidateTreeNodes root;

    /* Start with the left and right children and their subsequent children
     before visiting the parent node (Visit the parent node last)
     */
    private void printPostOrder(CandidateTreeNodes node){
        if(node == null){
            /* Stop the execution of the recursion
            * move back to the call*/
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }
    /*Begin with the left subrees and their left subrees(if any exists),
    * then visit the root then then implement the left subtree first search
    * recursively to the right subtree, and visit the right nodes on completion
    * */

    private void printInOrder(CandidateTreeNodes node){


        if (node == null){
            /* Stop the execution of the recursion
             * move back to the call*/
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data + " ");
        printInOrder(node.right);

    }

    /*Begin with the root node and visit the left subree recursively,
      then visit the right tree
     */

    private void printPreOrder(CandidateTreeNodes node){
        if(node == null){
            /* Stop the execution of the recursion
             * move back to the call*/
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


