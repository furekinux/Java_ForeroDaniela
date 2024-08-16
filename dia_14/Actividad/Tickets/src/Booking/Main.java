package Booking;

public class Main {

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);
        
        Thread user1 = new BookingThread(bookingSystem,4);
        Thread user2 = new BookingThread(bookingSystem,4);
        Thread user3 = new BookingThread(bookingSystem,3);

        user1.start();
        user2.start();
        user3.start();

        try{
            user1.join();
            user2.join();
            user3.join();

        }
        catch(InterruptedException e){
            e.getStackTrace();
        }
        
        System.out.println("Quedan "+bookingSystem.getAvailableTickets()+" Tickets Disponibles.");
    }
    
}