package com.example.containers_mariajofre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Clientes;
import Objetos.Productos;

public class MainActivity extends AppCompatActivity {

    private Spinner clientes, productos;
    private TextView texto1, texto2, texto3, texto4, texto5, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientes = (Spinner)findViewById(R.id.spnClientes);
        productos = (Spinner)findViewById(R.id.spnProductos);
        texto1 = (TextView)findViewById(R.id.tv1);
        texto2 = (TextView)findViewById(R.id.tv2);
        texto3 = (TextView)findViewById(R.id.tv3);
        texto4 = (TextView)findViewById(R.id.tv4);
        texto5 = (TextView)findViewById(R.id.tv5);
        resultado = (TextView)findViewById(R.id.tvResult);

        //Se construye objeto Clientes
        Clientes cli = new Clientes();
        //Se construye objeto Productos
        Productos pro = new Productos();

        //Obtener mis listas
        String[] listaClientes =cli.getClientes();
        String[] listaProductos =pro.getProductos();

        //Creo mis ArrayAdapter
        ArrayAdapter adaptClientes = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaClientes);
        ArrayAdapter adaptProductos = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaProductos);

        //Le paso mis adaptadores a mis spinners
        clientes.setAdapter(adaptClientes);
        productos.setAdapter(adaptProductos);

        //Rellenamos el ScrollView
        texto1.setText(""+pro.getProductos()[0]);
        texto2.setText(""+pro.getProductos()[1]);
        texto3.setText(""+pro.getProductos()[2]);
        texto4.setText(""+pro.getProductos()[3]);
        texto5.setText(""+pro.getProductos()[4]);

    }
    //Calcular resta del salario del cliente, según producto
    public void Calcular(View view)
    {
        Clientes cli = new Clientes();

        if(clientes.getSelectedItem().equals("Pedro"))
        {
            if(productos.getSelectedItem().toString().equals("Cereales"))
            {
                resultado.setText("Seleccionaste a: Pedro y su salario es: " + cli.calcularSalarioPedro(6500));
            }
            if(productos.getSelectedItem().toString().equals("Arroz"))
            {
                resultado.setText("Seleccionaste a: Pedro y su salario es: " + cli.calcularSalarioPedro(2500));
            }
            if(productos.getSelectedItem().toString().equals("Fideos"))
            {
                resultado.setText("Seleccionaste a: Pedro y su salario es: " + cli.calcularSalarioPedro(2500));
            }
            if(productos.getSelectedItem().toString().equals("Ramitas"))
            {
                resultado.setText("Seleccionaste a: Pedro y su salario es: " + cli.calcularSalarioPedro(1300));
            }
            if(productos.getSelectedItem().toString().equals("Pie de Limón"))
            {
                resultado.setText("Seleccionaste a: Pedro y su salario es: " + cli.calcularSalarioPedro(6000));
            }
        }
        if(clientes.getSelectedItem().equals("Juan"))
        {
            if(productos.getSelectedItem().toString().equals("Cereales"))
            {
                resultado.setText("Seleccionaste a: Juan y su salario es: " + cli.calcularSalarioJuan(6500));
            }
            if(productos.getSelectedItem().toString().equals("Arroz"))
            {
                resultado.setText("Seleccionaste a: Juan y su salario es: " + cli.calcularSalarioJuan(2500));
            }
            if(productos.getSelectedItem().toString().equals("Fideos"))
            {
                resultado.setText("Seleccionaste a: Juan y su salario es: " + cli.calcularSalarioJuan(2500));
            }
            if(productos.getSelectedItem().toString().equals("Ramitas"))
            {
                resultado.setText("Seleccionaste a: Juan y su salario es: " + cli.calcularSalarioJuan(1300));
            }
            if(productos.getSelectedItem().toString().equals("Pie de Limón"))
            {
                resultado.setText("Seleccionaste a: Juan y su salario es: " + cli.calcularSalarioJuan(6000));
            }
        }

        if(clientes.getSelectedItem().equals("Maria"))
        {
            if(productos.getSelectedItem().toString().equals("Cereales"))
            {
                resultado.setText("Seleccionaste a: Maria y su salario es: " + cli.calcularSalarioMaria(6500));
            }
            if(productos.getSelectedItem().toString().equals("Arroz"))
            {
                resultado.setText("Seleccionaste a: Maria y su salario es: " + cli.calcularSalarioMaria(2500));
            }
            if(productos.getSelectedItem().toString().equals("Fideos"))
            {
                resultado.setText("Seleccionaste a: Maria y su salario es: " + cli.calcularSalarioMaria(2500));
            }
            if(productos.getSelectedItem().toString().equals("Ramitas"))
            {
                resultado.setText("Seleccionaste a: Maria y su salario es: " + cli.calcularSalarioMaria(1300));
            }
            if(productos.getSelectedItem().toString().equals("Pie de Limón"))
            {
                resultado.setText("Seleccionaste a: Maria y su salario es: " + cli.calcularSalarioMaria(6000));
            }
        }
    }
}