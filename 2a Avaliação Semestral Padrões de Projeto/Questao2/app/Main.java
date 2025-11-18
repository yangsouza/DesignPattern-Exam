package com.invest.risco.app;

import com.invest.risco.model.Cliente;
import com.invest.risco.service.CalculadoraDeRisco;
import com.invest.risco.strategy.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Yang", 33, 12000, 250000);

        CalculadoraDeRisco calculadora = new CalculadoraDeRisco();

        calculadora.setStrategy(new ModeloAgressivo());
        System.out.println("Risco Agressivo: " + calculadora.calcular(cliente));

        calculadora.setStrategy(new ModeloModerado());
        System.out.println("Risco Moderado: " + calculadora.calcular(cliente));

        calculadora.setStrategy(new ModeloConservador());
        System.out.println("Risco Conservador: " + calculadora.calcular(cliente));
    }
}
