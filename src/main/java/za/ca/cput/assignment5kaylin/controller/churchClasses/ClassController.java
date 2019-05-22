package za.ca.cput.assignment5kaylin.controller.churchClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.service.churchClasses.ClassService;

import java.util.Set;

@RestController
@RequestMapping("/class")
public class ClassController
{
    @Autowired
    private ClassService service;

    @PostMapping("/create")
    @ResponseBody
    public Class create(@RequestBody Class aClass) {
        return service.create(aClass);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Class read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Class update(@RequestBody Class aClass) {
        return service.update(aClass);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Class> getAll() {
        return service.getAll();
    }
}
