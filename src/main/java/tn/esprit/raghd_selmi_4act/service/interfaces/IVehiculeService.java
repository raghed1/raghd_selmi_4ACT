package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long id);

    Vehicule addVehicule(Vehicule entity);

    Vehicule modifyVehicule(Vehicule entity);

    void removeVehicule(Long id);
}
