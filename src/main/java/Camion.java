package vehiculos;

public class Camion extends Vehiculo{
    public int ejes;
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        this.placa=placa;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.fabricante=fabricante;
        this.ejes=ejes;
        this.puertas=2;
        this.velocidadMaxima=80;
        this.traccion="4X2";
        fabricante.pais.ventas++;
        fabricante.ventas++;
        Vehiculo.cantidadVehiculos++;
        Vehiculo.cantidadCamiones++;
    }
}