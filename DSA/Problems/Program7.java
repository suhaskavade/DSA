package DSA.Problems;


class sol {
    int count_one(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }

   public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int first_one =-1;
        int count_one = count_one(flowerbed);

        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                first_one = i;
                break;
            }
        }
        if(first_one %2==0){
            int one =  (flowerbed.length/2) - count_one ;

            if( n <= one ){
                return true;
            }
            return false;
        }else{
            int one = ((flowerbed.length/2)+1) - count_one ;

            if( n <= one ){
                return true;
            }
            return false;
        }


    }
}

public class Program7 {
    public static void main(String[] args) {
        sol s = new sol();
        int[] arr = new int[]{1,0,0,0,1};
        System.out.println(s.canPlaceFlowers(arr, 1));
    }
}
