package com.megharbaestrems.ProjetJee.controller;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.dto.ClientDto;
import com.megharbaestrems.ProjetJee.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
@Validated
public class ClientRestController {

    private ClientService clientService;

    @GetMapping("clients")
    public List<Client> getClients() {
        return clientService.recupererClients();
    }

    @GetMapping("clients/{id}")
    public Client getClient(Long id) {
        return clientService.recupererClient(id);
    }

    @PostMapping("clients")
    @ResponseStatus(code= HttpStatus.CREATED)
    public Client postClient(@RequestBody Client client) {
        return clientService.enregistrerClient(client);
    }

    @Operation(description = "Met à jour complètement le Client")
    @PutMapping("clients")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<Client> putClient(@Valid @RequestBody ClientDto clientDto, BindingResult result) {
        if (clientDto.getId() != null) {
            if (clientService.recupererClient(clientDto.getId()) != null) {
                Client client = clientService.enregistrerClient(clientDto);
                return ResponseEntity.status(200).body(client);
            } else {
                return ResponseEntity.status(404).body(null);
            }
        } else {
            return ResponseEntity.status(400).body(null);
        }
    }

    @DeleteMapping("clients/{id}")
    public boolean deleteClient(Long id) {
        return clientService.supprimerClient(id);
    }

}
