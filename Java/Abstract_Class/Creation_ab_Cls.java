package Java.Abstract_Class;

// 1. Abstract Class Creation

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

class Abstract_class{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.fun();
        ch.run();
    }
}
