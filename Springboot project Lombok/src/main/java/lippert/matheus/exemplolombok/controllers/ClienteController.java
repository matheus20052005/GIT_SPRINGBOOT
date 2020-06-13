package lippert.matheus.exemplolombok.controllers;

import lippert.matheus.exemplolombok.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public ArrayList<Cliente> getCliente() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cliente = new Cliente;
        cliente.setNome("Matheus");
        cliente.setSobrenome("lippert");
        cliente.setidade(15);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Matheus");
        cliente1.setSobrenome("lippert");
        cliente1.setidade(15);

        cliente.add(cliente);
        cliente.add(cliente1);

        return Cliente;



    }
}
