package com.example.FantasyAnimalSB.Controller;

import com.example.FantasyAnimalSB.Model.ZooKeeper;
import com.example.FantasyAnimalSB.Repository.ZooKeeperRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zki")
public class ZooKeeperController {
    ZooKeeperRepository zookeeperRepo;
    ZooKeeperController(ZooKeeperRepository zookeeperRepository) {
        this.zookeeperRepo = zookeeperRepository;
    }
    @GetMapping()
    List<ZooKeeper> getAllZooKeeper()
    {
        return zookeeperRepo.findAll();
    }

    @GetMapping("/{id}")
    ZooKeeper getZooKeeperbyId(@PathVariable int id){
        return zookeeperRepo.findById(id).get();
    }

    @PostMapping()
    void insertZooKeeper(@RequestBody ZooKeeper zookeeper){
        zookeeperRepo.save(zookeeper);
    }

    @PutMapping()
    void updateZooKeeper(@RequestBody ZooKeeper zookeeper){
        zookeeperRepo.save(zookeeper);
    }

    @DeleteMapping("/{id}")
    void deleteZooKeeper(@PathVariable int id){
        zookeeperRepo.deleteById(id);
    }
}
