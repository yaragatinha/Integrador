public class Bolsista {

    private Integer Código;
    private String HoraSemanal;
    public Integer getCódigo() {
        return Código;
    }
    public void setCódigo(Integer código) {
        Código = código;
    }
    public String getHoraSemanal() {
        return HoraSemanal;
    }
    public void setHoraSemanal(String horaSemanal) {
        HoraSemanal = horaSemanal;
    }
    public Bolsista(Integer código, String horaSemanal) {
        Código = código;
        HoraSemanal = horaSemanal;
    }
    @Override
    public String toString() {
        return "Bolsista [Código=" + Código + ", HoraSemanal=" + HoraSemanal + "]";
    }

    
}
