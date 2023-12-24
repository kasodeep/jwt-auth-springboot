package dev.deep.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/demo-controller")
@Hidden
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello(Principal principal) {
        return ResponseEntity.ok("Hello " + principal.getName());
    }
}
