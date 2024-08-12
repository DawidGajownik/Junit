package pl.coderslab.tydzien4.z1verify;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor


public class Reservation {
    private Long id;
    private LocalDate reservationDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestName;
    private String roomType;
    private int numberOfGuests;
    private ReservationStatus status;
}
