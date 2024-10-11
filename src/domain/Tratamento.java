package domain;

import java.util.List;

public class Tratamento {

    private Integer codigo;
    private String descricao;
    private Vaterinario indicadoPor;
    
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Vaterinario getIndicadoPor() {
        return indicadoPor;
    }
    public void setIndicadoPor(Vaterinario indicadoPor) {
        this.indicadoPor = indicadoPor;
    }
    private List<Consulta> consultas;
    public Tratamento(Integer codigo, String descricao, Vaterinario indicadoPor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.indicadoPor = indicadoPor;
    }
    @Override
    public String toString() {
        return "Tratamento [codigo=" + codigo + ", descricao=" + descricao + ", indicadoPor=" + indicadoPor + "]";
    }
    
}
