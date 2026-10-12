package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Client;

import java.util.List;

public interface IClientService {

    List<Client> retrieveAllClients();

    Client retrieveClient(Long id);

    Client addClient(Client entity);

    Client modifyClient(Client entity);

    void removeClient(Long id);
}
