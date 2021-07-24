package interfaces;

import java.util.List;

public interface IEscrivao extends IProfissional{

    IOcorrencia registraOcorrencia(List<String> vitimas, String data, String local, String descricao);

    void encaminhaOcorrencia();
}
