package ua.lviv.iot.Java_Lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.Java_Lab8.models.*;
import ua.lviv.iot.Java_Lab8.repositories.FlaskRepository;
import ua.lviv.iot.Java_Lab8.repositories.PipetteRepository;
import ua.lviv.iot.Java_Lab8.repositories.TripodRepository;

@SpringBootApplication
public class JavaLab8Application {

    public static void main(final String[] args) {
        SpringApplication.run(JavaLab8Application.class, args);
    }

    @Bean
    public CommandLineRunner flaskB(final FlaskRepository repo) {

        return (args) -> {
            repo.save(new Flask("flaskBrand", "flaskModel",
                    2003, TypeOfInstruments.ACIDS,
                    "flaskName", 1, 2));

            repo.findAll().forEach(flask -> System.out.print(flask));
            System.out.print("\n");
        };
    }

    @Bean
    public CommandLineRunner pipetteB(final PipetteRepository repo) {

        return (args) -> {
            repo.save(new Pipette("pipetteBrand",
                    "pipetteModel", 2004,
                    TypeOfInstruments.BASIS, 1,
                    TypeOfPipette.ELECTRICAL));

            repo.findAll().forEach(pipette -> System.out.print(pipette));
            System.out.print("\n");
        };
    }

    @Bean
    public CommandLineRunner tripodB(final TripodRepository repo){

        return (args) -> {
            repo.save(new Tripod("tripodBrand", "tripodModel",
                    2005, TypeOfInstruments.OXIDS, 3,
                    1, 5));

            repo.findAll().forEach(tripod -> System.out.print(tripod));
        };
    }

}
