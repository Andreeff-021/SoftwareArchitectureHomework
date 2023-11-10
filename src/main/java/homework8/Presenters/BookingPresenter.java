package homework8.Presenters;

import homework8.Models.Reservation;
import homework8.Models.TableModel;
import homework8.Views.BookingView;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }
    public void updateTables(){
        view.showTables(model.loadTables());
    }

    private void showReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    private void showReservationTableUpdate(Reservation reservation){
        view.showReservationTableUpdate(reservation);
    }

    @Override
    public void onReservationTable(Date reservtionDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(reservtionDate, tableNo, name);
            showReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            showReservationTableResult(-1);
        }
    }

    @Override
    public void onChangeReservationTable(int reservationNo, Date date, int tableNo, String name) {
            Reservation reservation = model.changeReservation(reservationNo, date, tableNo, name);
            showReservationTableUpdate(reservation);
    }
}
