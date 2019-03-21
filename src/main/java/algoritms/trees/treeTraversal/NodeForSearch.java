package algoritms.trees.treeTraversal;

class NodeForSearch {
    /**
     * Breadth first ==> level order traversal
     * Depth first Traversals
     * -- in order traversals
     * -- pre-order traversals
     * -- post-order traversals
     */
    int data;
    CandidateTreeNodes left, right;

    public NodeForSearch(int item) {
        data = item;
        left = right = null;
    }

}
    class Traversals{
    /**
     *  @param root: the node root value
    * @param treeHeight: the number of levels that the tree has
     * @param index : counter for the level iteration.
     * @param leftHeight: the level of the left tree.
     * @Param rightHeight: the level of the right node
    * */
        CandidateTreeNodes root;

        public Traversals(){
            root =null;
        }

        void printLevelOrder() {
            //Determine the number of levels of the tree
            int treeHeight = height(root);
            int index;
            /*
            Step through each level and print all the node value in the level
            */

            for (index = 1; index <= treeHeight; index++) {
                printGivenLevel(root, index);
            }
        }

        int height(CandidateTreeNodes root){
                if(root == null){
                    return 0;
                }
                else
                    /* Setting the left node and right node heights for
                    * same level traversal*/
                {
                    int leftHeight =height(root.left);
                    int rightHeight = height(root.right);

                    if(leftHeight > rightHeight){
                        return leftHeight + 1;
                    } else {
                        return leftHeight+1;
                    }
                }
        }

            void printGivenLevel(CandidateTreeNodes root, int level){
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
                traversals.root = new CandidateTreeNodes('1');
                traversals.root.left = new CandidateTreeNodes('2');
                traversals.root.right = new CandidateTreeNodes('3');
                traversals.root.left.left = new CandidateTreeNodes('4');
                traversals.root.left.right = new CandidateTreeNodes('5');

                System.out.println("Level order traversal of binary tree is:");
                traversals.printLevelOrder();

            }
        }

