import interfaces.IEscrivao;
import interfaces.IOcorrencia;

import java.util.List;

public class Escrivao extends Profissional implements IEscrivao {

    public Escrivao(String nome, String registroProfissional) {
        super(nome, registroProfissional);
    }

    @Override
    public IOcorrencia registraOcorrencia(List<String> vitimas, String data, String local, String descricao) {

        return new Ocorrencia(data, local,vitimas, descricao, this);
    }

    @Override
    public void encaminhaOcorrencia() {

    }
}
