public class Funcionario {

    protected Integer Código;
    protected String Nome;
    protected String Email;
    protected String Senha;
    protected SexoEnum sexo;

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
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public SexoEnum getSexo() {
        return sexo;
    }
    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }
    public Funcionario(Integer código, String nome, String email, String senha, SexoEnum sexo) {
        Código = código;
        Nome = nome;
        Email = email;
        Senha = senha;
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Funcionario [Código=" + Código + ", Nome=" + Nome + ", Email=" + Email + ", Senha=" + Senha + ", sexo="
                + sexo + "]";
    }

    
    

    
}
