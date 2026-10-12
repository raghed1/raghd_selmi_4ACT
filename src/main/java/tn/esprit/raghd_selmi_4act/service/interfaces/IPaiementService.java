package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Paiement;

import java.util.List;

public interface IPaiementService {

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long id);

    Paiement addPaiement(Paiement entity);

    Paiement modifyPaiement(Paiement entity);

    void removePaiement(Long id);
}
