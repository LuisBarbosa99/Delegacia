import interfaces.IInvestigacao;

import java.util.List;

public class Investigacao implements IInvestigacao {

    private String dataInicio;

    private String dataTermino;

    private Delegado conduzidaPor;

    private List<Policial> realizadaPor;


}
