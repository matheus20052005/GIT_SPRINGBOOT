package lippert.matheus.exemplohellowordcliente.model;

/**
 * @author Matheus Lippert
 * @since 12/06/2020 - 15:57
 * @version 1.0
 */
public class Client {

    private String nome;
    private String sobrenome;
    private double renda;

    public Client(String vitor, String dionisio) {
        this.renda = 0.0;
    }

    /**
     *  @param nome
     * @param sobrenome
     */
    public Client(String nome, String sobrenome, double renda) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.renda = 0.0;
        this.renda = renda;
    }

    public Client() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    /**
     *
     * @return
     */
    public double calcularRenda() {
        return this.renda * 1.10;
    }

    @Override
    public String toString() {
        return "\nnome = " + this.nome +
                "\nsobrenome = " +  this.sobrenome +
                "\nrenda = " + this.renda +
                "\n10% = " + this.calcularRenda();
    }
}
