package vehiculos;
import java.util.*;

public class Fabricante{
    public String nombre;
    public Pais pais;
    public int ventas=0;
    static ArrayList<Fabricante> fabricas= new ArrayList<>();
    Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPais(Pais pais){
        this.pais=pais;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Pais getPais(){
        return this.pais;
    }
    public Fabricante fabricaMayorVentas(){
        Fabricante max=null;
        for (int i=0; i < Fabricante.fabricas.size(); i++){
            if (max==null){
                max= Fabricante.fabricas.get(i);
            }
            else if (Fabricante.fabricas.get(i).ventas > max.ventas){
                max= Fabricante.fabricas.get(i);
            }
        }
        return max;
    }
}