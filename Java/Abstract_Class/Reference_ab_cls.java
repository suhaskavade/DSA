package Java.Abstract_Class;

// Parent ch Object nahi Banat 
// Pn Tycha reference Deu shakto 
 abstract class Parent {

    Parent(){
        System.out.println("In Abstract Parent Class Constructor");
    }

    void fun(){
        System.out.println("In fun");
    }
    abstract void run();
}

class Child extends Parent{
    Child(){
        System.err.println("In Child Constructor");
    }
    void run(){
        System.out.println("In Run");
    }
}

public class Reference_ab_cls {
    public static void main(String[] args) {
        Parent p = new  Child();
    }    
}
