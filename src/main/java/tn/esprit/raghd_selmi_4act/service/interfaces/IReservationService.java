package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation entity);

    Reservation updateReservation(Reservation entity);

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long id);

    void removeReservation(Long id);
}
