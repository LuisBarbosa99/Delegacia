import interfaces.IPessoa;

public class Pessoa implements IPessoa {

    private String nome;

    private String cpf;

    private String endereco;

    private String dataNasc;


    public Pessoa(String nome, String cpf, String endereco, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
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

}
