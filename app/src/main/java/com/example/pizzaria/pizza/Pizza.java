package com.example.pizzaria.pizza;

import androidx.annotation.NonNull;

public class Pizza {
    private final String sabor;
    private final String ingredientes;
    private final String valor;

    public Pizza(String sabor, String ingredientes, String valor) {
        this.sabor = sabor;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }

    @NonNull
    @Override
    public String toString() {
        return sabor +
                ",    R$= " + valor;
    }
}
