package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.service.churchPersons.WardenService;

import java.util.Set;

@RestController
@RequestMapping("/warden")
public class WardenController
{
    @Autowired
    private WardenService service;

    @PostMapping("/create")
    @ResponseBody
    public Warden create(@RequestBody Warden warden) {
        return service.create(warden);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Warden read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Warden update(@RequestBody Warden warden) {
        return service.update(warden);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Warden> getAll() {
        return service.getAll();
    }
}
