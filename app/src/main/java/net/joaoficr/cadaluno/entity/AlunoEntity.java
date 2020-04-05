package net.joaoficr.cadaluno.entity;

public class AlunoEntity {

    private String id_Aluno;
    private String nome;

    public String getId_Aluno() {
        return id_Aluno;
    }

    public void setId_Aluno(String id_Aluno) {
        this.id_Aluno = id_Aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    private String endereco;
    private String email;
    private String celular;
}
