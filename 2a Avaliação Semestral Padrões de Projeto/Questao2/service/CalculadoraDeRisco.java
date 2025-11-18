package com.invest.risco.service;

import com.invest.risco.model.Cliente;
import com.invest.risco.strategy.RiskStrategy;

public class CalculadoraDeRisco {

    private RiskStrategy strategy;

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcular(Cliente cliente) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia definida.");
        }
        return strategy.calcularRisco(cliente);
    }
}
