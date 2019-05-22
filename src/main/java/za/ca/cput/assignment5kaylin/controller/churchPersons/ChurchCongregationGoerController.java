package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.service.churchPersons.ChurchCongregationGoerService;

import java.util.Set;

@RestController
@RequestMapping("/churchCongregationGoer")
public class ChurchCongregationGoerController
{
    @Autowired
    private ChurchCongregationGoerService service;

    @PostMapping("/create")
    @ResponseBody
    public ChurchCongregationGoer create(@RequestBody ChurchCongregationGoer churchCongregationGoer) {
        return service.create(churchCongregationGoer);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public ChurchCongregationGoer read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public ChurchCongregationGoer update(@RequestBody ChurchCongregationGoer churchCongregationGoer) {
        return service.update(churchCongregationGoer);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<ChurchCongregationGoer> getAll() {
        return service.getAll();
    }
}
