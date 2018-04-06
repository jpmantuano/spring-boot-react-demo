package com.springboot.reactdemo.controller;

import com.springboot.reactdemo.model.IwClient;
import com.springboot.reactdemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<IwClient> getClients(@RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                     @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        return clientService.getClients(page, size);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public IwClient getClient(@PathVariable(value = "id") String clientId) {
        return clientService.getClient(clientId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addClient(){

        return false;
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public boolean deleteClient(@PathVariable(value = "id") String clientId){
        return clientService.deleteClient(clientId);
    }
}
