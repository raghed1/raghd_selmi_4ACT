package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Agence;

import java.util.List;

public interface IAgenceService {

    List<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long id);

    Agence addAgence(Agence entity);

    Agence modifyAgence(Agence entity);

    void removeAgence(Long id);
}
