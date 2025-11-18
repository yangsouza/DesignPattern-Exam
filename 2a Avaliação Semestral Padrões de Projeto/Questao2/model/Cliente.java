package com.invest.risco.model;

public class Cliente {

    private String nome;
    private int idade;
    private double rendaMensal;
    private double patrimonio;

    public Cliente(String nome, int idade, double rendaMensal, double patrimonio) {
        this.nome = nome;
        this.idade = idade;
        this.rendaMensal = rendaMensal;
        this.patrimonio = patrimonio;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getRendaMensal() { return rendaMensal; }
    public double getPatrimonio() { return patrimonio; }
}
