package domain;

import java.util.List;

public class Atendente extends Pessoa {

    private Double salario;
    private List<Cliente> clientesCadastrados;

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Atendente(Integer codigo, String nome, String telefone, Double salario) {
        super(codigo, nome, telefone);
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Atendente [salario=" + salario + "]";
    }
    private List<Cliente> clienteCadastrados;
}

