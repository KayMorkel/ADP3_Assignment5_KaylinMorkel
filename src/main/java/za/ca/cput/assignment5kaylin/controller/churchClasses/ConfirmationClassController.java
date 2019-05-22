package za.ca.cput.assignment5kaylin.controller.churchClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.service.churchClasses.ConfirmationClassService;

import java.util.Set;

@RestController
@RequestMapping("/confirmationClass")
public class ConfirmationClassController
{
    @Autowired
    private ConfirmationClassService service;

    @PostMapping("/create")
    @ResponseBody
    public ConfirmationClass create(@RequestBody ConfirmationClass confirmationClass) {
        return service.create(confirmationClass);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public ConfirmationClass read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public ConfirmationClass update(@RequestBody ConfirmationClass confirmationClass) {
        return service.update(confirmationClass);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<ConfirmationClass> getAll() {
        return service.getAll();
    }
}
