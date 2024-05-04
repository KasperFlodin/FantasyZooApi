package com.example.FantasyAnimalSB.Repository;

import com.example.FantasyAnimalSB.Model.FantasyAnimal;
import com.example.FantasyAnimalSB.Model.ZooKeeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooKeeperRepository extends JpaRepository<ZooKeeper, Integer> {
}
