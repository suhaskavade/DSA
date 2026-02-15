package Java;
//Sequence pair



import java.util.Scanner;

class Sequence_pair{

    // For 2 pairs
    //given an charecter array return the count of pairs(i,j)
   void Sequence_of_2(String a,String b,String[] arr){
    int count=0;
    int pair =0;
    for(int i=0;i<arr.length;i++){
        
        if(arr[i].equals(a)){
            count ++;
        }else if(arr[i].equals(b)){
            pair = pair+count;
        }
    }
    
    System.out.println("Number of Pair :"+pair);
   }


   
   // For 3pairs 
   //given an charecter array return the count of pairs(i,j,k) 
   void sequence_of_3(String a,String b,String c,String[] arr){

    int countA=0;
    int countB=0;
    int pair =0;

    for(int i=0;i<arr.length;i++){
        if(arr[i].equals(a)){
            countA ++;
        }else if(arr[i].equals(b)){
            countB = countB+countA;
        }
        else if(arr[i].equals(c)){
            pair = pair+countB;
        }
    }
    System.out.println("Number of Pair :"+pair);
   }
   
    public static void main(String [] args){
        Sequence_pair sp = new Sequence_pair();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arr");
        System.out.println("Enter arr Size:");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("Which no of pair Want?");
        System.out.println("1. 2_pair");
        System.out.println("2. 3_pair");
        System.out.println("Enter Choice :");
        int ch = sc.nextInt();

        if(ch==1){

            System.out.println("Enter 1st Char:");
            String a = sc.next();
            System.out.println("Enter 2nd Char:");
            String b = sc.next();
            sp.Sequence_of_2(a,b,arr);
        }else if(ch==2){
            System.out.println("Enter 1st Char:");
            String a = sc.next();
            System.out.println("Enter 2nd Char:");
            String b = sc.next();
            System.out.println("Enter 3rd Char:");
            String c = sc.next();
            sp.sequence_of_3(a,b,c,arr);
        }
    }
}