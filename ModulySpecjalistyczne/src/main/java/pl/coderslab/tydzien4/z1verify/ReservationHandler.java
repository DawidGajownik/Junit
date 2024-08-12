package pl.coderslab.tydzien4.z1verify;

public interface ReservationHandler {
    boolean canHandleReservation(Reservation reservation);
    void prepare(Reservation reservation);
}
