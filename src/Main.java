import interfaces.IOcorrencia;

public class Main {

    public static void main(String[] args) {

        Pessoa vitima = new Pessoa("Maria Joana",
                "12345678911",
                "Rua das Primas",
                "31/02/1984"
        );

        Ocorrencia ocorrencia = (Ocorrencia) vitima.solicitaOcorrencia();

        System.out.println("vitimas: " + ocorrencia.getVitimas());
        System.out.println("data: " + ocorrencia.getData());
        System.out.println("local: " + ocorrencia.getLocal());
        System.out.println("descrição: " + ocorrencia.getDescricao());
        System.out.println("escrivão: " + ocorrencia.getRegistradaPor().getNome());
    }
}
