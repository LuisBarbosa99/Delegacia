import interfaces.IOcorrencia;

import java.util.List;

public class Ocorrencia implements IOcorrencia {

    private String data;

    private String local;

    private List<String> vitimas;

    private String descricao;

    private Escrivao registradaPor;

    private String responsavel;

    private String status;


    public Ocorrencia(String data, String local, List<String> vitimas, String descricao, Escrivao registradaPor) {
        this.data = data;
        this.local = local;
        this.vitimas = vitimas;
        this.descricao = descricao;
        this.registradaPor = registradaPor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<String> getVitimas() {
        return vitimas;
    }

    public void setVitimas(List<String> vitimas) {
        this.vitimas = vitimas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Escrivao getRegistradaPor() {
        return registradaPor;
    }

    public void setRegistradaPor(Escrivao registradaPor) {
        this.registradaPor = registradaPor;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
