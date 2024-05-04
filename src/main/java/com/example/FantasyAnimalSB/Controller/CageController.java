package com.example.FantasyAnimalSB.Controller;

import com.example.FantasyAnimalSB.Model.Cage;
import com.example.FantasyAnimalSB.Repository.CageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ci")
public class CageController {

    CageRepository cagerepo;
    CageController(CageRepository cagerepository) {
        this.cagerepo = cagerepository;
    }
    @GetMapping()
    List<Cage> getAllCage()
    {
        return cagerepo.findAll();
    }

    @GetMapping("/{id}")
    Cage getCagebyId(@PathVariable int id){
        return cagerepo.findById(id).get();
    }

    @PostMapping()
    void insertCage(@RequestBody Cage cage){
        cagerepo.save(cage);
    }

    @PutMapping()
    void updateCage(@RequestBody Cage cage){
        cagerepo.save(cage);
    }

    @DeleteMapping("/{id}")
    void deleteCage(@PathVariable int id){
        cagerepo.deleteById(id);
    }

}
