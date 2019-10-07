package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.service.churchPersons.StandardGoerService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/standardGoer")
public class StandardGoerController
{
    @Autowired
    private StandardGoerService service;

    @PostMapping("/create")
    @ResponseBody
    public StandardGoer create(@RequestBody StandardGoer standardGoer) {
        return service.create(standardGoer);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public StandardGoer read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public StandardGoer update(@RequestBody StandardGoer standardGoer) {
        return service.update(standardGoer);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<StandardGoer> getAll() {
        return service.getAll();
    }
}
