/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_cajafuerte;

/**
 *
 * @author alumno
 */
public class Monedas {

    private int valor;
    private String pais;
    private String material;
    
    //Constructores parametrizado y por defecto
    public Monedas(int valor, String pais, String material) {
        this.valor = valor;
        this.pais = pais;
        this.material = material;
    }

    public Monedas() {
        this.valor = 0;
        this.pais = "";
        this.material = "";
    }
    //Getters y setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    //Metodos de muestra.
    @Override
    public String toString() {
        return "Monedas{" + "valor=" + valor + ", pais=" + pais + ", material=" + material + '}';
    }

    public static void mostrarInfo(int valor, String pais, String material){
        System.out.println("La moneda vale: "+ valor);
        System.out.println("La moneda es de: "+ pais);
        System.out.println("La moneda cuyo material: "+ valor);
    }
    
}
