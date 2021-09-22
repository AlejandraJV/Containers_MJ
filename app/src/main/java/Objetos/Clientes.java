package Objetos;

public class Clientes {

    //Declaración de variables
    private int id;
    private String[] clientes = {"Pedro", "Juan", "Maria"};

    //Constructores
    public Clientes()
    {
        id = 1;
    }

    public Clientes(int id, String[] clientes) {
        this.id = id;
        this.clientes = clientes;
    }

    //Accesadores y Mutadores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getClientes() {
        return clientes;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    //Reglas de negocio
    public int calcularSalarioPedro(int producto)
    {
       int salario = 12000;
       int resultado = salario - producto;

        return resultado;
    }
    public int calcularSalarioJuan(int producto)
    {
        int salario = 20000;
        int resultado = salario - producto;

        return resultado;
    }
    public int calcularSalarioMaria(int producto)
    {
        int salario = 45000;
        int resultado = salario - producto;

        return resultado;
    }
}
