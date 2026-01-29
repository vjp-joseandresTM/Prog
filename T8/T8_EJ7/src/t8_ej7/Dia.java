package t8_ej7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM
 */
public class Dia {
    private String nombreDia;
    private int temperatura;
    
    //Constructores por defecto y parametrizado.
    public Dia(){
        this.nombreDia = "";
        this.temperatura = 0;
        
    }
    
    public Dia(String nombreDia, int temperatura){
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    //Getters y Setterss
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
    
}
