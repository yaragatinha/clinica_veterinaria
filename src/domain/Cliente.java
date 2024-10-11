package domain;

import java.util.List;

public class Cliente {

    private String endereco;
    private Atendente cadastradoPor;
    private List<Pet> pets;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }
    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }
    public Cliente(String endereco, Atendente cadastradoPor) {
        this.endereco = endereco;
        this.cadastradoPor = cadastradoPor;
    }
    @Override
    public String toString() {
        return "Cliente [endereco=" + endereco + ", cadastradoPor=" + cadastradoPor + "]";
    }
    

}
