package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
import za.ca.cput.assignment5kaylin.service.churchPersons.MarriedGoerService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/marriedGoer")
public class MarriedGoerController
{
    @Autowired
    private MarriedGoerService service;

    @PostMapping("/create")
    @ResponseBody
    public MarriedGoer create(@RequestBody MarriedGoer marriedGoer) {
        return service.create(marriedGoer);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public MarriedGoer read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public MarriedGoer update(@RequestBody MarriedGoer marriedGoer) {
        return service.update(marriedGoer);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<MarriedGoer> getAll() {
        return service.getAll();
    }
}
