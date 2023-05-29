package com.example.reto341.Controller;

import com.example.reto341.Model.Message;
import com.example.reto341.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")     // ->>>>> localhost.../api/Message/all
    public List<Message> getAll(){
        return messageService.getAll();
    }

    @GetMapping("/{id}")  // ->>>>>> localhost.../api/Message/12
    public Optional<Message> getMessage(int id){
        return messageService.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message Messages){
        return messageService.save(Messages);
    }

}