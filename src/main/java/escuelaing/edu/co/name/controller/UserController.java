package escuelaing.edu.co.name.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok("My name is YESID CAMILO MORA BARBOSA");
    }

}
