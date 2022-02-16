
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);



        do {
            System.out.println("Enter num1:" );
            int num1=sc.nextInt();
            System.out.println("Enter num2:");
            int num2=sc.nextInt();
            int res=0;
            System.out.println("Do you want continue 2 nums?");
            String answer=sc.next();
            if (answer.equals("y")){
                res=num1+num2;
                System.out.println(res);
            }
            else if(answer.equals("n")){
                break;

            }
            else{
                System.out.println("Мы не нашли такую операцию");
            }





        }while (true);


    }
}
