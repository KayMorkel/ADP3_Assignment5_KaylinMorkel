package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.service.churchPersons.LayMinisterService;

import java.util.Set;

@RestController
@RequestMapping("/layMinister")
public class LayMinisterController
{
    @Autowired
    private LayMinisterService service;

    @PostMapping("/create")
    @ResponseBody
    public LayMinister create(@RequestBody LayMinister layMinister) {
        return service.create(layMinister);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public LayMinister read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public LayMinister update(@RequestBody LayMinister layMinister) {
        return service.update(layMinister);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<LayMinister> getAll() {
        return service.getAll();
    }
}
