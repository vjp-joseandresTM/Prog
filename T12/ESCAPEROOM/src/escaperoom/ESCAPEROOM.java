/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author alumno
 */
public class ESCAPEROOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fw = null;
        PrintWriter pw= null;
        FileReader fr = null;
        BufferedReader br = null;

        
        try {
            fr = new FileReader("C:\\Users\\alumno\\Documents\\ReposProg_25-26\\Prog\\T12\\datos_empleado.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("C:\\Users\\alumno\\Documents\\ReposProg_25-26\\Prog\\T12\\sospechosos_zona_cero.txt");
            pw = new PrintWriter(fw);
            
            String linea = br.readLine();
            int contador = 0;
            
            while(linea != null){
                if(linea.contains("Zona Cero")){
                    pw.println(linea);
                    contador++;
                }
                
                linea = br.readLine();
            }
            System.out.println("Contador: " + contador);
            
            br.close();
            fr.close();
            pw.close();
            fw.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("ERRRO");
        } catch (IOException e){
            System.out.println("error");
            
        }
    }


}
