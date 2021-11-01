package breytenbach.theuns.example.springshell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    String test() {
        return "this is a test";
    }
}
