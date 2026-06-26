package DSA.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class bfs {

    public static void bfsEx(ArrayList<ArrayList<Integer>> arr,Queue<Integer> queue,boolean[] visited ){
        // Boolean Array , node visite keli ki nahi ty sathi 
        
        if(queue.isEmpty()){
            return;
        }
        int node = queue.poll();
        System.out.print(node+" ");

        for(int neighbor : arr.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        bfsEx(arr, queue,visited);

    }

    public static void dfsEx(ArrayList<ArrayList<Integer>> arr,Stack<Integer> s, boolean[] visited){
        
        if(s.isEmpty()) {
            return;
        }   
        int node = s.pop();

            if(visited[node]){
                dfsEx(arr, s, visited);
                return;
            }
            visited[node]=true;
            System.out.print(node+" ");
            for(int neighbor : arr.get(node)){
                    if(!visited[neighbor]){
                        s.push(neighbor);
                    }
            }
        dfsEx(arr, s, visited);
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<>());
        }
        // System.out.println("Enter first :");
        // int x = sc.nextInt();
        // System.out.println("Enter Second :");
        // int y = sc.nextInt();
        // for(int i=0;i<x;i++){
        //     for(int j=0;j<y;j++){
        //         int num = sc.nextInt();
        //         arr.get(i).add(num);
        //     }
        // }
        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(1).add(3);
        arr.get(1).add(4);
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList();
        visited[0]=true;
        queue.add(0);
        bfsEx(arr,queue,visited);

        System.out.println();

        Stack<Integer> s = new Stack<>();
        boolean[] visited1 = new boolean[v];
        s.push(0);
        dfsEx(arr, s, visited1);
                

    }
}
