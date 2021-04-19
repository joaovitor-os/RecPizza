package com.example.pizzaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaria.PizzaDAO.PizzaDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PizzaDAO dao = new PizzaDAO();
        setTitle("Lista de Pizzas");
        FloatingActionButton botaoNovaPizza = findViewById(R.id.activity_main_fab_nova_pizza);
        botaoNovaPizza.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, CadastroPizza.class));
            }
        });
        ListView listaDePizza = findViewById(R.id.activity_main_lista_de_pizza);
        listaDePizza.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dao.todos()));
    }
}
