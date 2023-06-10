package com.example.reto341.Repository.CRUD;

import com.example.reto341.Model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    //Reporte 1
    // SELECT * FROM Reservation WHERE starDate AFTER fechaA AND devolutionDate BEFORE fechaB

    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date fechaA, Date fechaB);

    //Reporte 2
    // SELECT * FROM Reservation WHERE status = "valorNecesite";

    public List<Reservation> findAllByStatus(String status);

    //Reporte 3
    // SELECT client, COUNT(client) FROM Reservation GROUP BY client ORDER BY COUNT (client) DESC;
    // Lista de parejas de 2 valores!!!
    // [ client1 , totalcliente1]
    /*
       [client2, totalCliente2]
       [client3, totalCliente3]
       [client4, totalCliente4]
       .....
     */

    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client) DESC")
    public List<Object[]> getTotalReservationsByClient();
}