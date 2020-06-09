public class BankingApplication {
    public static void main (String[] args) {



        Account account = new Account().createNewAccount();
        account.getAccountDetails();
        account.depositMoney(1000);
        account.withdrawMoney(5000);
        account.printPassbook();
    }


}

