package com.example.FantasyAnimalSB.Repository;

import com.example.FantasyAnimalSB.Model.FantasyAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FantasyAnimalRepository extends JpaRepository<FantasyAnimal, Integer> {
}
