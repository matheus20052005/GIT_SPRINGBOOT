package lippert.matheus.exemplohellowordrepositores.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matheus Lippert
 */
@RestController
public class HelloWordController {

    @GetMapping("/")
    public String index() {
        return "Boa Noite! Hello Word com rest repositories";
    }
}
