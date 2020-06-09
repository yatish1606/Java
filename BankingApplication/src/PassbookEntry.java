public class PassbookEntry {
    private int transactionID;
    private String typeOftransaction;
    private String nameOfPayee;
    private String nameOfCredited;
    private double amount;
    private boolean isApproved;

    public PassbookEntry(){
        this(0,"undefined","unknown", "unknown", 0, false);
    }

    public PassbookEntry(int transactionID, String typeOftransaction, String nameOfPayee, String nameOfCredited, double amount, boolean isApproved) {
        this.transactionID = transactionID;
        this.typeOftransaction = typeOftransaction;
        this.nameOfPayee = nameOfPayee;
        this.nameOfCredited = nameOfCredited;
        this.amount = amount;
        this.isApproved = isApproved;
    }

    public void newEntry(String typeOftransaction, String nameOfPayee, String nameOfCredited, double amount, boolean isApproved) {
        //gnerate transactionID
    }
}
