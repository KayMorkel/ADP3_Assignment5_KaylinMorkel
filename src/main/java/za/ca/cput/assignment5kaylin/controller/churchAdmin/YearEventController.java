package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.service.churchAdmin.YearEventService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/yearEvent")
public class YearEventController
{
    @Autowired
    private YearEventService service;

    @PostMapping("/create")
    @ResponseBody
    public YearEvent create(@RequestBody YearEvent yearEvent) {
        return service.create(yearEvent);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public YearEvent read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public YearEvent update(@RequestBody YearEvent yearEvent) {
        return service.update(yearEvent);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<YearEvent> getAll() {
        return service.getAll();
    }

}
