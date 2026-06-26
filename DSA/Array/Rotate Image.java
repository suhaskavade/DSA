class rotate_image {
    public void rotate(int[][] matrix) {
        System.out.println("SUhas");
        int rows = matrix.length;
        int cols = matrix[0].length;

        //transpose of matrix
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println("Transpose of Matrix :");
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Rotate image/ Matrix by 90 degree :");
        // reverse the rows
        for(int i=0;i<rows;i++){
            int left = 0;
            int right = rows-1;
            while(left<=right){
                int temp =matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rotate_image r = new rotate_image();

        int arr1[][] = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        int[][] arr2 = {
            {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}
        };

        r.rotate(arr2);
    }
}