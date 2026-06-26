package DSA.Recursion;

public class program1 {
    // Tail Recursion
    int tail(int num){
        if(num <=0)
            return 0;
        System.out.println(num);
        return num + tail(--num);
    }

    // Non-Tail recursion
    void non_tail(int num){
        if(num<1){
            return ;
        }
        non_tail(--num);
        System.out.println(num);
    }

    // Binary Recursion
    void binary_rec(){
        tail(10);
        non_tail(200);
    }
}

class solution{

        public static void main(String[] args) {
            program1 p = new program1();

            p.tail(5);
            System.out.println(" --------------------------------------------");
            System.out.println("|                                            |");
            System.out.println("|                                            |");
            System.out.println("|                Recursion                   |");
            System.out.println("|                                            |");
            System.out.println("|                                            |");
            System.out.println("|                                            |");
            System.out.println(" --------------------------------------------");
            p.non_tail(5);
        }
}