package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ChurchService;

import java.util.Set;

@RestController
@RequestMapping("/church")
public class ChurchController
{
    @Autowired
    private ChurchService service;

    @PostMapping("/create")
    @ResponseBody
    public Church create(@RequestBody Church church) {
        return service.create(church);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Church read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Church update(@RequestBody Church church) {
        return service.update(church);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Church> getAll() {
        return service.getAll();
    }
}
