

import java.util.*;
class Sum3{
    List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j<nums.length-1){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[i]+nums[j]+nums[k]==0){
                            if(!arr.contains(Arrays.asList(nums[i],nums[j],nums[k]))){
                                arr.add(Arrays.asList(nums[i],nums[j],nums[k]));
                            }
                            
                        }
             }
            }
        }
        }
        return arr;
    }
    public List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int p1=1;
        for(int i=0;i<nums.length-2;i++){
             for(int j=i+1;j<nums.length-1;j++){
                p1=j+1;
                if(nums[i]+nums[j] +nums[p1]==0){
                List<Integer> list = Arrays.asList(nums[i],nums[j],nums[p1]);
                if(!arr.contains(list)){
                    arr.add(list);
                }
            }
        }
    }
        
        return arr;
    }
    public static void main(String[] args) {
        Sum3 s = new Sum3();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> arr= s.threeSum( nums);
        System.out.println(arr);

        List<List<Integer>> arr1= s.threeSum1( nums);
        System.out.println(arr1);
    }
}