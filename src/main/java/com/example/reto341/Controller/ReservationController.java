package com.example.reto341.Controller;

import com.example.reto341.Model.Reservation;
import com.example.reto341.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")     // ->>>>> localhost.../api/Reservation/all
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @GetMapping("/{id}")  // ->>>>>> localhost.../api/Reservation/12
    public Optional<Reservation> getReservation(int id){return reservationService.getReservation(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation Reservation){return reservationService.save(Reservation);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation) {return reservationService.update(reservation);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){return reservationService.delete(id);}


}