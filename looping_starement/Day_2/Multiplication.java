import java.util.Scanner;
public class Multiplication{
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number you want multiplication");
        int n = input.nextInt();
        System.out.println("Enter a number upto you want your multiplication");
        int m = input.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                System.out.println(i*j);
            }
            
        }

    }
}