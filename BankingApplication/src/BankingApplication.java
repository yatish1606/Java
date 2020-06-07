public class BankingApplication {
    public static void main (String[] args) {
        Account newAccount = new Account();
        newAccount.getAccountDetails();
        newAccount.depositMoney(900);
        newAccount.withdrawMoney(201);

        Account rachelsAccount = new Account(123456, "Rachel Green", "rach@friends.com", 9000);
        rachelsAccount.getAccountDetails();
    }
}

