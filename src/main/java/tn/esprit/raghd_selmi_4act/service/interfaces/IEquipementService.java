package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Equipement;

import java.util.List;

public interface IEquipementService {

    List<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipement(Long id);

    Equipement addEquipement(Equipement entity);

    Equipement modifyEquipement(Equipement entity);

    void removeEquipement(Long id);
}
