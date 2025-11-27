import java.util.Scanner;

public class VowelOrConsonant{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter");
        char letter =input.next().charAt(0);

        if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The letter is vowel");
        }else{
            System.out.println("The letter is consonant");
        }
    }
}