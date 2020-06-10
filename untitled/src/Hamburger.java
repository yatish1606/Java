public class Hamburger {
    private String nameOfBurger;
    private String typeOfBread;
    private String meat;
    private int AddON1;
    private int AddON2;
    private int AddON3;
    private int AddON4;
    private double price;

    public Hamburger(String nameOfBurger, String typeOfBread, String meat, int addON1, int addON2, int addON3, int addON4) {
        this.nameOfBurger = nameOfBurger;
        this.typeOfBread = typeOfBread;
        this.meat = meat;
        AddON1 = addON1;
        AddON2 = addON2;
        AddON3 = addON3;
        AddON4 = addON4;
    }

    public double getPrice() {
        double basePrice = 10 + 30 ;

        if(AddON1 != 0) {

        }
    }
}