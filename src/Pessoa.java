import interfaces.IEscrivao;
import interfaces.IOcorrencia;
import interfaces.IPessoa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa implements IPessoa {

    private String nome;

    private String cpf;

    private String endereco;

    private String dataNasc;

    private List<String> outros;

    public Pessoa(String nome, String cpf, String endereco, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public IOcorrencia solicitaOcorrencia() {
        IEscrivao escrivao = new Escrivao("Januario", "123654");

        List<String> vitimas = new ArrayList<>();

        vitimas.add(this.nome);

        if (this.getOutros() != null) {
            for (String vitima : this.outros) {
                vitimas.add(vitima);
            }
        }

        return escrivao.registraOcorrencia(vitimas, LocalDateTime.now().toString(), "Salgado, Caruaru-PE", "fomos roubados");
    }

    public String formatCPF() {
        String formattedCpf = "";



        return formattedCpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public List<String> getOutros() {
        return outros;
    }

    public void setOutros(List<String> outros) {
        this.outros = outros;
    }
}
