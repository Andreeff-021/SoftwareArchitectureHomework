package homework8.Presenters;

import homework8.Models.Reservation;
import homework8.Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    Reservation changeReservation(int resevationNo, Date reservationDate, int tableNo, String name);

}
