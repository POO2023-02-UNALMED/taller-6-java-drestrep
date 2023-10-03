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
public class Fabricante {
    private String _nombre;
    private Pais _pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private ArrayList<Vehiculo> carros = new ArrayList<>();
    private static Fabricante fabricantem = null;
    
    
    public Fabricante(String nombre, Pais pais){
        this._nombre = nombre;
        this._pais = pais;
        this.fabricantes.add(this);
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;
    }
    
    public Pais getPais(){
        return this._pais;
    }
    
    public void setPais(Pais pais){
        this._pais = pais;
    }
    
    public void addCarro(Vehiculo carro){
        this.carros.add(carro);
    }
    
    public void fabricaMas(){
        Fabricante m = null;
        int c = 0;
        for (Fabricante x:fabricantes){
            if (x.carros.size()>c){
                m = x;
                c = x.carros.size();
            }
        }
        Fabricante.fabricantem = m;
    }
    
    public static Fabricante fabricaMayorVentas(){
        return fabricantem;
    }
}
