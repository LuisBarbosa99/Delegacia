import interfaces.IProfissional;

public class Profissional implements IProfissional {

    private String nome;

    private String registroProfissional;

    public Profissional(String nome, String registroProfissional) {
        this.nome = nome;
        this.registroProfissional = registroProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
