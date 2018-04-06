package com.springboot.reactdemo.service.impl;

import com.springboot.reactdemo.model.IwClient;
import com.springboot.reactdemo.repository.MongoDBRepository;
import com.springboot.reactdemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private MongoDBRepository mongoDBRepository;

    @Autowired
    public ClientServiceImpl(MongoDBRepository mongoDBRepository) {
        this.mongoDBRepository = mongoDBRepository;
    }

    @Override
    public List<IwClient> getClients(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<IwClient> iwClients = mongoDBRepository.findAll(pageable);

        return iwClients.getContent();
    }

    @Override
    public IwClient getClient(String clientId) {

        Optional<IwClient> optionalIwClient = mongoDBRepository.findById(clientId);

        return optionalIwClient.get();
    }

    @Override
    public boolean deleteClient(String clientId) {
        mongoDBRepository.deleteById(clientId);
        Optional<IwClient> optionalIwClient = mongoDBRepository.findById(clientId);

        if (optionalIwClient != null && optionalIwClient.get() != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addClient() {
        return false;
    }
}
