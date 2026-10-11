package tn.esprit.raghd_selmi_4act.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raghd_selmi_4act.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
