public class PassbookEntry {

    private String typeOftransaction;
    private Person nameOfPayee;
    private Person nameOfCredited;
    private double amount;
    private boolean isApproved;

    public PassbookEntry(){
        this("undefined",new Person(), new Person(), 0, false);
    }

    public PassbookEntry(String typeOftransaction, Person nameOfPayee, Person nameOfCredited, double amount, boolean isApproved) {
        this.typeOftransaction = typeOftransaction;
        this.nameOfPayee = nameOfPayee;
        this.nameOfCredited = nameOfCredited;
        this.amount = amount;
        this.isApproved = isApproved;
    }

    public PassbookEntry(String typeOftransaction, Person nameOfPayee, double amount, boolean isApproved) {
        this.typeOftransaction = typeOftransaction;
        this.nameOfPayee = nameOfPayee;
        this.nameOfCredited = new Person();
        this.amount = amount;
        this.isApproved = isApproved;
    }



    public void printEntry() {
        System.out.println("\n" + typeOftransaction + "\t" + nameOfPayee.getName() + "\t" + nameOfCredited.getName() + "\t" + amount + "\t" + isApproved);
    }
}
