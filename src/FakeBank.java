import java.util.Scanner;

public class FakeBank {
    private static String userName;
    private  static String password;
    private static int checkingAccountValue;
    private static int savingsAccountValue;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_FUNDS = 999999;

    private static int displayInitialMenu() {
        int userSelection;
        System.out.println("Please select an option:");
        System.out.println("0. Create an account");
        System.out.println("1. Log in");
        userSelection = SCANNER.nextInt();
        while(userSelection < 0 || userSelection > 1) {
            System.out.println("ERROR! Please enter either 0 or 1.");
            userSelection = SCANNER.nextInt();
        }
        return userSelection;
    }

    private static void createUserAccount() {
        System.out.println("Please create your username (no spaces):");
        userName = SCANNER.next();
        System.out.println("Please create a password (no spaces):");
        password = SCANNER.next();
        System.out.println("Account successfully created! Please log in.");
    }

    private static void logInChallenge() {
        String logInUsername;
        String logInPassword;
        System.out.println("Please enter your username:");
        logInUsername = SCANNER.next();
        System.out.println("Please enter your password:");
        logInPassword = SCANNER.next();
        while(!logInUsername.equals(userName) || !logInPassword.equals(password)) {
            System.out.println("ERROR! Invalid username and/or password.");
            System.out.println("Please enter your username:");
            logInUsername = SCANNER.next();
            System.out.println("Please enter your password:");
            logInPassword = SCANNER.next();
        }
        System.out.println("Welcome, " + userName + "!");
    }

    public static void main(String[] args) {
        int initialChoice;
        System.out.println("Welcome to the FakeBank App!");
        initialChoice = displayInitialMenu();
        if(initialChoice == 0) {
            createUserAccount();
        }
        logInChallenge();
        System.out.println("Program terminated. Goodbye!");
    }
}
