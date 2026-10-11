package tn.esprit.raghd_selmi_4act.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raghd_selmi_4act.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
