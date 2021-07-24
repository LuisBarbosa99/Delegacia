import interfaces.IPolicial;

public class Policial extends Profissional implements IPolicial {

    private Delegado delegado;

    public Policial(String nome, String registroProfissional, Delegado delegado) {
        super(nome, registroProfissional);
        this.delegado = delegado;
    }
}
