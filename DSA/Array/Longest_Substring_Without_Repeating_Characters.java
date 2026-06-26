
import java.util.ArrayList;

public class Longest_Substring_Without_Repeating_Characters {

    int longest(String s){
        char[] chararr = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        int count = 0;
        int max =0;
        for(int i=0;i<chararr.length;i++){
            if(!arr.contains(chararr[i])){
                arr.add(chararr[i]);
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                int index = arr.indexOf(chararr[i]);
                arr.subList(0,index ).clear();
                arr.add(chararr[i]);
                count=i-index;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters l = new Longest_Substring_Without_Repeating_Characters();

        String s = "abcabcbb";
        String s1 = "pwwkew";
        System.out.println("Count :"+l.longest(s1));
    }
}
