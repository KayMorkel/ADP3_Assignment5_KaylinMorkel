package za.ca.cput.assignment5kaylin.controller.churchClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.service.churchClasses.BaptismClassService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/baptismClass")
public class BaptismClassController
{
    @Autowired
    private BaptismClassService service;

    @PostMapping("/create")
    @ResponseBody
    public BaptismClass create(@RequestBody BaptismClass baptismClass) {
        return service.create(baptismClass);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public BaptismClass read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public BaptismClass update(@RequestBody BaptismClass baptismClass) {
        return service.update(baptismClass);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<BaptismClass> getAll() {
        return service.getAll();
    }
}
