package DSA.Searching;

class Search {

    boolean linear_search(int arr[],int Search_num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==Search_num){
                return true;
            }
        }
        return false;
    }

    boolean Linear_search_recursion(int arr[],int start,int end,int search_ele){
        if(start == arr.length){
            return false;
        }
        if(arr[start]== search_ele){
            return true;
        }
        return Linear_search_recursion(arr, start+1, end, search_ele);
    }
    
}


public class Searching {
    public static void main(String[] args) {
        Search s = new Search();

        int arr[] = new int[]{10,20,30,40,50};
       System.out.println(s.linear_search(arr, 10));
       System.out.println(s.Linear_search_recursion(arr, 0, arr.length-1, 60));

    }
}
