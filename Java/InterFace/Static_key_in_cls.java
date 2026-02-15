package Java.InterFace;

interface Example{
    // 1.Static method override hou shakat nahi
    // 2. Static method he child class la inherite oht nahi  
    // 3. Static method access kaarychi assel tr ti Classname ne Access karta yete 
    static void fun(){
        System.err.println("In Static block in Interface");
    }
    void run(); 
}

class Demo implements Example{

    public void fun(){  
        System.out.println("In fun");
    }
    public void run(){   
        System.out.println("In run");
    }
}

 class Static_key_in_cls {
    public static void main(String[] args) {

        // class name ne Static method Access keli ahe
        Example.fun();

        // Demo Class madheli Fun Method hi independent aher Example interface pasun 
        // fun method hi Swata Demo Class chi ahe 
        // Ya varun Samty ki Static method hy Inherite oht nahit
        Demo d = new Demo();
        d.fun();
    }
}
