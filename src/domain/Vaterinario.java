package domain;

public class Vaterinario extends Pessoa{

    private String crmv;

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public Vaterinario(Integer codigo, String nome, String telefone, String crmv) {
        super(codigo, nome, telefone);
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "Veterinario [crmv=" + crmv + "]";
    }

}
