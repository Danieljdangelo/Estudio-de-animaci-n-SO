/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Dashboard.Dashboard;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danieldangelo
 */
public class ProjectManager extends Thread{
    
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private boolean trabaja;
    public int dia;
    private int deadline;
    private Dashboard db;

    public ProjectManager(Drive d, Semaphore s, int dia, int delivery, Dashboard db) {
        this.salario = 40;
        this.drive = d;
        this.sem = s;
        this.trabaja = false;
        this.dia = dia;
        this.deadline = delivery;
        this.db = db;
    }
    
    
    //Poner en el run el estado de lo que esta haciendo el pm usando los getters de los labels del dashboard
    @Override
    public void run(){
        while (true){
            try{
                getSalario();
                db.getGbEnUso().setText(Integer.toString(drive.CapacidadDrive()));//Para mostrar cuantos gb hay en uso
                work();
                sleep(dia);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void getSalario(){
        this.salario += salario*24;
    }
    
//    public int DueDate(int deadline){
//        
//        return deadline--;
//        
//    }
    
    private String verAnime(int dias) {
        String estado = "Viendo anime";
        try {
            sleep(dias); // Convierte horas a milisegundos
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }
    
    private String trabajar(int dias) {
        String estado = "Trabajando";
        try {
            sleep(dias);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }
    
    public void work(){
        while (deadline > 0) {
            // Fanatismo al anime durante las primeras 16 horas
            for (int hora = 1; hora <= 16; hora++) {
                if (hora % 2 == 1) {
                    db.getPmLabel().setText(verAnime(hora/2)); // Ve anime durante 30 minutos
                } else {
                    db.getPmLabel().setText(trabajar(hora/2)); // Trabaja durante 30 minutos
                }
            }

            // Las últimas 8 horas cambian el contador con los días restantes para la entrega
            for (int hora = 17; hora <= 24; hora++) {
                trabajar(1);
            }

            // Al final del día de trabajo, disminuye el contador de días de entrega en 1
            deadline--;
        }
    }
    
    
}
