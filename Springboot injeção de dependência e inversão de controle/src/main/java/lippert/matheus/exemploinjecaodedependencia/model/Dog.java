package lippert.matheus.exemploinjecaodedependencia.model;

import lippert.matheus.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author matheus lippert
 */
@Component
@Primary
@Qualifier("Dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("au auuuuu!");
    }
}
