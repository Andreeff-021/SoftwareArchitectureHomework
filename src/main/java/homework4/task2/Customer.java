package homework4.task2;

import java.util.Collection;

public class Customer {

    private static int counter;
    private final int id;

    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

}
