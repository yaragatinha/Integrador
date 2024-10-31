public class Turma extends Matricula{

    private Integer Código;
    private String Nome;
    private String Situação;
    private String CargaHorária;
    
    public Integer getCódigo() {
        return Código;
    }
    public void setCódigo(Integer código) {
        Código = código;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSituação() {
        return Situação;
    }
    public void setSituação(String situação) {
        Situação = situação;
    }
    public String getCargaHorária() {
        return CargaHorária;
    }
    public void setCargaHorária(String cargaHorária) {
        CargaHorária = cargaHorária;
    }
    public Turma(Integer código, String nome, String situação, String cargaHorária) {
        Código = código;
        Nome = nome;
        Situação = situação;
        CargaHorária = cargaHorária;
    }

    @Override
    public String toString() {
        return "Turma [Código=" + Código + ", Nome=" + Nome + ", Situação=" + Situação + ", CargaHorária="
                + CargaHorária + "]";
    }

    

}
