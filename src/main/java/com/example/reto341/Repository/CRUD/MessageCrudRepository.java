package com.example.reto341.Repository.CRUD;

import com.example.reto341.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
