package za.ca.cput.assignment5kaylin.controller.churchClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.service.churchClasses.BibleClassService;

import java.util.Set;

@RestController
@RequestMapping("/bibleClass")
public class BibleClassController
{
    @Autowired
    private BibleClassService service;

    @PostMapping("/create")
    @ResponseBody
    public BibleClass create(@RequestBody BibleClass bibleClass) {
        return service.create(bibleClass);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public BibleClass read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public BibleClass update(@RequestBody BibleClass bibleClass) {
        return service.update(bibleClass);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BibleClass> getAll() {
        return service.getAll();
    }
}
