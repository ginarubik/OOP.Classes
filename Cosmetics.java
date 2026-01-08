public class Cosmetics extends Design {
    private String shade;
    private String skinType;

    public Cosmetics(String name, double price, String brand, String shade, String skinType) {
        super(name, price, brand);
        this.shade = shade;
        this.skinType = skinType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shade: " + shade);
        System.out.println("Skin Type: " + skinType);
    }
}
