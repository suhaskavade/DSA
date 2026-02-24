package DSA.Problems;

/*
    Product of Array Except Self
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/



 class Program8 {


    // Brout Force

    /* 
    int[] pro(int nums[]){

        int newArr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int mul = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                mul = mul * nums[j];
            }
            newArr[i]=mul;
        }
        return newArr;
    }
    */

    // Optimize with more Space Complexity

    int[] pro(int[] nums){

        int leftMul= 1;
        int rightMul = 1;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] newArr = new int[nums.length];
        for(int i=0;i<left.length;i++){
            if(i==0){
                left[i] =1;
                continue;
             }
            leftMul = leftMul * nums[i-1];
            left[i]= leftMul;
        }

         for(int i=right.length-1;i>=0;i--){
            if(i==right.length-1){
                right[i] =1;
                continue;
             }
            rightMul = rightMul * nums[i+1];
            right[i]= rightMul;
        }

        for(int i=0;i<newArr.length;i++){
            newArr [i] = left[i] * right[i];
        }
    
        return newArr;
    }

}

 class client_demo {

        public static void main(String[] args) {
            Program8 p = new Program8();

             int[] arr = new int[]{1,2,3,4};
             int[] newarr= p.pro(arr);
             for(int j=0;j<newarr.length;j++){
                System.out.println(newarr[j]);
            }
        }
}
