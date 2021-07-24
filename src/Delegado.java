import interfaces.IDelegado;

import java.util.List;

public class Delegado extends Profissional implements IDelegado {

    private List<Policial> agentes;

    public Delegado(String nome, String registroProfissional) {
        super(nome, registroProfissional);
    }


}
