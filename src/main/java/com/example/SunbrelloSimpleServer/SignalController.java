package com.example.SunbrelloSimpleServer;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SignalController {
    /**
     * @return: say hello
     */
    @PostMapping("/postSignal")
    public String sayHello(@RequestBody String signal) {
        System.out.println("Hello"+ signal);
        return "HELLOOOOOOOOO";
    }
}
