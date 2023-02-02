package example;


import java.util.Scanner;

class  Movieticket {
    static class MovieTicket {
        private int movieId;
        private int noOfSeats;
        private double costPerTicket;

        public MovieTicket() {
        }
        public double calculateTotalAmount() {
            double totalAmount = this.getNoOfSeats() * this.getCostPerTicket();
            totalAmount += totalAmount * 0.02;
            return Math.round(totalAmount);
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
            switch (movieId) {
                case 111:
                    this.setCostPerTicket(7);
                    break;
                case 112:
                    this.setCostPerTicket(8);
                    break;
                case 113:
                    this.setCostPerTicket(8.5);
                    break;
                default:
                   this.setCostPerTicket(0);
            }
        }

        public int getNoOfSeats() {
            return noOfSeats;
        }

        public void setNoOfSeats(int noOfSeats) {
            this.noOfSeats = noOfSeats;
        }

        public double getCostPerTicket() {
            return costPerTicket;
        }

        public void setCostPerTicket(double costPerTicket) {
            this.costPerTicket = costPerTicket;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the movieId: ");
        int movieId = input.nextInt();
        System.out.print("Enter the number of seats: ");
        int noOfSeats = input.nextInt();
        MovieTicket ticket = new MovieTicket();
        ticket.setMovieId(movieId);
        ticket.setNoOfSeats(noOfSeats);
        double data=ticket.calculateTotalAmount();
        if(data==0){
             System.out.println("Sorry! Please enter valid movie Id and number of seats. ");
        }
        else{
        System.out.println("Total amount for booking : $" + ticket.calculateTotalAmount());
        }
    }
}
