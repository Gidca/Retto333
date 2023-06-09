package com.example.reto341.Controller;

import com.example.reto341.Model.Car;
import com.example.reto341.Model.Score;
import com.example.reto341.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")     // ->>>>> localhost.../api/Score/all
    public List<Score> getAll(){return scoreService.getAll();}

    @GetMapping("/{id}")  // ->>>>>> localhost.../api/Score/12
    public Optional<Score> getScore(int id){return scoreService.getScore(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score Score){return scoreService.save(Score);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Score update(@RequestBody Score score) {return scoreService.update(score);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){return scoreService.delete(id);}


}
