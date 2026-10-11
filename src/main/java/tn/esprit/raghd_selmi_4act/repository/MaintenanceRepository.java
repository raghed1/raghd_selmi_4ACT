package tn.esprit.raghd_selmi_4act.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raghd_selmi_4act.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
