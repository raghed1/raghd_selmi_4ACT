package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Contrat;

import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long id);

    Contrat addContrat(Contrat entity);

    Contrat modifyContrat(Contrat entity);

    void removeContrat(Long id);
}
