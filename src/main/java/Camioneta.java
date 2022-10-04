package vehiculos;

public class Camioneta extends Vehiculo{
    public boolean volco;
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        this.placa=placa;
        this.puertas=puertas;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.fabricante=fabricante;
        this.volco=volco;
        this.velocidadMaxima=90;
        this.traccion="4X4";
        Vehiculo.cantidadCamionetas++;
    }
}