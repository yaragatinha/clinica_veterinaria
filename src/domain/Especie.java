package domain;

import java.util.List;
public class Especie {

    private Integer codigo;
    private String nome;
    private List<Pet> pets;
    
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Especie(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Especie [codigo=" + codigo + ", nome=" + nome + "]";
    }



}
