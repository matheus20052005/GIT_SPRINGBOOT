package lippert.matheus.exemploPostConstructPreDestroy.dao;

import lippert.matheus.exemploPostConstructPreDestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//lombok
@Getter @Setter

//Springboot
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto foi criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado!");
    }


}
