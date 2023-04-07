package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphImplementaion {
    public static void main(String[] args) {
        AdjacencyL();
    }
//    Adjacency Matrix
    static void AdjacencyM(){
        int vertex = 5;
        int arr[][] = new int[vertex+1][vertex+1]; // +1 so we dont have to put -1 everywhere;
        addEdge(arr,3,5);
        addEdge(arr,5,4);
        addEdge(arr,1,5);
        addEdge(arr,1,4);
        addEdge(arr,1,2);
        addEdge(arr,2,4);
        for(int[] i :arr){
            System.out.println(Arrays.toString(i));
        }
    }

    static void addEdge(int[][] arr,int source,int destination){
        arr[source][destination] = 1;
        arr[destination][source] = 1;
    }

//    adjacency list
    static void AdjacencyL(){
        int vertix = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<vertix+1;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,5,4);
        addEdge(adj,1,5);
        addEdge(adj,1,4);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,3,5);
        for(ArrayList<Integer> i:adj){
            System.out.println(i);
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int destination){
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }
}
