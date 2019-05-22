package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.service.churchPersons.FrailGoerService;

import java.util.Set;

@RestController
@RequestMapping("/frailGoer")
public class FrailGoerController
{
    @Autowired
    private FrailGoerService service;

    @PostMapping("/create")
    @ResponseBody
    public FrailGoer create(@RequestBody FrailGoer frailGoer) {
        return service.create(frailGoer);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public FrailGoer read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public FrailGoer update(@RequestBody FrailGoer frailGoer) {
        return service.update(frailGoer);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<FrailGoer> getAll() {
        return service.getAll();
    }
}
