package com.invest.risco.strategy;

import com.invest.risco.model.Cliente;

public class ModeloModerado implements RiskStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        return (cliente.getRendaMensal() * 0.07)
                + (cliente.getPatrimonio() * 0.03)
                - (cliente.getIdade() * 0.30);
    }
}
