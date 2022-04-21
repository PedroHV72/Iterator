package Iterator;

public class Aluno {

    private String nome;
    private boolean presenca;

    public Aluno(String nome, boolean presenca) {
        this.nome = nome;
        this.presenca = presenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPresent() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

}
