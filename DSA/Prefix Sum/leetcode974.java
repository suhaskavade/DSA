class leetcode974{
   static public int subarraysDivByK(int[] nums, int k) {
        int count =0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum =0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
class client{
    public static void main(String[] args) {
        int arr[] = new int[]{4,5,0,-2,-3,1};
        System.out.println(leetcode974.subarraysDivByK(arr, 5));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}