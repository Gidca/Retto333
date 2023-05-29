package com.example.reto341.Repository.CRUD;

import com.example.reto341.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}