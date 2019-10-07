package za.ca.cput.assignment5kaylin.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.service.login.LoginStatusService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/loginStatus")
public class LoginStatusController
{
    @Autowired
    private LoginStatusService service;

    @PostMapping("/create")
    @ResponseBody
    public LoginStatus create(@RequestBody LoginStatus loginStatus) {
        return service.create(loginStatus);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public LoginStatus read(@PathVariable String s) {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public LoginStatus update(@RequestBody LoginStatus loginStatus) {
        return service.update(loginStatus);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s) {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<LoginStatus> getAll() {
        return service.getAll();
    }
}
