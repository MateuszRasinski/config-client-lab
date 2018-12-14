package com.github.mateuszrasinski.microservices.udemy.configclientlab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    private final String helloWorldText;

    HelloWorldController(@Value("${hello-world.text}") String helloWorldText) {
        this.helloWorldText = helloWorldText;
    }

    @GetMapping("hello-world")
    public String helloWorld() {
        return helloWorldText;
    }
}
