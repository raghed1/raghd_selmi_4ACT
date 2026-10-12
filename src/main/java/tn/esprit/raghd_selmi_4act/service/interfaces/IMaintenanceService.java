package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long id);

    Maintenance addMaintenance(Maintenance entity);

    Maintenance modifyMaintenance(Maintenance entity);

    void removeMaintenance(Long id);
}
