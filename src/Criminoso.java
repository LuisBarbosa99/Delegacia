import interfaces.ICriminoso;

public class Criminoso extends Pessoa implements ICriminoso {

    private String delito;

    public Criminoso(String nome, String cpf, String endereco, String dataNasc, String delito) {
        super(nome, cpf, endereco, dataNasc);
        this.delito = delito;
    }


    @Override
    public String formatCPF() {
        return null;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }
}
