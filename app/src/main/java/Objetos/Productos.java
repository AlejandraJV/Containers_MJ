package Objetos;

public class Productos {
    private int id;
    private String[] productos = {"Cereales", "Arroz", "Fideos","Ramitas", "Pie de Limón"};

    public Productos()
    {
        id = 1;
    }

    public Productos(int id, String[] productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }
}
