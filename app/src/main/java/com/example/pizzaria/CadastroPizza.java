package com.example.pizzaria;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.os.Bundle;

import com.example.pizzaria.PizzaDAO.PizzaDAO;
import com.example.pizzaria.pizza.Pizza;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.widget.Toast.LENGTH_SHORT;

public class CadastroPizza extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTitle("Lista de Pizzas");
        setContentView(R.layout.activity_cadastro_pizza);

        PizzaDAO dao = new PizzaDAO();
        final EditText campoSabor = findViewById(R.id.activity_cadastrar_pizza_sabor);
        final EditText campoIngredientes = findViewById(R.id.activity_cadastrar_pizza_ingredientes);
        final EditText campoValor = findViewById(R.id.activity_cadastrar_pizza_valor);
        Button botaoSalvar = findViewById(R.id.activity_cadastro_pizza_botao_salvar_pizza);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sabor = campoSabor.getText().toString();
                String ingredientes = campoIngredientes.getText().toString();
                String valor = campoValor.getText().toString();

                 Pizza novaPizza = new Pizza(sabor, ingredientes, valor);
                 dao.salva(novaPizza);

                 startActivity(new Intent(CadastroPizza.this, MainActivity.class));
                Toast.makeText(CadastroPizza.this,"Pizza Salva",Toast.LENGTH_SHORT).show();
            }
        });
        ListView listaDePizza = findViewById(R.id.activity_main_lista_de_pizza);
    }
}