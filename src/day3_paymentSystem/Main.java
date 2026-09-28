package day3_paymentSystem;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία αντικειμένων πληρωμής
        Payable ccPayment = new CreditCardPayment("1234567890123456", "Maria P.");
        Payable paypalPayment = new PayPalPayment("maria@example.com", "987654321098");

        System.out.println("--- Σενάριο 1: Κανονική Πληρωμή με Κάρτα ---");
        ccPayment.processPayments(150.50);

        System.out.println("\n--- Σενάριο 2: Κανονική Πληρωμή με PayPal ---");
        paypalPayment.processPayments(89.99);

        System.out.println("\n--- Σενάριο 3: Έλεγχος Εξαίρεσης (Try-Catch) με Αρνητικό Ποσό ---");

        // Δοκιμάζουμε να κάνουμε μια πληρωμή με αρνητικό ποσό
        try {
            // Ενεργοποιείται το throw και θα πετάξει την InvalidAmountException
            ccPayment.processPayments(-50.0);
        } catch (InvalidAmountException e) {
            // Εδώ πιάνουμε το σφάλμα με ασφάλεια!
            System.out.println("Πιάστηκε εξαίρεση: " + e.getMessage());
        }

        System.out.println("\nΤο πρόγραμμα συνεχίζει κανονικά χωρίς να κρασάρει!");
    }
}
