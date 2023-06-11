package com.megharbaestrems.ProjetJee.service.impl;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.dao.ClientDao;
import com.megharbaestrems.ProjetJee.dto.ClientDto;
import com.megharbaestrems.ProjetJee.mapper.ClientMapper;
import com.megharbaestrems.ProjetJee.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;


    @Override
    public Client enregistrerClient(ClientDto clientDto) {
        return clientDao.save(ClientMapper.INSTANCE.toEntity(clientDto));
    }

    @Override
    public Client enregistrerClient(Client client) {
        return clientDao.save(client);
    }

    @Override
    public List<Client> recupererClients() {
        return clientDao.findAll();
    }

    @Override
    public Client recupererClient(Long id) {
        return clientDao.findById(id).orElse(null);
    }

    @Override
    public Client mettreAJourClient(Client client) {
        return null;
    }

    @Override
    public boolean supprimerClient(Long id) {
        Client client = recupererClient(id);
        if (client != null){
            clientDao.delete(client);
            return true;
        }
        return false;
    }
}
