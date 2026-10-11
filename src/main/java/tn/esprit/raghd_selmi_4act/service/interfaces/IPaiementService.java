package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement addPaiement(Paiement entity);

    Paiement updatePaiement(Paiement entity);

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long id);

    void removePaiement(Long id);
}
