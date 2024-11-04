package com.uculabs.demo.flowercontroller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uculabs.demo.flowerstore.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

}