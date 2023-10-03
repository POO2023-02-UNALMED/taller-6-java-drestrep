/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author david
 */
public class Automovil extends Vehiculo{
    private int _puestos;
    private static int _cantidadVehiculos;
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this._puestos = puestos;
        Automovil._cantidadVehiculos++;
    }
    
    public static int getCantidadVehiculos(){
        return Automovil._cantidadVehiculos; 
    }
    
    public int getPuestos(){
        return this._puestos;
    }
    
    public void setPuestos(int puestos){
        this._puestos = puestos;
    }
}
