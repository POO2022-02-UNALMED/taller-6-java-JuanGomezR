package vehiculos;
import java.util.*;

public class Pais{
    public String nombre;
    public int ventas=0;
    public static ArrayList<Pais> paises= new ArrayList<>();
    public Pais(String nombre){
        this.nombre=nombre;
        Pais.paises.add(this);
    }
    public Pais(){
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public static Pais paisMasVendedor(){
        Pais max=new Pais();
        for (int i=0; i < Pais.paises.size(); i++){
            if (Pais.paises.get(i).ventas > max.ventas){
                max= Pais.paises.get(i);
            }
        }
        return max;
    }
}