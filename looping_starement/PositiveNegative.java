 import java.util.Scanner;
  
  public class PositiveNegative{

    public static void main( String args[]){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number");
         int number = input.nextInt();
         if(number>0){
          System.out.println(" the number is positive");

         }
         else if(number<0){
          System.out.println(" the number is zero");
         }
         else{
          System.out.println(" the number is negative");
         }
         
         
         
    }
   }
 
