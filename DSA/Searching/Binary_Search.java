package DSA.Searching;

class bin{
    int binary_Search(int[] arr,int num){

        int start =0;
        int end = arr.length -1;
        System.out.println("In Start ");
        int mid;

        while(start<=end){
            mid = (end + start )/2;
            System.out.println("In Loop");
            if(arr[mid]==num){
                return num;
            }

            if(arr[mid]<num){
                start = mid+1;
            }
            if(arr[end]>num){
                end = mid-1;
            }
        }
        return -1;
    }
}
class Binary_Search {

    public static void main(String[] args) {
        bin b = new bin();
        System.out.println(b.binary_Search(new int[]{1,2,3,4,5,6}, 6));
    }
}
