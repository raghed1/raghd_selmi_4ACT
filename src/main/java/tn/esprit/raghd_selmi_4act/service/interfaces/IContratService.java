package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addContrat(Contrat entity);

    Contrat updateContrat(Contrat entity);

    List<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long id);

    void removeContrat(Long id);
}
