package ua.lviv.iot.Java_Lab8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Java_Lab8.models.Flask;
import ua.lviv.iot.Java_Lab8.models.Pipette;
import ua.lviv.iot.Java_Lab8.repositories.PipetteRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class PipetteService {

    @Autowired
    private PipetteRepository repo;


    @RequestMapping(value = "/pipette/", method = RequestMethod.GET)
    public List<Pipette> getPipette() {

        List<Pipette> pipettes = new LinkedList<>();
        repo.findAll().forEach(pipettes::add);
        if (pipettes.isEmpty()) {
            return null;
        }

        return pipettes;
    }

    @RequestMapping(value = "/pipette/{id}", method = RequestMethod.GET)
    public Pipette getPipette(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {
            return repo.findById(id).get();
        }

        return null;
    }

    @RequestMapping(value = "/pipette/", method = RequestMethod.POST)
    public Pipette addPipette(@RequestBody Pipette pipette) {
        return repo.save(pipette);
    }

    @RequestMapping(value = "/pipette/", method = RequestMethod.PUT)
    public Pipette putPipette(@RequestBody Pipette pipette) {
        return repo.save(pipette);
    }


    @RequestMapping(value = "/pipette/{id}", method = RequestMethod.DELETE)
    public void deletePipette(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {

            repo.deleteById(id);
        }

    }
}
