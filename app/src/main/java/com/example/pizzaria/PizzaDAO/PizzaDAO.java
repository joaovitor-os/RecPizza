package com.example.pizzaria.PizzaDAO;

import com.example.pizzaria.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaDAO
{

    private final static List<Pizza> pizzas = new ArrayList<>();
    public List<Pizza> todos()
    {
        return new ArrayList<>(pizzas);
    }

    public void salva (Pizza pizza)
    {
        pizzas.add(pizza);
    }
}
