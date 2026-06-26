package DSA.Problems;


/*
    Reverse Vowels of a String
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Program5 {

    private boolean isVowel(char s){

        if("aeiouAEIOU".indexOf(s)!=-1){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] string = s.toCharArray();

        for(int i=0;i<string.length;i++){
            System.out.println(string[i]);
        }
        int ptr1 =0;
        int ptr2 = string.length-1;
        
        while (ptr1<ptr2) {

                while ( ptr1<ptr2 && !isVowel(string[ptr1])) {
                    ptr1++;
                }
                while ( ptr1<ptr2 && !isVowel(string[ptr2])) {
                    ptr2--;
                }
                    char temp = string[ptr1];
                    string[ptr1] = string[ptr2];
                    string[ptr2]= temp;
                    ptr1++;
                    ptr2--;
          
        };
        return new String(string) ;
    }
    
}

class client{
    public static void main(String[] args) {
        Program5 p = new Program5();
        p.reverseVowels("IceCream");
    }
}
