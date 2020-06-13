package lippert.matheus.exemplolombok.model;

import lombok.*;

/**
 * @author Matheus Lippert
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Cliente {

    @Getter @Setter
    private String Nome;

    @Getter @Setter
    private String Sobrenome;

    @Getter @Setter
    private int Idade;

    public Cliente() {
    }

    /**
     * @return ....
     */
    public  int calcularIdadeEmMeses() {
        return this.Idade * 12;
    }

}

