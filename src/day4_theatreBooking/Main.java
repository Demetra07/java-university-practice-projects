package day4_theatreBooking;

public class Main{
        public static void main(String[] args) {
            // Δημιουργία αίθουσας θεάτρου 4 σειρές x 4 στήλες
            TheatreRoom theater = new TheatreRoom(4,4);

            System.out.println("--- Αρχικό Διάγραμμα (Όλες οι θέσεις ελεύθερες O) ---");
            theater.printSeatingChart();

            System.out.println("\n--- Κάνουμε μερικές κρατήσεις ---");
            theater.bookSeat(1, 1);
            theater.bookSeat(2, 2);
            theater.bookSeat(3, 0);

            System.out.println("\n--- Δοκιμή διπλής κράτησης της ίδιας θέσης ---");
            theater.bookSeat(1, 1); // Αυτή η θέση είναι ήδη δεσμευμένη!

            System.out.println("\n--- Τελικό Διάγραμμα Θέσεων (X οι κλεισμένες) ---");
            theater.printSeatingChart();
        }
}

