package id.web.hn.jvm.belajarspringbootweb.repository;

import id.web.hn.jvm.belajarspringbootweb.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    Car save(Car car);
}
