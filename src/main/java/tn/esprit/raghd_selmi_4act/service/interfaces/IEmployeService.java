package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Employe;

import java.util.List;

public interface IEmployeService {

    Employe addEmploye(Employe entity);

    Employe updateEmploye(Employe entity);

    List<Employe> retrieveAllEmployes();

    Employe retrieveEmploye(Long id);

    void removeEmploye(Long id);
}
