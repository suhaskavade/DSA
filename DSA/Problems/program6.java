package DSA.Problems;


class Solution {
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
            if( count_one >= (flowerbed.length/2) ){
                return true;
            }
            return false;
        }else{
            if(count_one >= (flowerbed.length/2)+1 ){
                return true;
            }
            return false;
        }


    }
}

public class program6 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1,0,0,0,1};
        System.out.println(s.canPlaceFlowers(arr, 1));
    }
}
