package algoritms.graphs.graphTraversal;

import java.util.*;
class GraphBreadthFirst
{
    private int numberOfVertices;
    private LinkedList<Integer> adjacencyList[];

    GraphBreadthFirst(int vertices)
    {
        numberOfVertices = vertices;
        adjacencyList = new LinkedList[numberOfVertices];

        for (int index = 0; index < vertices ; index++) {
            adjacencyList[index] = new LinkedList();
        }
    }
    void addEdge(int vertex, int edge){
        adjacencyList[vertex].add(edge);
    }

    void breadthFirstSearch (int source )
    {
        boolean isVisited[] = new boolean [numberOfVertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        isVisited[source] = true;
        queue.add(source);

        while (queue.size() != 0){
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> iterator = adjacencyList[source].listIterator();

            while(iterator.hasNext()){
                int item = iterator.next();
                if(!isVisited[item]){
                    isVisited[item] = true;
                    queue.add(item);
                }
            }
        }
    }
    void depthFirstSearchUtil(int vertex, boolean visited[]) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        Iterator<Integer> iterator = adjacencyList[vertex].listIterator();
        while (iterator.hasNext()){
            int item = iterator.next();
            if(!visited[item]){
                depthFirstSearchUtil(item, visited);
            }
        }
    }
    void depthFirstSearch(int vertex){
        boolean visited[] = new boolean[numberOfVertices];
        depthFirstSearchUtil(vertex, visited);
    }

    public static void main(String args[]){
        GraphBreadthFirst graphBreadthFirst = new  GraphBreadthFirst(4);
        graphBreadthFirst.addEdge(0,1);
        graphBreadthFirst.addEdge(0,2);
        graphBreadthFirst.addEdge(1,2);
        graphBreadthFirst.addEdge(2, 0);
        graphBreadthFirst.addEdge(2,3);
        graphBreadthFirst.addEdge(3,3);

        System.out.println("Breadth first traversal, Starting from vertex 2");

        graphBreadthFirst.breadthFirstSearch(2);

        // depth first lists
        graphBreadthFirst.depthFirstSearch(3);

    }

}
