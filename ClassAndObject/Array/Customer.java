
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer{
    public static void main(){
        List<Customer> customerRoster = new ArrayList<>();
        Scanner input = new Scanner(System.in);
         boolean choice = true;

        while (choice) {

            System.out.println("Enter the name:");
            String name = input.nextLine();

            System.out.println("Enter the contact number :");
            int contactNumber = input.nextInt();

            System.out.println("Enter your Id");
            int Id = input.nextInt();

            input.nextLine(); 

            CustomerRoster.add(new Customer(name,contactNumber,Id));

        System.out.println("Do you want to continue adding? (y/n)");
            char c = input.next().charAt(0);

            input.nextLine(); 

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\nCurrent Roster:");

        for (Customer customer: customerRoster) {
            System.out.println(customer);
        }

        if (!customerRoster.isEmpty()) {

            Customer firstCustomer = customerRoster.get(0);

            System.out.println("\nFirst customer's name: "
                    + firstCustomer.getName());
        }

        input.close();
    }
}



    


