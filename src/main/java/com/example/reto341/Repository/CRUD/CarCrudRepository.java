package com.example.reto341.Repository.CRUD;

import com.example.reto341.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarCrudRepository extends CrudRepository<Car, Integer> {
}
