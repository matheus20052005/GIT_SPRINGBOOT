package lippert.matheus.exemplolombok.controllers;

import lippert.matheus.exemplolombok.model.Cliente;
import lippert.matheus.exemplolombok.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordControler {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }

    //@GetMapping("/produto")
    //public String getProduto() {
    //  return "Objeto produto";
    // }

}
