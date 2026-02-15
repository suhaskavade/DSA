package Java.InterFace;

interface Example{

    //  default keyword use karun interFace Madhe method la body deli jathe
   default void fun(){
    System.out.println("In default Block in Interface");
   } 
    void run(); 
}

class Inter implements Example{

    public void run(){   
        System.out.println("In Demo run");
    }
}

class Demo1 implements Example{

    // Default kelely Method hy Override kely Jau Shaktat 
   public void fun(){
        System.err.println("In Demo1 Fun");
    }

    public void run(){
        System.err.println("In Demo1 Run");
    }
}

public class default_key_in {
    public static void main(String[] args) {

        //  InterFace cha reference Deu Shakto
        Example d = new Inter();
        d.fun();

        Demo1 d1 = new Demo1();
        d1.fun();
    }
}
