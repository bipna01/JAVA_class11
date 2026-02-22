import java.utill.Scanner;
public class AdvanceNumberGuess {
    

      private int secretNumber;

        public AdvanceNumberGuess(int secretNumber ){
       this.secretNumber = secretNumber;
      }

     void guessNum(){
        
        while(true) {
            
         Scanner input= new Scanner(System.in);
             System.out.println("Enter the number you want to guess");
       int num = input.nextInt();

         if(num<20 && num>1){
            System.out.println("Your number " + num + " is too smaller than my secret number");
            
        }

        
        else if(num<50 && num>30){
            System.out.println("Your number " + num + " is smaller than my number");
            
        }

        
        else if(num<60 && num>50){
            System.out.println("Your number " + num + " is  smaller");
            
        }
        else if(num>100 && num<80){
            System.out.print("your number " + num +"is too greater than my secret number ");
        }
        else if (num>60 && num<80){
            System.out.println("your number" + num + "is greater than my  secret number");
        }
        else if (num>60 && num<70){ 
             System.out.println("your number" + num + "is sightly near to my secret number");

        }
        else if ( num<70 && num>65){
            System.out.println("your number" + num + "is very near to my secret number");
                 
        }
        else if (num == secretNumber){
            System.out.print(("your guess is correct"));
        }
        else {
            System.out.println("your number" + num + "is out of range");
        }


    }
     }
   public static void main(String args[]){
      
      

       AdvanceNumberGuess guess = new AdvanceNumberGuess(67);
       guess.guessNum();
       
       

  }
}
    


    

