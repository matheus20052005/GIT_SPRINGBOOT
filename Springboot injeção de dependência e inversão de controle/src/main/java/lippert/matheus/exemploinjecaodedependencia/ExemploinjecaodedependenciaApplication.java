package lippert.matheus.exemploinjecaodedependencia;

import lippert.matheus.exemploinjecaodedependencia.model.Cat;
import lippert.matheus.exemploinjecaodedependencia.model.Dog;
import lippert.matheus.exemploinjecaodedependencia.model.Pet;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author matheus lippert
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}
