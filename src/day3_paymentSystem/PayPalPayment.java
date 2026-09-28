package day3_paymentSystem;

public class PayPalPayment implements Payable {
   private String email;
   private String payPalNumber;
   public PayPalPayment(String email, String payPalNumber) {
       this.email = email;
       this.payPalNumber = payPalNumber;
   }

    @Override
    public void processPayments(double amount) {

        // Έλεγχος εξαίρεσης
        if (amount <= 0) {
            //δημιουργία αντικειμένου σφάλματος
            throw new InvalidAmountException("Σφάλμα: Το ποσό πληρωμής πρέπει να είναι μεγαλύτερο του μηδενός!");
        }

        System.out.println("Επεξεργασία Πληρωμής" + amount+ "$"+ "με paypal account.");
        System.out.println("Email καταναλωτή: " + email +" | Αριθμός Λογαριασμού: ****" + payPalNumber.substring(payPalNumber.length() - 4) );
    }
}
