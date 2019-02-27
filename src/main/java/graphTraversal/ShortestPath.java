package graphTraversal;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ShortestPath {
    /* Class find the vertex with minimum distance value
    **/
    static final int vertices = 9;
    int minimumDistance(int distances[], Boolean dataSet[]){
        int minimum = Integer.MAX_VALUE, mininmumIndex = -1;

        for (int vertex = 0; vertex< vertices; vertex++){
            if(dataSet[vertices] == false && distances[vertices] <= minimum){
                minimum = distances[vertices];
                mininmumIndex = vertex;
            }
        }
        return mininmumIndex;
    }

    void printSolution(int distances[], int item ){
        System.out.println("Vertex distance from source");
        for (int index = 0; index < vertices ; index++) {
            System.out.println(index+ " tt "+ distances[index]);
        }
    }

    void dijkstra(int graph[][], int source){
        int distances[] = new int[vertices];
        Boolean dataSet[] = new Boolean[vertices];

        for (int index = 0; index <vertices ; index++) {
            distances[index] = Integer.MAX_VALUE;
            dataSet[index] = false;
        }
        distances[source] = 0;
        int sourceInFirstIteration = minimumDistance(distances, dataSet);
        dataSet[sourceInFirstIteration] = true;

        for (int count = 0; count < vertices- 1 ; count++) {

            if (!dataSet[vertices] && graph[sourceInFirstIteration][vertices] != 0
                    && distances[sourceInFirstIteration] != Integer.MAX_VALUE &&
                    distances[sourceInFirstIteration] + graph[sourceInFirstIteration][vertices]
            < distances[vertices]) {
                distances[vertices] = distances[sourceInFirstIteration] + graph[sourceInFirstIteration]
                        [vertices];
            }

        }
        printSolution(distances, vertices);
    }

    public static void main(String [] args){
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        ShortestPath shortestPath = new ShortestPath();
        shortestPath.dijkstra(graph, 0);
    }
}
