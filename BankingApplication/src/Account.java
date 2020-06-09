public class Account {
    private long accountNumber;
    private String accountHolderName;
    private String getAccountHolderEmailAddress;
    private double accountBalance;
    private PassbookEntry[] passbook = new PassbookEntry[100];
    private int numberOfTransactions;

    public Account() {
        this(0,"John Doe", "johndoe@example.com", 0);
    }

    public Account(long accountNumber, String accountHolderName, String getAccountHolderEmailAddress, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.getAccountHolderEmailAddress = getAccountHolderEmailAddress;
        this.accountBalance = accountBalance;
        this.numberOfTransactions = 0;
    }

    public void getAccountDetails () {
        System.out.println("\n\nAccount Number : " + this.accountNumber +
                "\nAccount Holder Name : " + this.accountHolderName +
                "\nAccount Holder Email Address : " + this.getAccountHolderEmailAddress +
                "\nAccount Balance : " + this.accountBalance + "\n");

    }

    public void depositMoney (double amountToDeposit) {
        this.accountBalance += amountToDeposit;
        System.out.println("Amount of " + amountToDeposit + " deposited successfully in account. \nYour current balance is " + this.accountBalance);

        passbook[numberOfTransactions].newEntry("Deposit", "undefined", "undefined", 900, true);
        numberOfTransactions++;
    }

    public void withdrawMoney(double amountToWithdraw) {
        if (this.accountBalance < 0 || amountToWithdraw >= this.accountBalance) {
            System.out.println("ERROR : Lack of funds. Cannot withdraw from account due to insufficient funds. Please deposit some money and try to withdraw again");
            return;
        }

        this.accountBalance -= amountToWithdraw;
        System.out.println("Amount of " + amountToWithdraw + " withdrawn successfully in account. \nYour current balance is " + this.accountBalance);
    }
}
