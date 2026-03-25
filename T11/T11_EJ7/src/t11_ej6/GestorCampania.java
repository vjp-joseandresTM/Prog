package t11_ej6;

import java.util.ArrayList;

public class GestorCampania {

    private ArrayList<Campania> campañas;   
    //Constructores
    public GestorCampania() {              
        campañas = new ArrayList<>();
    }

    public void añadirCampaña(String nombre) {   
        campañas.add(new Campania(nombre));
    }
    //Getters y setters
    public ArrayList<Campania> getCampañas() {
        return campañas;
    }

    public void setCampañas(ArrayList<Campania> campañas) {
        this.campañas = campañas;
    }
    
    
    public Campania buscarCampaña(String nombre) {  
        for (Campania c : campañas) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
    //Metodo que muestra campañlas
    public void mostrarCampañas() {   
        if (campañas.isEmpty()) {
            System.out.println("No hay campañas registradas.");
            return;
        }

        for (Campania c : campañas) {
            System.out.println("\n" + c.getNombre());
            c.mostrarDonaciones();
        }
    }
    //Metodo que muestra lo recaudado
    public double totalRecaudado() {   
        double total = 0;
        for (Campania c : campañas) {
            total += c.totalRecaudado();
        }
        return total;
    }
    
    //Calcular mayor donacion
    public Donacion mayorDonacion() {   
        Donacion mayor = null;

        for (Campania c : campañas) {
            for (Donacion d : c.getDonaciones()) {
                if (mayor == null || d.getCantidad() > mayor.getCantidad()) {
                    mayor = d;
                }
            }
        }
        return mayor;
    }
}
