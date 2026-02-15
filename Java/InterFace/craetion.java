package Java.InterFace;


interface Example{
    void fun(); // public abstract void fun() 
    void run(); // public abstract void run()
    // internally Both Are 
    
}

class Demo implements Example{

    public void fun(){    // Scope Same Thevava lagto Manje inaterface madhe method he Public ahe manun Eitha pn Public Thevaychi
        System.out.println("In fun");
    }
    public void run(){    // Scope Same Thevava lagto Manje inaterface madhe method he Public ahe manun Eitha pn Public Thevaychi
        System.out.println("In run");
    }
}

public class craetion {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.fun();
        d.run();
    }
}
