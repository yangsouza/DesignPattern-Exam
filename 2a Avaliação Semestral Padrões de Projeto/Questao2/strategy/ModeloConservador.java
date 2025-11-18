package com.invest.risco.strategy;

import com.invest.risco.model.Cliente;

public class ModeloConservador implements RiskStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        return (cliente.getRendaMensal() * 0.03)
                + (cliente.getPatrimonio() * 0.01)
                - (cliente.getIdade() * 0.40);
    }
}
