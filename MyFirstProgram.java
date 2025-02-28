import java.util.Random;
import java.util.Scanner;  // Import Random class

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("(Java version : " + System.getProperty("java.version")+")"); //Credits Abel El Zachary 
        String green = "\u001B[32m";
        String[] facts = {
            "Java was originally called 'Oak'.",
            "The mascot of Java is called Duke.",
            "Java is used in space exploration by NASA!",
            "Android apps are primarily built using Java.",
            "Java slogan is 'Write Once, Run Anywhere'."
        };

        Scanner input = new Scanner(System.in);
        Random random = new Random();  // Create Random object
        
        System.out.println(green + "Hi there! Please input your name:");
        String userName = input.nextLine();  // Read user input
        System.out.println("Welcome " + userName + "!");  
        System.out.println("Do you want to hear fact about java? (Please enter a number: 1. Yes / 2. No)");

        int choice;
        do {
            choice = input.nextInt();  

            if ( choice == 1) {
                int randomIndex = random.nextInt(facts.length);  // Pick a random fact from the arra
                System.out.println("Fun Fact: " + facts[randomIndex]);
                System.out.println("Wanna hear another fact? (1. Yes / 2. No)");
            } else if ( choice == 2) {
                System.out.println("Goodbye, " + userName + "!");
                break;  // Exit the loop
            } else {
                System.out.println("Invalid input! enter 1 for Yes or 2 for No");
            }
        } while (choice != 2);

        

        input.close();  // Close the scanner
    }
}