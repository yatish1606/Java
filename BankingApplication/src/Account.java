import java.util.Random;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private Person accountHolder;
    private double accountBalance;
    private PassbookEntry[] passbook = new PassbookEntry[100];
    private int numberOfTransactions;
    private String password;

    public Account() {
        this(0,new Person(), 0, "");
    }

    public Account(long accountNumber, Person accountHolder, double accountBalance, String accountPassword) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.numberOfTransactions = 0;
        this.passbook = new PassbookEntry[100];
        this.password = accountPassword;
    }

    public boolean authenticateUser(String accountPassword) {
        return accountPassword.equals(this.password);
    }


    public Account createNewAccount() {

        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        long accountNumber = generator.nextInt(900000) + 100000;
        long customerID = generator.nextInt(900000) + 100000;

        System.out.println("Enter account holder name : ");
        String accountHolderName = new Scanner(System.in).nextLine();

        System.out.println("Enter account holder email address : ");
        String accountHolderEmailAddress = new Scanner(System.in).nextLine();

        System.out.println("Enter account password : ");
        String accountPassword = new Scanner(System.in).nextLine();

        return new Account(accountNumber, new Person(accountHolderName,customerID,accountHolderEmailAddress), 0.0, accountPassword);

    }

    public void getAccountDetails () {
        System.out.println("\n\nAccount Number : " + this.accountNumber +
                "\nAccount Balance : " + this.accountBalance + "\n");

        this.accountHolder.getDetails();

    }

    public Person getAccount() {
        return this.accountHolder;
    }

    public void getMoney(double amount) {
        this.accountBalance += amount;
        PassbookEntry newEntry = new PassbookEntry("Received", this.accountHolder, amount, true);
        this.passbook[numberOfTransactions] = newEntry;
        numberOfTransactions++;
    }

    public void depositMoney (double amountToDeposit) {
        this.accountBalance += amountToDeposit;
        System.out.println("Amount of " + amountToDeposit + " deposited successfully in account. \nYour current balance is " + this.accountBalance);

        PassbookEntry newEntry = new PassbookEntry("Deposit", this.accountHolder, new Person(), amountToDeposit, true);
        this.passbook[numberOfTransactions] = newEntry;
        numberOfTransactions++;
    }

    public void withdrawMoney(double amountToWithdraw) {
        boolean wasOK = true;

        if (this.accountBalance < 0 || amountToWithdraw > this.accountBalance) {
            System.out.println("ERROR : Lack of funds. Cannot withdraw from account due to insufficient funds. Please deposit some money and try to withdraw again");
            wasOK = false;
        } else {
            this.accountBalance -= amountToWithdraw;
            System.out.println("Amount of " + amountToWithdraw + " withdrawn successfully in account. \nYour current balance is " + this.accountBalance);
        }

        PassbookEntry newEntry = new PassbookEntry("Withdrawal", this.accountHolder, amountToWithdraw, wasOK);
        this.passbook[numberOfTransactions] = newEntry;
        numberOfTransactions++;
    }

    public void transferMoney(Person payee, Account credited, double amount) {
        boolean wasOK = true;
        if(this.accountBalance < amount) {
            System.out.println("ERROR : Lack of funds. Cannot transfer from account due to insufficient funds. Please deposit some money and try to withdraw again");
            wasOK = false;
        } else {
            this.accountBalance -= amount;
            credited.getMoney(amount);
        }

        PassbookEntry newEntry = new PassbookEntry("Sent", this.accountHolder, amount, wasOK);
        this.passbook[numberOfTransactions] = newEntry;
        numberOfTransactions++;
    }

    public void printPassbook() {
        if(this.numberOfTransactions == 0) {
            System.out.println("Passbook is empty. You have not performed any transactions!");
            return;
        }

        System.out.println("\nType\tPayee\tCredited\tAmount\tStatus");

        for (PassbookEntry eachEntry : this.passbook) {
            if(eachEntry != null) {
                eachEntry.printEntry();
            }
        }
    }
}
