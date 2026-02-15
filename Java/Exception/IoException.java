package Java.Exception;

import java.io.*;

class Demo{

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Name: ");
                String name = br.readLine();
                System.out.println("Name: "+ name);
                System.out.println("Close Connection !!!");

                br.close();

                System.out.println("Enter Number :");
                String no = br.readLine();
                System.out.println("Number : " + no);


        }

}
