package vehiculos;

public class Pais{
    public String nombre;
    public int ventas=0;
    public static ArrayList<Pais> paises= new ArrayList<>();
    Pais(String nombre){
        this.nombre=nombre;
        Pais.paises.add(this);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Pais paisMasVendedor(){
        Pais max=null;
        for (int i=0; i < Pais.paises.size(); i++){
            if (max=null){
                max= pais.paises.get(i);
            }
            elif (Pais.paises.get(i).ventas > max.ventas){
                max= pais.paises.get(i);
            }
        }
        return max;
    }
}