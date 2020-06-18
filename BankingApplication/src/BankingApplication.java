import java.util.ArrayList;
import java.util.Scanner;

public class BankingApplication {

    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        ArrayList<Account> listOfAccounts = new ArrayList<Account>();

        while(true) {
            System.out.println("\n\n1. Create new Account\n2. Login into existing account\n3. Exit");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Account newAccount = new Account().createNewAccount();
                    listOfAccounts.add(newAccount);
                    break;
                case 2:
                    System.out.println("\nEnter account holder name : ");
                    String name = input.nextLine();
                    Account requiredAccount = null;
                    boolean accountFound = false;

                    for(Account eachAccount : listOfAccounts) {
                        if (eachAccount.getAccount().getName().equals(name)) {
                            requiredAccount = eachAccount;
                            accountFound = true;
                            break;
                        }
                    }

                    if(!accountFound) {
                        System.exit(0);
                    }

                    System.out.println("\nEnter password for " + name + " : ");
                    String password = input.nextLine();

                    if(!requiredAccount.authenticateUser(password)) {
                        System.exit(0);
                    }

                    System.out.println("\nLogged in successfully");

                case 3 : System.exit(0);
                default:
                    System.out.println("\nIncorrect choice!");
                    System.exit(0);
            }
        }

    }

}

