package homework4.task2;

import homework4.task1.ComponentInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {

    private final Database database;
    private final PaymentProvider paymentProvider;


    public TicketProvider(Database database, PaymentProvider paymentProvider){
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId, Date date) throws RuntimeException{

        // Предусловие
        if (clientId < 0)
        {
            throw new RuntimeException("Некорректный номер пользователя.");
        }

        // Выполнение программы
        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket: database.getTickets()) {
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date))
                tickets.add(ticket);
        }

        //Постусловие
        validateTickets(tickets);

        return tickets;
    }

    public boolean buyTicket(int clientId, String cardNo){

        // Предусловие
        if (clientId < 0)
        {
            throw new RuntimeException("Некорректный номер пользователя.");
        }

        if (cardNo.length() < 16){
            throw new RuntimeException("Некорретный номер карты");
        }



        int orderId = database.createTicketOrder(clientId);
        double amount = database.getTicketAmount();
        return paymentProvider.buyTicket(orderId,  cardNo, amount);

    }

    public boolean checkTicket(String qrcode){
        for (Ticket ticket: database.getTickets()) {
            if (ticket.getQrcode().equals(qrcode)){
                ticket.setEnable(false);
                // Save database ...
                return true;
            }
        }
        return false;
    }

    private void validateTickets(Collection<Ticket> tickets){
        if (tickets == null){
            throw new RuntimeException("Билеты не найдены.");
        }
    }
}
