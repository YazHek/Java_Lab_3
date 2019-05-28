package ua.lviv.iot.Java_Lab8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Java_Lab8.models.Flask;
import ua.lviv.iot.Java_Lab8.repositories.FlaskRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class FlaskService {

    @Autowired
    private FlaskRepository repo;

    @RequestMapping(value = "/flask/", method = RequestMethod.GET)
    public List<Flask> getFlask() {

        List<Flask> flasks = new LinkedList<>();
        repo.findAll().forEach(flasks::add);

        if (flasks.isEmpty()) {

            return null;
        }

        return flasks;
    }


    @RequestMapping(value = "/flask/{id}", method = RequestMethod.GET)
    public Flask getFlask(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {

            return repo.findById(id).get();
        }

        return null;
    }


    @RequestMapping(value = "/flask/", method = RequestMethod.POST)
    public Flask addFlask(@RequestBody Flask flask) {
        return repo.save(flask);
    }


    @RequestMapping(value = "/flask/", method = RequestMethod.PUT)
    public Flask putFlask(@RequestBody Flask flask) {
        return repo.save(flask);
    }


    @RequestMapping(value = "/flask/{id}", method = RequestMethod.DELETE)
    public void deleteFlask(@PathVariable Integer id) {

        if (repo.findById(id).isPresent()) {

            repo.deleteById(id);
        }
        
    }


}
