/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20_t5;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private float salario;
    
    public Cuenta(){
        salario = 0;
    }
    
    public Cuenta(float salario){
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void mostrar(){
        System.out.println("Salario: " + salario);
    }
    
    public void ingresar(float c){
        this.salario = salario + c;
    }
    
    public void extraer(float c){
        this.salario = salario - c;
    }
    
   
}
