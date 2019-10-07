package za.ca.cput.assignment5kaylin.controller.churchClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.service.churchClasses.SundaySchoolService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/sundaySchool")
public class SundaySchoolController
{
    @Autowired
    private SundaySchoolService service;

    @PostMapping("/create")
    @ResponseBody
    public SundaySchool create(@RequestBody SundaySchool sundaySchool) {
        return service.create(sundaySchool);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public SundaySchool read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public SundaySchool update(@RequestBody SundaySchool sundaySchool) {
        return service.update(sundaySchool);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<SundaySchool> getAll() {
        return service.getAll();
    }
}
