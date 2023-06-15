import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
   while (true){
       System.out.println("entrance");
       System.out.println("1+");
       System.out.println("2-");
       System.out.println("3*");
       System.out.println("4/");
       System.out.println("5exit");
       int user = scanner.nextInt();
       int result;
       if( user == 5 ){
           break;
       } else if (user == 1) {
           System.out.println("enter the number first :");
           int a = scanner.nextInt();
           System.out.println("enter the number second :");
           int b = scanner.nextInt();
           System.out.println(" a: + a ");
           System.out.println(" b: + b ");
           result = a + b;
           System.out.println ("answer+ result");


       }
       else if (user == 2) {
           System.out.println("enter the number first :");
           int a = scanner.nextInt();
           System.out.println("enter the number second :");
           int b = scanner.nextInt();
           System.out.println(" a: + a ");
           System.out.println(" b: + b ");
           result = a - b;
           System.out.println ("answer+ result");


       }
       else if (user == 2) {
           System.out.println("enter the number first :");
           int a = scanner.nextInt();
           System.out.println("enter the number second :");
           int b = scanner.nextInt();
           System.out.println(" a: + a ");
           System.out.println(" b: + b ");
           result = a - b;
           System.out.println ("answer+ result");


       }
       else if (user == 3) {
           System.out.println("enter the number first :");
           int a = scanner.nextInt();
           System.out.println("enter the number second :");
           int b = scanner.nextInt();
           System.out.println(" a: + a ");
           System.out.println(" b: + b ");
           result = a * b;
           System.out.println ("answer+ result");


       }
       else if (user == 4) {
           System.out.println("enter the number first :");
           int a = scanner.nextInt();
           System.out.println("enter the number second :");
           int b = scanner.nextInt();
           if ( b = 0 ) {
               System.out.println("cannot be divided by 0");
           }
           System.out.println(" a: + a ");
           System.out.println(" b: + b ");
           result = a / b;
           System.out.println ("answer+ result");
           else {
               System.out.println("error");
           }
           System.out.println("program completed");


       }
   }
    }
}