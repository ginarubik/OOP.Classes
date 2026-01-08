public class Jewellery extends Design {
    private String type;
    private String metal;

    public Jewellery(String name, double price, String brand, String type, String metal) {
        super(name, price, brand);
        this.type = type;
        this.metal = metal;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
        System.out.println("Metal: " + metal);
    }
}
