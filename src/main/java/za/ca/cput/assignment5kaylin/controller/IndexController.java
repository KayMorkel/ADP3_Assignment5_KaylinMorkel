package za.ca.cput.assignment5kaylin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
    @GetMapping("/")
    @ResponseBody
    public String getSomething()
    {
        return "WELCOME TO CHURCHMANNY";
    }
}
