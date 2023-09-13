//import java.util.Arrays;
import java.util.Scanner;

public class Application {
	

    public static void main(String[] args) {
        
    	LinkedQueue<String> queue = new LinkedQueue<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter '1' to enqueue a customer");
            System.out.println("Enter '2' to dequeue a customer");
            System.out.println("Enter '3' to print the queue");
            System.out.println("Enter '0' to exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the customer's name: ");
                    String customerName = scanner.nextLine();
                    queue.enqueue(customerName);
                    System.out.println(customerName + " has arrived.");
                    queue.displayQueue();
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String servedCustomer = queue.dequeue();
                        System.out.println(servedCustomer + " was served!");
                        queue.displayQueue();
                    } else {
                        System.out.println("Queue is empty. No one to serve.");
                    }
                    break;
                case 3:
                    System.out.print("Queue: ");
                    queue.displayQueue();
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    	
    }
}