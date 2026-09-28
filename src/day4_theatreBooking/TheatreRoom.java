package day4_theatreBooking;

public class TheatreRoom {
    private boolean[][] seats;

    public void TheatreRoom(int rows, int cols){
        //αρχικοποίηση δισδιάστατου πίνακα
        this.seats = new boolean[rows][cols];// αυτόματη αρχικοποίηση με false αρα όλες τισ θέσεις ελεύθερες
    }

    public void bookSeat(int row, int col){

            if (!seats[row][col]){
                seats[row][col]=true;//η θέση κλείστηκε
                System.out.println("Η θέση (" + row + ", " + col + ") κλείστηκε με επιτυχία!");
            }else{
                System.out.println("Η θέση (" + row + ", " + col + ") είναι ήδη πιασμένη!");
            }
    }

    public void printSeatingChart(){
       System.out.print("\n---Διάγραμμα Θέσεων Θεἀτρου---");

       //πρώτη επανάληψη για τις σειρές
        for(int i=0; i<seats.length; i++){

            //δεύτερη επνάληψη για τισ στήλες
            for(int j=0;j<seats[i].length; j++){
                if (seats[i][j]){
                    System.out.print("[ X ] ");// Χ για κλεισμένη/δεσμευμένη θέση
                } else {
                    System.out.print("[ O ] ");//Ο για κενή θέση
                }
            }

        System.out.println(); //Αλλαγή γραμμής στο τέλος τησ σειράς
        }
    }

}
