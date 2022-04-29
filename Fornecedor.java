package br.trimestral.senai.trimestral.model;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private String telfone;

    public Fornecedor(int id, String nome, String email, String telfone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telfone = telfone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    @Override
    public String toString() {
        return "Fornecedor\n" +
                "\nid: " + id +
                "\nnome: " + nome +
                "\nemail: " + email +
                "\ntelfone: " + telfone;
    }
}
