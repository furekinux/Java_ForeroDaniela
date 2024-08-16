package Ejemplo_Implementacion.EJ1.Fallo;

public class TicketBookingSystem {
    private int availableTickets;
    
    public TicketBookingSystem(int availableTickets){
        this.availableTickets = availableTickets;
    }
    
    public boolean bookTickets(int quantity){
        if (availableTickets >= quantity){
            System.out.println("El client "+Thread.currentThread().getName()+" reservó "+quantity);
            availableTickets-=quantity;
            return true;
        }
        else{
            System.out.println("El cliente "+Thread.currentThread().getName()+" no pudo reservar "+quantity);
            return false;
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

}
