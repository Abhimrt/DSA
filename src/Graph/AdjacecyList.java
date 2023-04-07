package Graph;

import java.util.ArrayList;

public class AdjacecyList {
    public static void main(String[] args) {
        int ver = 4;
        ArrayList<Edge> graph[] = new ArrayList[ver];
//       Assigning the values of the graph
        CreateGraph(graph);

        int pr = 2;
//        Print pr's neighbour
        for(int i = 0;i< graph[pr].size();i++){
            System.out.println("Source: "+graph[pr].get(i).src+" Destination: "+graph[pr].get(i).des+" Weight: "+graph[pr].get(i).wt);
        }
    }

//  Class for the edge
    static class Edge{
        int src;
        int des;
        int wt;
        Edge(int s, int d,int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

//    Create Graph
    static void CreateGraph(ArrayList<Edge> graph[]){
//        assigning null array list with empty arraylist
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

//        adding element
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,2,2));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,0,4));
        graph[2].add(new Edge(2,1,5));
        graph[2].add(new Edge(2,3,6));

        graph[3].add(new Edge(3,1,7));
        graph[3].add(new Edge(3,2,8));
    }

}
