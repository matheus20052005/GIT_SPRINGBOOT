package lippert.matheus.exemploinjecaodedependencia.model;

import lippert.matheus.exemploinjecaodedependencia.interfaces.AnimalInterface;
import lippert.matheus.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author matheus lippert
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;


    public void execute() {
        animalInterface.comunicar();
    }




}
