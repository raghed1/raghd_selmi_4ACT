package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement addEquipement(Equipement entity);

    Equipement updateEquipement(Equipement entity);

    List<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipement(Long id);

    void removeEquipement(Long id);
}
