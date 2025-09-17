public class Customer {
    public String name;
    public SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }
}