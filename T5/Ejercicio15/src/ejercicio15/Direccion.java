/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author DAM
 */
public class Direccion {
    private String calle;
    private int numero;
    private int nPuerta;
    private String ciudad;
    
    
    public Direccion (){
        calle = "";
        numero = 0;
        nPuerta = 0;
        ciudad = "";
    }
    
    public Direccion(String calle, int nPiso, String ciudad, int nCalle){
        this.calle = calle;
        this.nPuerta = nPiso;
        this.numero = nCalle;
        this.ciudad = ciudad;
    }
    
    public String getCalle(){
        return calle;
    }
    
    public int getNpiso(){
        return nPuerta;
    }
    
    public int getNcalle(){
        return numero;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void mostrarDireccion(){
        System.out.println("Calle: " + getCalle());
        System.out.println("Numero de puerta: " + getNpiso());
        System.out.println("Numero: " + getNcalle());
        System.out.println("Ciudad: " + getCiudad());
    }
}
