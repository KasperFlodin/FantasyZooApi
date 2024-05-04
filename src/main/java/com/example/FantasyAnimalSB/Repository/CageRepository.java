package com.example.FantasyAnimalSB.Repository;

import com.example.FantasyAnimalSB.Model.Cage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageRepository extends JpaRepository<Cage, Integer> {
}
