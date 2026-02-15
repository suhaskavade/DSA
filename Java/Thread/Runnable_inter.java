package Java.Thread;


class memo implements Runnable{

    public void run(){
        System.out.println("In Interfce Run");
    }
}

public class Runnable_inter {
 
    public static void main(String[] args) {
        
        memo m = new memo();
        Thread t= new Thread(m);

        t.start();
    }

}
