package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.service.churchAdmin.UsageOfMoneyService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/usageOfMoney")
public class UsageOfMoneyController
{
    @Autowired
    private UsageOfMoneyService service;

    @PostMapping("/create")
    @ResponseBody
    public UsageOfMoney create(@RequestBody UsageOfMoney usageOfMoney) {
        return service.create(usageOfMoney);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public UsageOfMoney read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public UsageOfMoney update(@RequestBody UsageOfMoney usageOfMoney) {
        return service.update(usageOfMoney);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<UsageOfMoney> getAll() {
        return service.getAll();
    }
}
