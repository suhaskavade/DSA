package DSA.Problems;

import java.nio.channels.Pipe.SourceChannel;

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