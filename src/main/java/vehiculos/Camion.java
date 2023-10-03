/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author david
 */
public class Camion extends Vehiculo{
    private int _ejes;
    private static int _cantidadVehiculos;
    
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this._ejes = ejes;
        Camion._cantidadVehiculos++;
    }
    
    public static int getCantidadVehiculos(){
        return Camion._cantidadVehiculos; 
    }
    
    public int getEjes(){
        return this._ejes;
    }
    
    public void setEjes(int ejes){
        this._ejes = ejes;
    }
}
