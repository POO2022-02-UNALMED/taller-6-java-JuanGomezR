package vehiculos;

public class Automovil extends Vehiculo{
    public int puestos;
    public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        this.placa=placa;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.fabricante=fabricante;
        this.puestos=puestos;
        this.puertas=4;
        this.velocidadMaxima=100;
        this.traccion="FWD";
        Vehiculo.cantidadAutomoviles++;
    }
}