package shop_day2;
import java.util.ArrayList;

public class Main {
     static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>(); // λίστα για γενικά προϊόντα ΠΟΛΥΜΟΡΦΙΣΜΌΣ

        Electronics laptop = new Electronics("E001", 1000.0, 5, 24);
        Clothing tShirt = new Clothing("C001", 50.0, 20, "M", "Cotton");
        Electronics phone = new Electronics("E002", 800.0, 10, 12);

        inventory.add(laptop);
        inventory.add(tShirt);
        inventory.add(phone);

        //Βασική έκπτωση 20%
        double baseDiscount = 20.0;

        System.out.println("--- Τελικές Τιμές Εκπτώσεων ---");

        for (Product item: inventory) {
            double finalPrice= item.calculateDiscountPrice(baseDiscount);

            System.out.println("Κωδικός: " + item.getCode() + " | Αρχική Τιμή: " + item.getPrice() + "€ | Τελική Τιμή: " + finalPrice + "€");
        }
    }

}
