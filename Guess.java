
    import java.util.Scanner;
public class Guess{
      private int secretNumber;

        public Guess(int secretNumber ){
       this.secretNumber = secretNumber;
      }

     void guessNum(){
         Scanner input= new Scanner(System.in);
         int count=0;
        while(true) {
             System.out.println("Enter the number you want to guess");
       int num = input.nextInt();

            
        count++;
       if (num > secretNumber) {
    System.out.println("Your number is greater than my secret number");
}
else if (num < secretNumber) {
    System.out.println("Your number is smaller than my secret number");
}
else {
    System.out.println("Your guess is correct");
    System.out.println("You guessed the number in " + count + " guesses.");
                break;   // stop l
}

    }
     }
   public static void main(String args[]){
      
      

       Guess guess = new Guess(67);
       guess.guessNum();
       
       

  }
}
    

