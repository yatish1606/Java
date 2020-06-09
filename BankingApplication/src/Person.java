public class Person {
    private String name;
    private long customerID;
    private String emailAddress;

    public Person(){
        this("John Doe", 0 , "johndoe@example.com");
    }

    public Person(String name, long customerID, String emailAddress) {
        this.name = name;
        this.customerID = customerID;
        this.emailAddress = emailAddress;
    }

    public void getDetails() {
        System.out.println("Name : " + name + "\nCustomer ID : " + customerID + "\nEmail : " + emailAddress);
    }

    public String getName() {
        return name;
    }
}
