package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.dto.ClientDto;

import java.util.List;

public interface ClientService {

    Client enregistrerClient(ClientDto clientDto);
    Client enregistrerClient(Client client);

    List<Client> recupererClients();

    Client recupererClient(Long id);

    Client mettreAJourClient(Client client);

    boolean supprimerClient(Long id);
}
