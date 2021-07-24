import interfaces.ICriminoso;

public class Criminoso implements ICriminoso {

    private String delito;

    public Criminoso(String delito) {
        this.delito = delito;
    }

    @Override
    public String formatCPF() {
        return null;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }
}
