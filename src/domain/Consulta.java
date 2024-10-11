package domain;

import java.time.LocalDate;
import java.util.List;

public class Consulta {

    private Integer codigo;
    private LocalDate data;
    private String resumo;
    private Tratamento tratamento;
    private Vaterinario veterinario;
    private List<Exame> exames;

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public Tratamento getTratamento() {
        return tratamento;
    }
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
    public Vaterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Vaterinario veterinario) {
        this.veterinario = veterinario;
    }
    public Consulta(Integer codigo, LocalDate data, String resumo, Tratamento tratamento, Vaterinario veterinario) {
        this.codigo = codigo;
        this.data = data;
        this.resumo = resumo;
        this.tratamento = tratamento;
        this.veterinario = veterinario;
    }
    @Override
    public String toString() {
        return "Consulta [codigo=" + codigo + ", data=" + data + ", resumo=" + resumo + ", tratamento=" + tratamento
                + ", veterinario=" + veterinario + "]";
    }

    

}
