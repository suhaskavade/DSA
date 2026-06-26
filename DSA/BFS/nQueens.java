package DSA.BFS;

class nQueen{

    static public boolean isSafe(char[][] board,int row,int col,int n){
        // Check upper Column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // check upper left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'
            ){
                return false;
            }
        }

        // check upper right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static public boolean nQueen(char[][] board, int row,int n){

        if(row==n){
            printBoard(board, n);
            return true;
        }

        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                nQueen(board, row+1, n);
                board[row][col]='.';
            }
        }
        return false;
    }
    static public void printBoard(char[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
class run{
    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueen.nQueen(board, 0, n);
    }
}