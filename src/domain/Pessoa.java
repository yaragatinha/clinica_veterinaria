package domain;

public class Pessoa {

    protected Integer codigo;
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    protected String nome;
    protected String telefone;
    public Pessoa(Integer codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + "]";
    }
}


