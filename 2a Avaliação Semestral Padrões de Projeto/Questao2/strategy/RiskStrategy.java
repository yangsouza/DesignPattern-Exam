package com.invest.risco.strategy;

import com.invest.risco.model.Cliente;

public interface RiskStrategy {
    double calcularRisco(Cliente cliente);
}
