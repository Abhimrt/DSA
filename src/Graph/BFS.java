package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 *          1----3
 *         /     | \
 *        0      |  5---6  7---8
 *         \     | /
 *          2----4
 *
 *         Time complexity = O(V+E)
 * */


public class BFS {
    public static void main(String[] args) {
        int ver = 9;
        ArrayList<Edge> graph[] = new ArrayList[ver];
//       Assigning the values of the graph
        CreateGraph(graph);

//        Bfs for connected graph
        System.out.print("Connected Graph: ");
        BfsConnected(graph);

//        Bfs for disconnected graph
        System.out.print("\nDisconnected Graph: ");
        boolean vis[] = new boolean[ver];
        for (int i = 0; i < ver; i++) {
            if(!vis[i]){
                BfsDisconnected(graph,vis,i);
            }
        }


    }

    //  Class for the edge
    static class Edge{
        int src;
        int des;
        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    //    Create Graph
    static void CreateGraph(ArrayList<Edge> graph[]){
//        assigning null array list with empty arraylist
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }


//        adding element
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

        graph[7].add(new Edge(7,8));
        graph[8].add(new Edge(8,7));
    }

//    BFS for normal connected graph
    static void BfsConnected(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
//        starting point
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+"  ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    if(!vis[graph[curr].get(i).des]){
                        q.add(graph[curr].get(i).des);
                    }
                }
            }
        }
    }
    //    BFS for normal disconnected graph
    static void BfsDisconnected(ArrayList<Edge> graph[],boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
//        starting point
        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+"  ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    if(!vis[graph[curr].get(i).des]){
                        q.add(graph[curr].get(i).des);
                    }
                }
            }
        }
    }
}
