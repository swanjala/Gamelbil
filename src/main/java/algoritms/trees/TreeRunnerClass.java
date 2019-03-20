package algoritms.trees;


import algoritms.trees.treeTraversal.TreeBuilder;

class RunnerClass {

    public static void main(String [] args){

        /* Displaying data */
        Thread thread = new Thread(new TreeBuilder());
        thread.start();
    }
}