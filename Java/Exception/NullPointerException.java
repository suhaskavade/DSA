package Java.Exception;

class Null{

        void fun(){
                System.out.println("In Fun");
        }
}

class Client{

        public static void main(String[] args){

                Null n = new Null();

                n.fun();
                n = null;
                n.fun();
        }
}