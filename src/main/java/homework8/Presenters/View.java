package homework8.Presenters;

import homework8.Models.Reservation;
import homework8.Models.Table;

import java.util.Collection;

public interface View {

    void registerObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showReservationTableUpdate(Reservation reservation);

}
