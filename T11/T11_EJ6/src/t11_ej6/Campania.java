/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DAM
 */
public class Campania {

    private String nombre;
    private Set<Donacion> donaciones;

    public Campania() {
        this.nombre = "";
        this.donaciones = new HashSet<>();
    }

    public Campania(String nombre, Set<Donacion> donaciones) {
        this.nombre = nombre;
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones + '}';
    }

    public void añadirDonacion(Donacion d) {
        donaciones.add(d);
    }

    public void mostrarDonaciones() {
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas.");
            return;
        }
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }

    public void mostrarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Donacion d : donaciones) {
            if (d.getNombreDonante().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay donaciones de ese donante.");
        }
    }

    public int numeroDonaciones() {
        return donaciones.size();
    }

    public double totalRecaudado() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        return total;
    }

    public void ordenarDonaciones() {
        List<Donacion> lista = new ArrayList<>();

        for (Donacion d : donaciones) {
            int i = 0;
            while (i < lista.size() && lista.get(i).getCantidad() > d.getCantidad()) {
                i++;
            }
            lista.add(i, d);
        }

        System.out.println("Donaciones ordenadas (mayor a menor):");
        for (Donacion d : lista) {
            System.out.println(d);
        }
    }

}
