package com.springboot.reactdemo.service;

import com.springboot.reactdemo.model.IwClient;

import java.util.List;

public interface ClientService {

    List<IwClient> getClients(int page, int size);

    IwClient getClient(String clientId);

    boolean deleteClient(String clientId);

    boolean addClient();
}
