import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("enter b");
        Scanner sr =  new Scanner(System.in);
        int b = sr.nextInt();
        System.out.println("enter a");
        int a = sr.nextInt();

        sr.nextLine();//this line is used for consuming of new line


        System.out.println("enter the symbol");
        String cha = sr.nextLine();
         int result=0;
         switch(cha)
         {
             case "+":
                 result = a+b;
                 System.out.println(result);
                 break;

             case "-":
                 result = a-b;
                 System.out.println(result);
                 break;

             case "/":
                 result = a/b;
                 System.out.println(result);
                 break;


             case "*":
                 result = a*b;
                 System.out.println(result);
                 break;

             default:
                 result=0000012;
                 System.out.println(result);
                 break;
         }

        }
    }
