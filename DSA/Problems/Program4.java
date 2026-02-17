package DSA.Problems;

/*
 Reverse Bits
Solved
Easy
Topics
premium lock icon
Companies
Reverse bits of a given 32 bits signed integer.

 

Example 1:

Input: n = 43261596

Output: 964176192

Explanation:

Integer	Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000
Example 2:

Input: n = 2147483644

Output: 1073741822

Explanation:

Integer	Binary
2147483644	01111111111111111111111111111100
1073741822	00111111111111111111111111111110
 

Constraints:

0 <= n <= 231 - 2
n is even.
 

Follow up: If this function is called many times, how would you optimize it?
*/

class rev {
    StringBuilder br = new StringBuilder();
    public int reverseBits(int n) {
        int result =0 ;
        StringBuffer str  = new StringBuffer("");
        int results[] = new int[32]; 
        for (int j =0;j<results.length;j++){
            
            System.out.println(results[j]);
        }

        System.out.println("----------------------------------");
        if(n==0){
            return 0;
        }

        int i =0;
        while(n>0){
            results[i++] =n%2;
            n=n/2;
        }
        System.out.println("----------------------------------");
        for (int j =0;j<results.length;j++){
            System.out.print(results[j]+", ");
        }

        System.out.println();
        for(int j=0;j<32;j++){
            str.append(results[j]);
        }
        System.out.println(str);
        try{
            result = Integer.valueOf(str.toString(),2);
        }catch(NumberFormatException ne){
            System.out.println(ne);
        };

        return result ;

    }
    
}

public class Program4 {

    public static void main(String[] args) {
        System.out.println(new rev().reverseBits(43261596));
    }
}