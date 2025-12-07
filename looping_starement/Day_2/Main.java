import java.util.Scanner;
public class Main{
    public static void main (String args[]){
          Scanner input = new Scanner(System.in);
        System.out.println("Welcome to class 11");
        System.out.println("Enter the service you want");
        System.out.println("Service we provides");
        System.out.println("1.Software development");
        System.out.println("2.Automation");
        System.out.println("3.Web Development");
        System.out.println("0.Exit");

          int choice = input.nextInt();

          switch(choice){
            case 1: 
            System.out.println(" you have enter software development");
            break;

            case 2:
            System.out.println(" you have enter Automation");
            break;

            case 3:
                System.out.println(" you have enter Web development");
                break;

            case 0 :
                System.out.println("exit") ;  
                break;
            default:
              System.out.println("invalid input");

          }
          input.close();
    }
}