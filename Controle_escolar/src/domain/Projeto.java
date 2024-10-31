
import java.util.List;

public class Projeto {

    private Integer Código;
    private String Descrição;
    private String Título;
    private String CargaHorária;
    private Float ValorBolsa;
    private List<Bolsista> bolsistas;
    
    public Integer getCódigo() {
        return Código;
    }
    public void setCódigo(Integer código) {
        Código = código;
    }
    public String getDescrição() {
        return Descrição;
    }
    public void setDescrição(String descrição) {
        Descrição = descrição;
    }
    public String getTítulo() {
        return Título;
    }
    public void setTítulo(String título) {
        Título = título;
    }
    public String getCargaHorária() {
        return CargaHorária;
    }
    public void setCargaHorária(String cargaHorária) {
        CargaHorária = cargaHorária;
    }
    public Float getValorBolsa() {
        return ValorBolsa;
    }
    public void setValorBolsa(Float valorBolsa) {
        ValorBolsa = valorBolsa;
    }
    public List<Bolsista> getBolsistas() {
        return bolsistas;
    }
    public void setBolsistas(List<Bolsista> bolsistas) {
        this.bolsistas = bolsistas;
    }
    public Projeto(Integer código, String descrição, String título, String cargaHorária, Float valorBolsa) {
        Código = código;
        Descrição = descrição;
        Título = título;
        CargaHorária = cargaHorária;
        ValorBolsa = valorBolsa;
    }
    @Override
    public String toString() {
        return "Projeto [Código=" + Código + ", Descrição=" + Descrição + ", Título=" + Título + ", CargaHorária="
                + CargaHorária + ", ValorBolsa=" + ValorBolsa + "]";
    }

    
    

}
