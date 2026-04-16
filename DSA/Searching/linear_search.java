package DSA.Searching;

public class linear_search {
    
    int lin_search(int[] arr,int num){

        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public static void main(String[] args){
     System.out.println( new linear_search().lin_search(new int[]{10,20,30,40}, 40));  

    }
}
