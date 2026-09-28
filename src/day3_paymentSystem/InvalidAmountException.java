package day3_paymentSystem;

public class InvalidAmountException extends RuntimeException{

   //Constructor για μήνυμα σφάλματος
    public InvalidAmountException(String message){
        super(message);
    }

}
