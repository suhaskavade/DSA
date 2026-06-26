class Miss {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum = (n*(n+1))/2;
        int actual_sum = 0;
        for(int i=0;i<nums.length;i++){
            actual_sum+=nums[i];
        }   
        return sum-actual_sum;
    }
    public int missingNumber1(int[] nums){
        int xor =0;
        for(int i=0;i<=nums.length;i++){
            xor ^=i;
        }
        for(int i:nums){
            xor^=i;
        }
        return xor;
    }
    public static void main(String[] args) {
     int arr[] = new int[]{3,0,1};
        System.out.println(new Miss().missingNumber1(arr));
    }
}