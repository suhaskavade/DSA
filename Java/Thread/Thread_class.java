package Java.Thread;


class Temo extends Thread{

   public void run(){
        System.out.println("In Run");
        System.out.println(getName());
    }

}
public class Thread_class {
    
    public static void main(String[] args) {
        Temo t = new Temo();
        t.setName("Suhas");
        t.start();
        t.setName("Suhas1");
        // t.start();
    }
    


}
