package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance addMaintenance(Maintenance entity);

    Maintenance updateMaintenance(Maintenance entity);

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long id);

    void removeMaintenance(Long id);
}
