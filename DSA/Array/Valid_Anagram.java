import java.util.*;
public class Valid_Anagram {

    /*An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once. */
    
    
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Valid_Anagram v = new Valid_Anagram();

        System.out.println(v.isAnagram("anagram", "nagaram"));
        System.out.println(v.isAnagram("rat", "cat"));
    }
}
