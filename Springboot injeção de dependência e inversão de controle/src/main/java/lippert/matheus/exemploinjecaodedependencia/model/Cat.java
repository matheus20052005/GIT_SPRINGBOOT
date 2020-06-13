package lippert.matheus.exemploinjecaodedependencia.model;

import lippert.matheus.exemploinjecaodedependencia.interfaces.AnimalInterface;
import lippert.matheus.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author matheus lippert
 */
@Component

@Qualifier("Cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("MIAUUUU!");

    }
}
