package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.service.churchPersons.TeacherService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/teacher")
public class TeacherController
{
    @Autowired
    private TeacherService service;

    @PostMapping("/create")
    @ResponseBody
    public Teacher create(@RequestBody Teacher teacher) {
        return service.create(teacher);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Teacher read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Teacher update(@RequestBody Teacher teacher) {
        return service.update(teacher);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Teacher> getAll() {
        return service.getAll();
    }
}

