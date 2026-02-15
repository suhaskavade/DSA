package Java;
import java.util.Scanner;

public class Equilibrium_index {
    
    int Equilibrium_index_func(int[] arr){
        int arr1[] = new int[arr.length];
        int sum1 = arr[0];
        arr1[0]=arr[0];
        
        for(int i=1;i<arr.length-1;i++){
            sum1 = sum1+arr[i];
            arr1[i]=sum1;
        }

       
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr1[i]+" ,");
        }
        System.out.println(" ]");
    
        for(int i=0;i<=arr.length-1;i++){
            // first Element
            if(i==0){
                if((arr1[arr1.length-1]-arr1[i])==0){
                    return i;
                }
            }
            //last element
            else if(i==arr.length-1){
                if(arr1[i-1]==0){
                    return i;
                }
            }
            //Middle Elements
            else{
                if(arr1[i-1]==(arr1[arr1.length-1]-arr1[i+1])-arr1[i]){
                return i;
                }
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equilibrium_index eq = new Equilibrium_index();

        int[] arr = new int[]{-7,1,5,2,-4,3,0};
        int index =  eq.Equilibrium_index_func(arr);
        System.out.print("Equilibrium Index : "+index);
    }   
}
