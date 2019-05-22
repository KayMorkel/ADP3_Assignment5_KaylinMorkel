package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.service.churchPersons.BoatBoyService;

import java.util.Set;

@RestController
@RequestMapping("/boatBoy")
public class BoatBoyController
{
    @Autowired
    private BoatBoyService service;

    @PostMapping("/create")
    @ResponseBody
    public BoatBoy create(@RequestBody BoatBoy boatBoy) {
        return service.create(boatBoy);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public BoatBoy read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public BoatBoy update(@RequestBody BoatBoy boatBoy) {
        return service.update(boatBoy);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BoatBoy> getAll() {
        return service.getAll();
    }
}
