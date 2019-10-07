package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ChurchService;
import za.ca.cput.assignment5kaylin.service.churchPersons.SidesPersonService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/sidesPerson")
public class SidesPersonController
{
    @Autowired
    private SidesPersonService service;

    @PostMapping("/create")
    @ResponseBody
    public SidesPerson create(@RequestBody SidesPerson sidesPerson) {
        return service.create(sidesPerson);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public SidesPerson read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public SidesPerson update(@RequestBody SidesPerson sidesPerson) {
        return service.update(sidesPerson);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<SidesPerson> getAll() {
        return service.getAll();
    }
}
