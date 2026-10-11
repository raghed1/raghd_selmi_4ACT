package tn.esprit.raghd_selmi_4act.service.interfaces;

import tn.esprit.raghd_selmi_4act.entities.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client entity);

    Client updateClient(Client entity);

    List<Client> retrieveAllClients();

    Client retrieveClient(Long id);

    void removeClient(Long id);
}
