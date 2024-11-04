package com.uculabs.demo.flowercontroller;

import com.uculabs.demo.flowerstore.Flower;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private FlowerRepository fr;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.fr = flowerRepository;
    }

    public List<Flower> getFlowers(){
        return fr.findAll();
    }

    public void addFlower(Flower flower){
        fr.save(flower);
    }
}