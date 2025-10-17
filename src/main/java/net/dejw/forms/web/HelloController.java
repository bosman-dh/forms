package net.dejw.forms.web;
import net.dejw.forms.domain.ContactForm;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Witaj w Spring Boot!";
    }
}