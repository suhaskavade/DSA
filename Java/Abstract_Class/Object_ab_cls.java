package Java.Abstract_Class;


// 2. Object of Abstract Class will not Created 

abstract class Parent {
    void fun(){
        System.out.println("In fun");
    }
    abstract void run();
}

class Child extends Parent{

    void run(){
        System.out.println("In Run");
    }
}

public class Object_ab_cls {
    public static void main(String[] args) {
        // Parent p = new Parent() ;
        // p.fun();
        // p.run();
    }   
}
