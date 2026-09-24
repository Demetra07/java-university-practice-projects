package day3_paymentSystem;

public class CreditCardPayment implements Payable{
   private String cardNumber;
   private String cardHolder;

   public CreditCardPayment(String cardNumber, String cardHolder) {
       this.cardNumber = cardNumber;
       this.cardHolder = cardHolder;
   }

    @Override
    public void processPayments(double amount) {
        System.out.println("Επεξεργασία πληρωμής " + amount + "€ με Πιστωτική Kάρτα.");
        System.out.println("Κάτοχος: " + cardHolder + " | Αριθμός Κάρτας: ****" + cardNumber.substring(cardNumber.length() - 4));  //substring για εμφάνιση μόνο 4 τελευταίων στοιχείων του αριθμού κάρτας
    }

}
