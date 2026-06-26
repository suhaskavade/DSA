
class Solution {
        public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length];
        arr[0]=0;
        arr[1]=gain[0];
        int max =Integer.MIN_VALUE;
        for(int i=2;i<arr.length;i++){
            int sum = gain[i-1]+arr[i-1];
            arr[i]=sum;
            }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        //-4,-3,-2,-1,4,3,2
        //-5,1,5,0,-7
        int arr[] = new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(s.largestAltitude(arr));
    }
}