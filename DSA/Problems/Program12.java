package DSA.Problems;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int first =-1;
        int last =-1;

        while(low<=high){
            int mid = low+(high-low)/2;
           if(nums.length<=2){
            if(nums.length==1 && nums[0]==target){
                first = 0;
                last =0;
                break;
            }
            else if(nums.length==1 && nums[0]!=target){
                break;
            }
            else if(nums.length==2 && nums[mid]!= target && nums[mid+1]!=target){
                first = -1;
                last = -1;
                break;
            }
            else if(nums.length==2 && nums[mid]== target || nums[mid+1]==target){
                if(nums[mid]== target && nums[mid+1]== target){
                    first = mid;
                    last = mid+1;
                }
                else if (nums[mid]== target){ 
                    first = mid;
                    last = mid;
                    }
                else {
                    first = mid+1;
                    last =mid+1;
                };
                break;
            }
           } 
           if(mid== 0 && nums[mid] == target){
            first = mid;
           }
           else if(nums[mid]==target && nums[mid]>nums[mid-1]){
                first = mid;
            }
           else if(nums[mid]==target && nums[mid]<nums[mid+1]){
                last = mid;
            }

            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{first,last};
    }
}
