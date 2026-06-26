import java.util.ArrayList;
import java.util.List;

public class Anagram_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        int Window_size=p.length();
        
        for(int i=0;i<s.length();i++){
            if(p.contains(s.charAt(i)+"")){
                for(int j=i+1;j<i+Window_size;j++){
                    if(!p.contains(s.charAt(j)+"")){
                        break;
                    }
                    if(j==i+Window_size-1){
                        arr.add(i);
                    }
                }   
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Anagram_String a = new Anagram_String();
        System.out.println(a.findAnagrams("cbaebabacd", "abc"));
    }
}

