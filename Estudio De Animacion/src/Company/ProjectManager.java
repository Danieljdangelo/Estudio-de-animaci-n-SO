/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

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

    public ProjectManager(Drive d, Semaphore s, int dia, int delivery) {
        this.salario = 40;
        this.drive = d;
        this.sem = s;
        this.trabaja = false;
        this.dia = dia;
        this.deadline = delivery;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                getSalario();
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
    
    public void work(){
        if(deadline > 0){
            try {
                this.sem.acquire();
                drive.ActualizarDeadline();
                this.sem.release();
                        
            } catch (Exception e) {
            }
        }
    }
    
    
}
