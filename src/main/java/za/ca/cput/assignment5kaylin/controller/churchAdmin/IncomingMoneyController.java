package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.service.churchAdmin.IncomingMoneyService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/incomingMoney")
public class IncomingMoneyController
{
    @Autowired
    private IncomingMoneyService service;

    @PostMapping("/create")
    @ResponseBody
    public IncomingMoney create(@RequestBody IncomingMoney incomingMoney) {
        return service.create(incomingMoney);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public IncomingMoney read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public IncomingMoney update(@RequestBody IncomingMoney incomingMoney) {
        return service.update(incomingMoney);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<IncomingMoney> getAll() {
        return service.getAll();
    }
}
