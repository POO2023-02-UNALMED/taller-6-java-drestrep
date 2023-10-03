/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author david
 */
public class Vehiculo {
    private String _placa;
    private int _puertas;
    private int _velocidadMaxima;
    private String _nombre;
    private int _precio;
    private int _peso;
    private String _traccion;
    private Fabricante _fabricante;
    private static int _cantidadVehiculos;
    
    
    public Vehiculo(String placa, int puertas, int velocidadmaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this._placa = placa;
        this._puertas = puertas;
        this._velocidadMaxima = velocidadmaxima;
        this._nombre = nombre;
        this._precio = precio;
        this._peso = peso;
        this._traccion = traccion;
        this._fabricante = fabricante;
        this._fabricante.getPais().addCarro(this);
        this._fabricante.getPais().paisMas();
        this._fabricante.addCarro(this);
        this._fabricante.fabricaMas();
        Vehiculo._cantidadVehiculos++;
    }
    
    public static int getCantidadVehiculos(){
        return Vehiculo._cantidadVehiculos;
    }
    
    public static void setCantidadVehiculos(int cantidad){
        Vehiculo._cantidadVehiculos = cantidad;
    }
    
    public String getPlaca(){
        return this._placa;
    }
    
    public void setPlaca(String placa){
        this._placa = placa;
    }
    
    public int getPuertas(){
        return this._puertas;
    }
    
    public void setPuertas(int puertas){
        this._puertas = puertas;
    }
    
    public int getVelocidadMaxima(){
        return this._velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima){
        this._velocidadMaxima = velocidadMaxima;
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre= nombre;
    }
    
    public int getPrecio(){
        return this._precio;
    }
    
    public void setPrecio(int precio){
        this._precio = precio;
    }
    
    public int getPeso(){
        return this._peso;
    }
    
    public void setPeso(int peso){
        this._peso = peso;
    }
    
    public String getTraccion(){
        return this._traccion;
    }
    
    public void setTraccion(String traccion){
        this._traccion = traccion;
    }
    
    public Fabricante getFabricante(){
        return this._fabricante;
    }
    
    public void setFabricante(Fabricante fabricante){
        this._fabricante = fabricante;
    }
    
    public static String vehiculosPorTipo(){
        return ("Automoviles: "+Automovil.getCantidadVehiculos() + "\nCamionetas: "+Camioneta.getCantidadVehiculos()+"\nCamiones: "+Camion.getCantidadVehiculos());
    }
    
}
