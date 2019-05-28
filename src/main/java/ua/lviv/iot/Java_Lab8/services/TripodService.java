package ua.lviv.iot.Java_Lab8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Java_Lab8.models.Pipette;
import ua.lviv.iot.Java_Lab8.models.Tripod;
import ua.lviv.iot.Java_Lab8.repositories.PipetteRepository;
import ua.lviv.iot.Java_Lab8.repositories.TripodRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class TripodService {

    @Autowired
    private TripodRepository repo;


    @RequestMapping(value = "/tripod/", method = RequestMethod.GET)
    public List<Tripod> getTripod() {

        List<Tripod> tripods = new LinkedList<>();
        repo.findAll().forEach(tripods::add);
        if (tripods.isEmpty()) {
            return null;
        }

        return tripods;
    }

    @RequestMapping(value = "/tripod/{id}", method = RequestMethod.GET)
    public Tripod getTripod(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {
            return repo.findById(id).get();
        }

        return null;
    }

    @RequestMapping(value = "/tripod/", method = RequestMethod.POST)
    public Tripod addTripod(@RequestBody Tripod tripod) {
        return repo.save(tripod);
    }

    @RequestMapping(value = "/tripod/", method = RequestMethod.PUT)
    public Tripod putTripod(@RequestBody Tripod tripod) {
        return repo.save(tripod);
    }


    @RequestMapping(value = "/tripod/{id}", method = RequestMethod.DELETE)
    public void deletePipette(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {

            repo.deleteById(id);
        }

    }
}
