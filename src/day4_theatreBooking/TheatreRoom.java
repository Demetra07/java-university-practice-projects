package day4_theatreBooking;

public class TheatreRoom {
    private boolean[][] seats;

    // ΕΔΩ ΕΙΝΑΙ ΤΟ ΚΛΕΙΔΙ: Ο Constructor με τις 2 παραμέτρους
    public TheatreRoom(int rows, int cols) {
        this.seats = new boolean[rows][cols];
    }

    public void bookSeat(int row, int col) {
        if (!seats[row][col]) {
            seats[row][col] = true;
            System.out.println("Η θέση (" + row + ", " + col + ") κλείστηκε με επιτυχία!");
        } else {
            System.out.println("Η θέση (" + row + ", " + col + ") είναι ήδη πιασμένη!");
        }
    }

    public void printSeatingChart() {
        System.out.println("\n--- Διάγραμμα Θέσεων Θεάτρου ---");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print("[ X ] ");
                } else {
                    System.out.print("[ O ] ");
                }
            }
            System.out.println();
        }
    }
}