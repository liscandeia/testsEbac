package br.com.liscandeia;

public class Cliente {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String nome;
    public void adicionarNome(String nome){
        setNome(nome);
    }
}
