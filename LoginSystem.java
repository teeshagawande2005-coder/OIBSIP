import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {

    // HashMap to store username and password
    static HashMap<String, String> usersDB = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Login System ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    System.out.println("Exiting system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        }
    }

    // Register method
    public static void register() {
        System.out.println("\n=== Register ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (usersDB.containsKey(username)) {
            System.out.println("Username already exists! Try a different one.\n");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        usersDB.put(username, password);
        System.out.println("User '" + username + "' registered successfully!\n");
    }

    // Login method
    public static void login() {
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (usersDB.containsKey(username) && usersDB.get(username).equals(password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
            securedPage(username);
        } else {
            System.out.println("Invalid username or password!\n");
        }
    }

    // Secured page method
    public static void securedPage(String username) {
        System.out.println("\n=== Secured Page ===");
        System.out.println("Hello, " + username + "! You have accessed the secured page.\n");
        System.out.println("Press Enter to logout...");
        scanner.nextLine();
        System.out.println("Logged out successfully!\n");
    }
}
