/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author david
 */
public class Camioneta extends Vehiculo {
    private boolean _volco;
    private static int _cantidadVehiculos;
    
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this._volco = volco;
        Camioneta._cantidadVehiculos++;
    }
    
    public static int getCantidadVehiculos(){
        return Camioneta._cantidadVehiculos; 
    }
    
    public boolean isVolco(){
        return this._volco;
    }
    
    public void setVolco(boolean volco){
        this._volco = volco;
    }
}
