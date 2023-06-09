package com.example.reto341.Controller;

import com.example.reto341.Model.Client;
import com.example.reto341.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")     // ->>>>> localhost.../api/Client/all
    public List<Client> getAll(){return clientService.getAll();}

    @GetMapping("/{id}")  // ->>>>>> localhost.../api/Client/12
    public Optional<Client> getClient(int id){return clientService.getClient(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client Client){return clientService.save(Client);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client client) {return clientService.update(client);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){return clientService.delete(id);}


}
