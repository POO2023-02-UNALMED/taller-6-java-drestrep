/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Pais {
    private String _nombre;
    private static ArrayList<Pais> paises = new ArrayList<>();
    private ArrayList<Vehiculo> carros = new ArrayList<>();
    private static Pais paism = null;
    
    public Pais(String nombre){
        this._nombre = nombre;
        this.paises.add(this);
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;
    }
    
    public void addCarro(Vehiculo carro){
        this.carros.add(carro);
    }
    
    public ArrayList<Vehiculo> getCarros(){
        return this.carros;
    }
    
    public static ArrayList<Pais> getpaises(){
        return Pais.paises;
    }
    
    public void paisMas(){
        Pais m = null;
        int c = 0;
        for(Pais x: Pais.paises){
            
            if (x.carros.size()>c){
                m = x;
                c = x.carros.size();
            }
        }
        Pais.paism = m;
    }
    
    public static Pais paisMasVendedor(){
        return Pais.paism;
    }
}
