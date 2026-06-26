package DSA.Problems;

class Problem14 {
    public boolean checkSubarraySum(int[] nums, int k) {
    if(nums.length<2){
        return false;
    }
     int[] pre = new int[nums.length];
     pre [0] = nums[0];
     for(int i=1;i<nums.length;i++){
        
        pre[i]= pre[i-1]+nums[i];
        if(pre[i]==0){
            System.out.println("From 0");
            return true;
        }
        if(pre[i]%k==0){
            System.out.println("from %");
            return true;
        }
     } 
    return false;

    }
    public static void main(String[] args) {
        Problem14 su = new Problem14();
        int[] arr = new int[]{23,2,6,4,7};
        System.out.println(su.checkSubarraySum(arr, 13));
        
    }
}


