package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addVehicule(Vehicule entity);

    Vehicule updateVehicule(Vehicule entity);

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long id);

    void removeVehicule(Long id);
}
