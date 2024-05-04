package com.example.FantasyAnimalSB.Controller;

import com.example.FantasyAnimalSB.Model.FantasyAnimal;
import com.example.FantasyAnimalSB.Repository.FantasyAnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fai")
public class FantasyAnimalController {


    FantasyAnimalRepository animalrepo;
    FantasyAnimalController(FantasyAnimalRepository fantasyanimalrepository) {
        this.animalrepo = fantasyanimalrepository;
    }
    @GetMapping()
    List<FantasyAnimal> getAllFantasyAnimal()
    {
        return animalrepo.findAll();
    }

    @GetMapping("/{id}")
    FantasyAnimal getFantasyAnimalbyId(@PathVariable int id){
        return animalrepo.findById(id).get();
    }

    @PostMapping()
    void insertFantasyAnimal(@RequestBody FantasyAnimal fantasyAnimal){
        animalrepo.save(fantasyAnimal);
    }

    @PutMapping()
    void updateFantasyAnimal(@RequestBody FantasyAnimal fantasyAnimal){
        animalrepo.save(fantasyAnimal);
    }

    @DeleteMapping("/{id}")
    void deleteFantasyAnimal(@PathVariable int id){
        animalrepo.deleteById(id);
    }
}
