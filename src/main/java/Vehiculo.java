package vehiculos;

public class Vehiculo{
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public int precio;
    public int peso;
    public String traccion;
    public Fabricante fabricante;
    public static int cantidadVehiculos=0;
    public static int cantidadAutomoviles=0;
    public static int cantidadCamionetas=0;
    public static int cantidadCamiones=0;
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa=placa;
        this.puertas=puertas;
        this.velocidadMaxima=velocidadMaxima;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
        Vehiculo.cantidadVehiculos++;
    }
    public Vehiculo(){
        fabricante.ventas++;
        fabricante.pais.ventas++;
        Vehiculo.cantidadVehiculos++;
    }
    public String vehiculosPorTipo(){
        String resultado=("Automoviles: " + Vehiculo.cantidadAutomoviles +"\n" + "Camionetas: " + Vehiculo.cantidadCamionetas + "\n" + "Camiones: "+ Vehiculo.cantidadCamiones);
        return resultado;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos){
        Vehiculo.cantidadVehiculos=cantidadVehiculos;
    }
    public static int getCantidadVehiculos(){
        return Vehiculo.cantidadVehiculos;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public String getTraccion(){
        return this.traccion;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getPeso(){
        return this.peso;
    }
    public Fabricante getFabricante(){
        return this.fabricante;
    }
}