package homework8.Views;

import homework8.Models.Reservation;
import homework8.Models.Table;
import homework8.Presenters.View;
import homework8.Presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер резерва #%d\n", reservationNo);
        else
            System.out.println("Невозможно забронировать столик.\nПовторите попытку позже.");
    }

    @Override
    public void showReservationTableUpdate(Reservation reservation) {
        System.out.printf("Бронь номер #d обновлена", reservation.getId());
    }

    public void reservationTable(Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onReservationTable(reservtionDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers){
            observer.onChangeReservationTable(oldReservation, reservtionDate, tableNo, name);
        }
    }

}
