package vehiculos;

public class Automovil extends Vehiculo{
    public int puestos;
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        this.placa=placa;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.fabricante=fabricante;
        this.puestos=puestos;
        this.puertas=4;
        this.velocidadMaxima=100;
        this.traccion="FWD";
        fabricante.pais.ventas++;
        fabricante.ventas++;
        Vehiculo.cantidadVehiculos++;
        Vehiculo.cantidadAutomoviles++;
    }
}