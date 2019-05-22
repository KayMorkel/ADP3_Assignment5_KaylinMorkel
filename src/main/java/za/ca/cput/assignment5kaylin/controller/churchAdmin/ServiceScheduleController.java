package za.ca.cput.assignment5kaylin.controller.churchAdmin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ServiceScheduleService;

import java.util.Set;

@RestController
@RequestMapping("/serviceSchedule")
public class ServiceScheduleController
{
    @Autowired
    private ServiceScheduleService service;

    @PostMapping("/create")
    @ResponseBody
    public ServiceSchedule create(@RequestBody ServiceSchedule serviceSchedule) {
        return service.create(serviceSchedule);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public ServiceSchedule read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public ServiceSchedule update(@RequestBody ServiceSchedule serviceSchedule) {
        return service.update(serviceSchedule);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<ServiceSchedule> getAll() {
        return service.getAll();
    }
}
