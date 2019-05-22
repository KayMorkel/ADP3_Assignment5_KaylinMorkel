package za.ca.cput.assignment5kaylin.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.service.login.LoginService;

import java.util.Set;

@RestController
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    private LoginService service;

    @PostMapping("/create")
    @ResponseBody
    public Login create(@RequestBody Login login)
    {
        return service.create(login);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Login read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Login update(@RequestBody Login login) {
        return service.update(login);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Login> getAll() {
        return service.getAll();
    }
}
