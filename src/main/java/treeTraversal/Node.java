package treeTraversal;

class Node {
    char data;
    Node left, right;

    public Node(char item) {
        data = item;
        left = right = null;
    }
}

/**
 * Ordered or sorted trees.
 * Keep their keys in sorted order
 * traversed from root to leaf
 */
 class BinaryTree {
        Node root;
        int preIndex = 0;
        Node buildTree(char in[], char pre[], int inStrt, int inEnd){
            if(inStrt > inEnd){
                return null;
            }
            Node tNode = new Node(pre[preIndex++]);

            if (inStrt == inEnd){
                return tNode;
            }
            int inIndex = search(in, inStrt,inEnd, tNode.data);

            tNode.left = buildTree(in, pre, inStrt, inIndex -1);
            tNode.right = buildTree(in, pre, inIndex +1, inEnd);

            return tNode;
        }

        int search(char arr[], int strt, int end, char value) {

            int index;
            for (index = strt; index <= end; index++) {
                if (arr[index] == value) {
                    return index;
                }
            }
            return index;
        }

        void printPostOrder(Node node){
            if(node == null){
                return;
            }
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }


            void printInOrder(Node node){
            if (node == null){
                return;
            }
            printInOrder(node.left);
            System.out.println(node.data + " ");
            printInOrder(node.right);

        }
        void printPreOrder(Node node){
            if(node == null){
                return;
            }
            System.out.println(node.data + " " );
            printPreOrder(node.left);
            printPreOrder(node.right);

        }

        /** Wrappers over above recursive functions
            * summary
         * Post order..
         * Parsing data from the child to the parent
         * visit the root item last
         * complexity s O (n) where n is the number of nodes in the tree.
         */
        void printPostOrder() {
            printPostOrder(root);
        }

     /**
      * In-order
      * Visit the left most node first then visit the right node.
      * Complexity s O (n) where n is the number of nodes in the tree.
      */
     void printInOrder() {
            printInOrder(root);
        }

     /**
      * Start from the root element and visit the left
      * then the right side.
      * Complexity s O (n) where n is the number of nodes in the tree.
      */
     void printPreOrder() {
            printPreOrder(root);
        }

        public static void main(String [] args){
            BinaryTree binaryTree = new BinaryTree();

            binaryTree.root = new Node('1');
            binaryTree.root.left = new Node ('2');
            binaryTree.root.right = new Node('3');
            binaryTree.root.left.left = new Node('4');
            binaryTree.root.left.right = new Node('5');


            /* Displaying data's parsing order*/


            System.out.println("Preorder traversal of binary tree is");
            binaryTree.printPreOrder();

            System.out.println("In Order traversal of binary tree is");
            binaryTree.printInOrder();

            System.out.println("Post Order traversal of binary tree is");
            binaryTree.printPostOrder();

        }
   }


