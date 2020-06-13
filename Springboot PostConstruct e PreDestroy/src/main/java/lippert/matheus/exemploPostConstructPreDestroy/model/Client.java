package lippert.matheus.exemploPostConstructPreDestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

//Lombook
@ToString
@Getter @Setter
@AllArgsConstructor

//Springboot
@Component
public class Client {

    private String name;
    private String lastname;

    public Client() {
        System.out.println("Classe cliente!");
    }
}
