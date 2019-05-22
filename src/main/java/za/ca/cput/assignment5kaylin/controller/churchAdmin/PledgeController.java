package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.service.churchAdmin.PledgeService;

import java.util.Set;

@RestController
@RequestMapping("/pledge")
public class PledgeController
{
    @Autowired
    private PledgeService service;

    @PostMapping("/create")
    @ResponseBody
    public Pledge create(@RequestBody Pledge pledge) {
        return service.create(pledge);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Pledge read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Pledge update(@RequestBody Pledge pledge) {
        return service.update(pledge);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Pledge> getAll() {
        return service.getAll();
    }
}
