import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

          System.out.print("Enter value of N: ");
        int N = input.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of Even Numbers = " + sumEven);
        System.out.println("Sum of Odd Numbers = " + sumOdd);
    }
        
    }
    

