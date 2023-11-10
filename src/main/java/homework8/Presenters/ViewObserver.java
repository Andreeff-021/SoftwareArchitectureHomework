package homework8.Presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservtionDate, int tableNo, String name);
    void onChangeReservationTable(int reservationNo, Date date, int tableNo, String name);
}
