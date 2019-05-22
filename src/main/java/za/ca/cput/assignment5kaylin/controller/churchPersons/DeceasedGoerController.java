package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.service.churchPersons.DeceasedGoerService;

import java.util.Set;

@RestController
@RequestMapping("/deceasedGoer")
public class DeceasedGoerController
{
    @Autowired
    private DeceasedGoerService service;

    @PostMapping("/create")
    @ResponseBody
    public DeceasedGoer create(@RequestBody DeceasedGoer deceasedGoer) {
        return service.create(deceasedGoer);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public DeceasedGoer read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public DeceasedGoer update(@RequestBody DeceasedGoer deceasedGoer) {
        return service.update(deceasedGoer);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<DeceasedGoer> getAll() {
        return service.getAll();
    }
}
