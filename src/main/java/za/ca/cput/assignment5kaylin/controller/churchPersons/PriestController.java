package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.service.churchPersons.PriestService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/priest")
public class PriestController
{
    @Autowired
    private PriestService service;

    @PostMapping("/create")
    @ResponseBody
    public Priest create(@RequestBody Priest priest) {
        return service.create(priest);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Priest read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Priest update(@RequestBody Priest priest) {
        return service.update(priest);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Priest> getAll() {
        return service.getAll();
    }
}
