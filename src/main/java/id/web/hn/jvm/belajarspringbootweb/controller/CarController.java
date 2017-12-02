package id.web.hn.jvm.belajarspringbootweb.controller;


import id.web.hn.jvm.belajarspringbootweb.entity.Car;
import id.web.hn.jvm.belajarspringbootweb.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars/")
public class CarController {

    @Autowired
    CarRepo carRepo;

    @GetMapping("")
    public Iterable<Car> getAllCars(){
        return carRepo.findAll();
    }

    @PostMapping("post")
    public Car saveCar(@RequestBody Car car){
        return carRepo.save(car);
    }

    @GetMapping("find")
    public Car findByIdParam(@RequestParam(value = "id") String id){
        return carRepo.findOne(Long.parseLong(id));
    }

    @GetMapping("{id}/findById")
    public Car findById(@PathVariable(value = "id") String id){
        return carRepo.findOne(Long.parseLong(id));
    }

    @DeleteMapping("{id}/delete")
    public void deleteCar(@PathVariable(value = "id") String id){
        carRepo.delete(Long.parseLong(id));
    }

    @GetMapping("/findByBrand")
    public List<Car> findByBrand(@RequestParam(value = "brand") String brand){
        return carRepo.findByBrand(brand);
    }
}
