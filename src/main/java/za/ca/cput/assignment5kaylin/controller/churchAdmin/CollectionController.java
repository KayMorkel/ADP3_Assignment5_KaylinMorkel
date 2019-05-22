package za.ca.cput.assignment5kaylin.controller.churchAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.service.churchAdmin.CollectionService;

import java.util.Set;

@RestController
@RequestMapping("/collection")
public class CollectionController
{
    @Autowired
    private CollectionService service;

    @PostMapping("/create")
    @ResponseBody
    public Collection create(@RequestBody Collection collection) {
        return service.create(collection);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Collection read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Collection update(@RequestBody Collection collection) {
        return service.update(collection);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Collection> getAll() {
        return service.getAll();
    }
}
