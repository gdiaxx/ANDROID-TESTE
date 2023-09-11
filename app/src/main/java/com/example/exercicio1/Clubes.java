package com.example.exercicio1;

public class Clubes {
    public String nome;
    public int ano;
    public int titulos;


    public Clubes() {
    }

    public Clubes(String nome, int ano, int titulos) {
        this.nome = nome;
        this.ano = ano;
        this.titulos = titulos;
    }

    @Override
    public String toString(){
        return "Nome da instituição: " + this.nome + "\n" + "Ano de nascimento: "+ this.ano + "\n" + "Quantidade total de titulos: " + this.titulos;
    }
}





