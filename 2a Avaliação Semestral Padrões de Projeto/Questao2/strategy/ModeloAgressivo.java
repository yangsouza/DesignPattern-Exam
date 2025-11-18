package com.invest.risco.strategy;

import com.invest.risco.model.Cliente;

public class ModeloAgressivo implements RiskStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        return (cliente.getRendaMensal() * 0.10)
                + (cliente.getPatrimonio() * 0.05)
                - (cliente.getIdade() * 0.20);
    }
}
