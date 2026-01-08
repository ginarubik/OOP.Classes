public class Clothes extends Design {
    private String size;
    private String material;

    public Clothes(String name, double price, String brand, String size, String material) {
        super(name, price, brand);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}
