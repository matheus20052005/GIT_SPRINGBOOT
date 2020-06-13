package lippert.matheus.exemplohellowordcliente;

import lippert.matheus.exemplohellowordcliente.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplohellowordclienteApplication {


	public static void main(String[] args) {

		 SpringApplication.run(ExemplohellowordclienteApplication.class, args);

		 Client cliente = new Client();
		 cliente.setNome("matheus");
		 cliente.setSobrenome("lippert");
		 System.out.println(cliente);

		 Client client1 = new Client("Vitor", "Dionisio");
		 System.out.println(client1);

		 System.out.println(new Client("Fernanda", "Schmidt", 1000.0));
	}

}
