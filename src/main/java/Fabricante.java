package vehiculos;
import java.util.*;

public class Fabricante{
    public String nombre;
    public Pais pais;
    public int ventas=0;
    public static ArrayList<Fabricante> fabricas= new ArrayList<>();
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        Fabricante.fabricas.add(this);
    }
    public Fabricante(){
        this.ventas=0;
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
    public static Fabricante fabricaMayorVentas(){
        Fabricante max=new Fabricante();
        for (int i=0; i < Fabricante.fabricas.size(); i++){
            if (Fabricante.fabricas.get(i).ventas > max.ventas){
                max= Fabricante.fabricas.get(i);
            }
        }
        return max;
    }
}