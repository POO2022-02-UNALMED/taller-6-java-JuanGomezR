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
}