package id.web.hn.jvm.belajarspringbootweb;

import id.web.hn.jvm.belajarspringbootweb.entity.Car;
import id.web.hn.jvm.belajarspringbootweb.repository.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarSpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringBootWebApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepo repo){
		return strings -> {
			repo.save(new Car("Ford", "Modelnya", "red", "bensin", 1999));
			repo.save(new Car("Ford", "Modelnya", "blue", "bensin", 2017));
			repo.save(new Car("Ford", "Modelnya", "black", "bensin", 2011));
			repo.save(new Car("Merek lagi", "Modelnya", "warnanya", "bensin", 1999));
			repo.save(new Car("Beda lagi", "Modelnya", "warnanya", "bensin", 2000));
		};
	}
}
