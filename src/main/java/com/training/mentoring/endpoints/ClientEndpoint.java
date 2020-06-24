package com.training.mentoring.endpoints;

import com.training.mentoring.domain.Client;
import com.training.mentoring.repository.ClientRepository;
import com.training.mentoring.resources.ClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class ClientEndpoint {

    public static final String CLIENT_RESOURCE_PATH = "/rs/clients";

    @Autowired
    ClientRepository clientRepository;

    @PostMapping(value = CLIENT_RESOURCE_PATH)
    public ResponseEntity<Client> createClient(@RequestBody ClientRequest clientRequest){
        Client clientCreated = clientRepository.save(new Client(clientRequest));
        return ResponseEntity.ok(clientCreated);
    }



}
