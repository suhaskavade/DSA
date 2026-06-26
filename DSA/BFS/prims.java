package DSA.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class pair{
    int node;
    int weight;
    pair(int node,int weight){
        this.node= node;
        this.weight=weight;
    }
}

class prims{
    static int sum =0;

   static public void primsAlgo(ArrayList<ArrayList<pair>> arr,PriorityQueue<pair> pq,boolean[] visited){
            
            if(pq.isEmpty()){
                return;
            } 

            pair currPair = pq.poll();

            int node = currPair.node;
            int weight = currPair.weight;

            if(visited[node]){
                primsAlgo(arr, pq, visited);
                return;
            }
            visited[node]=true;
            
            sum+=weight;

            for(pair neighPair : arr.get(node)){
                if(!visited[neighPair.node]){
                    pq.add(new pair(neighPair.node, neighPair.weight));
                }
            }
        
            primsAlgo(arr, pq, visited);
            
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<pair>> arr = new ArrayList<>();
        System.out.println(arr.size());
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<>());
        }

        arr.get(0).add(new pair(1, 2));
        arr.get(0).add(new pair(0, 2));

        arr.get(0).add(new pair(2, 6));
        arr.get(0).add(new pair(0, 6));

        arr.get(0).add(new pair(3, 5));
        arr.get(0).add(new pair(0, 5));

        arr.get(0).add(new pair(3, 4));
        arr.get(0).add(new pair(2, 4));

        arr.get(0).add(new pair(3, 3));
        arr.get(0).add(new pair(1, 3));
        boolean[] visited = new boolean[v];

        PriorityQueue<pair>  pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new pair(0, 0));
        primsAlgo(arr, pq, visited);
        System.out.println("Sum: "+sum);

    }

}