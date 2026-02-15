package Java;
 class Parent {
    
    static void suhas(){
        System.out.println("In parent method");
    }
    
}

class child extends Parent{
    static void suhas(){
        System.out.println("In Child method");
    }
}

public class method_hiding{

    public static void main(String [] args){
        Parent p = new Parent();
        p.suhas();

        child c = new child();
        c.suhas();

        Parent pc = new child();
        pc.suhas();

    }

}