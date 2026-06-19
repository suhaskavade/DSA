import java.util.HashSet;

public class Contains_Duplicate {
    
   public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i : nums){
            if(!set.add(i)){
                return true;
            }
       }
       return false;
       
    }
    public static void main(String[] args) {
        
        Contains_Duplicate c = new Contains_Duplicate();
        //1,2,3,4
        //1,2,3,1
        int arr[] = new int[]{1,2,3,4};
        System.out.println(c.containsDuplicate(arr));
    }
}

