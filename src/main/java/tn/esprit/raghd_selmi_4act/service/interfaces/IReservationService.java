package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long id);

    Reservation addReservation(Reservation entity);

    Reservation modifyReservation(Reservation entity);

    void removeReservation(Long id);
}
