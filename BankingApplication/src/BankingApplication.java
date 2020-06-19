import java.util.ArrayList;
import java.util.Scanner;

public class BankingApplication {
    public static ArrayList<Account> listOfAccounts = new ArrayList<Account>();

    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {



        while(true) {
            System.out.println("\n\n1. Create new Account\n2. Login into existing account\n3. Exit");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Account newAccount = new Account().createNewAccount();
                    listOfAccounts.add(newAccount);
                    bankingOperations(newAccount);
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
                        System.out.println("\nThis account does not exist");
                        System.exit(0);
                    }

                    System.out.println("\nEnter password for " + name + " : ");
                    String password = input.nextLine();

                    if(!requiredAccount.authenticateUser(password)) {
                        System.out.println("\nIncorrect password!");
                        System.exit(0);
                    }

                    System.out.println("\nLogged in successfully");
                    bankingOperations(requiredAccount);
                    break;

                case 3 : System.exit(0);
                default:
                    System.out.println("\nIncorrect choice!");
                    System.exit(0);
            }
        }

    }

    public static void bankingOperations(Account account) {

        while (true) {

            System.out.println("\nWhat would you like to do ? \n\n1. Deposit Money\n2. Withdraw Money\n3. Transfer Money\n4. Close my account\n5. Logout\n\n");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nEnter amount to deposit = ");
                    account.depositMoney(input.nextDouble());
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("\nEnter amount to withdraw = ");
                    account.withdrawMoney(input.nextDouble());
                    input.nextLine();
                    break;
                case 3:
                    System.out.println("\nEnter the name of person whom you want to pay : ");
                    String name = input.nextLine();

                    boolean personExists = false;
                    Account creditedAccount = null;
                    for(Account eachAccount : listOfAccounts ) {
                        if(eachAccount.getAccount().getName().equals(name)) {
                            creditedAccount = eachAccount;
                            personExists = true;
                            break;
                        }
                    }
                    if(!personExists) {
                        System.out.println("\nPerson does not exist");
                        break;
                    }
                    System.out.println("\nEnter the amount = ");
                    account.transferMoney(creditedAccount.getAccount(), creditedAccount , input.nextDouble());
                    break;
                case 4:
                    listOfAccounts.remove(account);
                    System.out.println("\nAccount deleted successfully!");
                    return;
                case 5:
                    System.out.println("Logging out");
                    return;
            }
        }
    }

    public void getAccountList() {
        for(Account eachAccount : listOfAccounts) {
            eachAccount.getAccountDetails();
        }
    }



}

