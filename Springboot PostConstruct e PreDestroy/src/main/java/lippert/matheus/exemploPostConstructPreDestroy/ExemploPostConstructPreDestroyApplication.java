package lippert.matheus.exemploPostConstructPreDestroy;

import lippert.matheus.exemploPostConstructPreDestroy.dao.ClientDAO;
import lippert.matheus.exemploPostConstructPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		Client cliennt = new Client();
		clientDAO.setClient(new Client("Matheus", "lippert"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("ClientDAO: " +clientDAO.getClient().toString());
	}

}
