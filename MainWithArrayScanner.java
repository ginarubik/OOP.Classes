import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of designs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Design[] designs = new Design[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSelect category:");
            System.out.println("1. Clothes");
            System.out.println("2. Jewellery");
            System.out.println("3. Accessories");
            System.out.println("4. Cosmetics");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter size: ");
                    String size = sc.nextLine();
                    System.out.print("Enter material: ");
                    String material = sc.nextLine();
                    designs[i] = new Clothes(name, price, brand, size, material);
                    break;

                case 2:
                    System.out.print("Enter type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter metal: ");
                    String metal = sc.nextLine();
                    designs[i] = new Jewellery(name, price, brand, type, metal);
                    break;

                case 3:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    designs[i] = new Accessories(name, price, brand, category);
                    break;

                case 4:
                    System.out.print("Enter shade: ");
                    String shade = sc.nextLine();
                    System.out.print("Enter skin type: ");
                    String skinType = sc.nextLine();
                    designs[i] = new Cosmetics(name, price, brand, shade, skinType);
                    break;

                default:
                    System.out.println("Invalid choice");
                    i--; // repeat this iteration
            }
        }

        System.out.println("\n===== DESIGN DETAILS =====");
        for (Design d : designs) {
            System.out.println("\n--------------------------");
            d.displayDetails();
        }

        sc.close();
    }
}
