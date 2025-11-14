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
    private int nCalle;
    private int nPiso;
    private String ciudad;
    
    public Direccion(String calle, int nPiso, String ciudad, int nCalle){
        this.calle = calle;
        this.nPiso = nPiso;
        this.nCalle = nCalle;
        this.ciudad = ciudad;
    }
    
    public String getCalle(){
        return calle;
    }
    
    public int getNpiso(){
        return nPiso;
    }
    
    public int getNcalle(){
        return nCalle;
    }
    
    public String getCiudad(){
        return ciudad;
    }
}
