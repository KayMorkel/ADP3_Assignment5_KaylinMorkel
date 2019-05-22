package za.ca.cput.assignment5kaylin.controller.churchPersons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.service.churchPersons.StudentService;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudentService service;

    @PostMapping("/create")
    @ResponseBody
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Student read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Student update(@RequestBody Student student) {
        return service.update(student);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Student> getAll() {
        return service.getAll();
    }
}
