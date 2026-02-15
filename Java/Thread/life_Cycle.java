package Java.Thread;

class life extends Thread{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(getName());
        }
    }
}

public class life_Cycle {
    public static void main(String[] args) {
        life l = new life();
        l.start();

        for(int i=0;i<10;i++){
            System.out.println(l.currentThread().getName());
        }

    }
}
