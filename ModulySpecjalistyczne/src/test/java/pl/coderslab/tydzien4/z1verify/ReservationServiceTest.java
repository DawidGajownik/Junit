package pl.coderslab.tydzien4.z1verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReservationServiceTest {

    @Mock
    ReservationHandler reservationHandler;
    @Test
    void processReservation() {

        Reservation reservation = new Reservation(1L, LocalDate.now(), LocalDate.MIN, LocalDate.MAX, "Dawid", "kuchnia", 3, ReservationStatus.PENDING);
        ReservationService reservationService = new ReservationService(reservationHandler);
        when(reservationHandler.canHandleReservation(reservation)).thenReturn(true);
        reservationService.processReservation(reservation);
        verify(reservationHandler).canHandleReservation(reservation);
        assertEquals(ReservationStatus.CONFIRMED, reservation.getStatus());
        InOrder inOrder = Mockito.inOrder((reservationHandler));
        inOrder.verify(reservationHandler).canHandleReservation(reservation);
        inOrder.verify(reservationHandler).prepare(reservation);
    }
}