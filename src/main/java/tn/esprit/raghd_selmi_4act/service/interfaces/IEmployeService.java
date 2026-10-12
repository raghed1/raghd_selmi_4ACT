package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Employe;

import java.util.List;

public interface IEmployeService {

    List<Employe> retrieveAllEmployes();

    Employe retrieveEmploye(Long id);

    Employe addEmploye(Employe entity);

    Employe modifyEmploye(Employe entity);

    void removeEmploye(Long id);
}
