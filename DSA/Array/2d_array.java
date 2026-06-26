

 class two_array {

    boolean searchmatrix(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

       public boolean colSearch(int[][]arr,int target,int row){
                int low = 0;
                int high = arr[row].length-1;
                while(low<=high){
                    int midcol = low+(high-low)/2;
                    if(arr[row][midcol]==target){
                        return true;
                    }else if(arr[row][midcol]<target){
                        low=midcol+1;
                    }else{
                        high = midcol-1;
                    }
                }
                return false;
    }
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int low=0;
        int high = row-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid][0]<=target && arr[mid][col-1]>=target){
                return colSearch(arr,target,mid);
            }else if(arr[mid][col-1]<=target){
                low= mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }


    public boolean searchMatrix2(int[][] matrix, int target) {
        int row= matrix.length; 
        int col = matrix[0].length;
        int high = col-1;
        int low=0;
        while(low<row&&high>=0){
            if(matrix[low][high]==target){
                return true;
            }else if(matrix[low][high]>target){
                high--;
            }else{
                low++;
            }
        }
        return false;
    }

}
class sol{
    public static void main(String[] args) {
        two_array t = new two_array();
        int arr[][] = new int[3][3];
        arr[0][0]= 0;
        arr[0][1]= 1;
        arr[0][2]= 2;

        arr[1][0]= 3;
        arr[1][1]= 4;
        arr[1][2]= 5;

        arr[2][0]= 6;
        arr[2][1]= 7;
        arr[2][2]= 8;

       boolean b = t.searchmatrix(arr, 2);
        System.out.println("Answer: "+b);

        boolean b1 = t.searchMatrix(arr, 2);
        System.out.println("Answer: "+b1);

        boolean b2 = t.searchMatrix2(arr, 2);
        System.out.println("Answer: "+b2);
    }
}
