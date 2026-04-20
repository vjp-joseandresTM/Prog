/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simexamen;

/**
 *
 * @author DAM
 */
public class Bicicleta {
   private String id;
   private String modelo;
   private float precioHora;

    public Bicicleta(String id, String modelo, float precioHora) {
        this.id = id;
        this.modelo = modelo;
        this.precioHora = precioHora;
    }
   
   public Bicicleta(){
       this.id = "";
       this.modelo = "";
       this.precioHora = 0f;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + ", modelo=" + modelo + ", precioHora=" + precioHora + '}';
    }
   
   
}
