package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.service.churchPersons.PersonService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController
{
    @Autowired
    private PersonService service;

    @PostMapping("/create")
    @ResponseBody
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Person read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Person> getAll() {
        return service.getAll();
    }
}
