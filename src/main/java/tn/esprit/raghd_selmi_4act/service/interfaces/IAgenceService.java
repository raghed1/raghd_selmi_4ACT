package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence entity);

    Agence updateAgence(Agence entity);

    List<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long id);

    void removeAgence(Long id);
}
