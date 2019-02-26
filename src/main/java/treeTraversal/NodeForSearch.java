package treeTraversal;

class NodeForSearch {
    /**
     * Breadth first ==> level order traversal
     * Depth first Traversals
     * -- in order traversals
     * -- pre-order traversals
     * -- post-order traversals
     */
    int data;
    Node left, right;

    public NodeForSearch(int item) {
        data = item;
        left = right = null;
    }

}
    class Traversals{
        Node root;

        public Traversals(){
            root =null;
        }

        void printLevelOrder() {

            int h = height(root);
            int i;
            for (i = 1; i <= h; i++) {
                printGivenLevel(root, i);
            }
        }

        int height(Node root){
                if(root == null){
                    return 0;
                }
                else
                {
                    int lheight =height(root.left);
                    int rheight = height(root.right);

                    if(lheight > rheight){
                        return lheight + 1;
                    } else {
                        return lheight+1;
                    }
                }
        }

            void printGivenLevel(Node root, int level){
                if (root== null){
                    return;
                }
                if(level == 1){
                    System.out.print(root.data + " ");

                } else if (level > 1){
                    printGivenLevel(root.left, level -1);
                    printGivenLevel(root.right, level- 1);
                }
            }

            public static void main(String args[]){
                Traversals traversals = new Traversals();
                traversals.root = new Node('1');
                traversals.root.left = new Node('2');
                traversals.root.right = new Node('3');
                traversals.root.left.left = new Node('4');
                traversals.root.left.right = new Node('5');

                System.out.println("Level order traversal of binary tree is:");
                traversals.printLevelOrder();

            }
        }

