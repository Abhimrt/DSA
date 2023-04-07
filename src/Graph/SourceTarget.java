package Graph;

/*
 *          1----3
 *         /     | \
 *        0      |  5---6  7---8
 *         \     | /
 *          2----4
 *
 *         In this program we will tell the no of paths between 0 and 5
 * */

import java.util.ArrayList;
public class SourceTarget {
    static class Edge{
        int src;
        int des;
        Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void main(String[] args) {
        int ver = 9;
        ArrayList<Edge> graph[]= new ArrayList[ver];
        addEdges(graph);
        boolean vis[] = new boolean[ver];
        int start = 0;
        int target = 5;
        Dfs(graph,vis,start,target,new String("0"));

    }
    static void addEdges(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

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

    static void Dfs(ArrayList<Edge> graph[], boolean vis[], int curr,int target,String path){
        if(curr == target){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            int temp = graph[curr].get(i).des;
            if(!vis[temp]){
                vis[curr] = true;
                Dfs(graph,vis,temp,target,path+temp);
                vis[curr] = false;
            }
        }

    }
}
