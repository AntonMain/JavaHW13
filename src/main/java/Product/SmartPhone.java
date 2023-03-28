package Product;

public class SmartPhone extends Product {
    protected String producer;

    public SmartPhone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }
}