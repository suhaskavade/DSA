package DSA.Searching;

class Search {

    // Linear Search
    int linear_search(int arr[],int Search_num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==Search_num){
                return i ;
            }
        }
        return -1;
    }

    // Recursion Linear Search
    int Linear_search_recursion(int arr[],int start,int end,int search_ele){
        if(start == arr.length){
            return -1;
        }
        if(arr[start]== search_ele){
            return start;
        }
        return Linear_search_recursion(arr, start+1, end, search_ele);
    }

    // Binary Search

    int binary_search(int arr[],int search_ele){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start<=end) {
            mid = (start+end)/2;
            if(arr[mid]==search_ele){
                return mid;
            }
            else if(arr[mid]>search_ele){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    int Binary_recursion(int arr[],int start,int end,int search_ele){

        //End Condition
        if(start>end){
            return -1;
        }

        int mid = (start+end)/2;

        // Match Condition
        if(arr[mid]==search_ele)
                return mid;

        // Shift Right Side 
        if(arr[mid]<search_ele){
           return Binary_recursion(arr, mid+1, end, search_ele);
        }
        //Shift Left Side
        else{
            return Binary_recursion(arr, start, mid-1, search_ele);
        }
    
    }
    
    
}


public class Searching {
    public static void main(String[] args) {
        Search s = new Search();

        
        int arr[] = new int[]{50,20,40,30,10};
        int arr1[] = new int[]{10,20,30,40,50};

        // Linear Search
        int lin = s.linear_search(arr, 10);
        // Recursion Linear Search
        int lin_rec =s.Linear_search_recursion(arr, 0, arr.length-1, 60);
        // Binary Search
        int bin = s.binary_search(arr1, 50);
        // Recursion Binary Search
        int bin_rec = s.Binary_recursion(arr1,0,arr1.length-1, 50);







        // Linear Search
        System.out.println("Present in Index : " + (lin==-1 ?"NOT Present" : lin ));
        // Recursion Linear Search
        System.out.println("Present in Index : " +(lin_rec==-1 ?"Not Found": lin_rec));
        // Binary Search
        System.out.println("Present in Index : " + (bin==-1 ?"NOT Present" : bin ));
        // Recursion Binary Search
        System.out.println("Present in Index : " + (bin_rec==-1 ?"NOT Present" : bin_rec ));

    }
}
