package Java.Abstract_Class;

// Constructor in Abstract class is created for

//  1. Intialize instance variables 
//  2. To maintain Constructor Channing
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

class Constructor_ab_cls {
    public static void main(String[] args) {

        Parent p = new Child();
        p.run();
        Child ch = new Child();
    }

}
