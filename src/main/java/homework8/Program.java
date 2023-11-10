package homework8;

import homework8.Models.TableModel;
import homework8.Presenters.BookingPresenter;
import homework8.Presenters.Model;
import homework8.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Станислав");
        view.changeReservationTable(1001, new Date(), 2, "Станислав");
    }

}
