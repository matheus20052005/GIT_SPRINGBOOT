package lippert.matheus.exemploComponentscan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dao")
public class ExemploComponentscanApplication {

	public static <T> void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploComponentscanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("objectDAO; " + objectDAO);
		System.out.println("objectJDBC dentro do objectDAO: " + ObjectDAO.getClassJDBC());
	}

}
