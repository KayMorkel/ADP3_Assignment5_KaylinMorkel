package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.service.churchAdmin.HallBookingService;

import java.util.Set;

@RestController
@RequestMapping("/hallBooking")
public class HallBookingController
{
    @Autowired
    private HallBookingService service;

    @PostMapping("/create")
    @ResponseBody
    public HallBooking create(@RequestBody HallBooking hallBooking) {
        return service.create(hallBooking);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public HallBooking read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public HallBooking update(@RequestBody HallBooking hallBooking) {
        return service.update(hallBooking);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<HallBooking> getAll() {
        return service.getAll();
    }
}
