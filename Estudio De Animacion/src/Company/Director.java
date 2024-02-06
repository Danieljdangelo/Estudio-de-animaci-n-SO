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
public class Director extends Thread{
    
    private int salario = 60;
    private float salarioAcc;
    private Drive drive;
    private Semaphore sem;
    private ProjectManager pm;
    private int deadline;
    private int dia;
    
    public Director(Drive d, Semaphore s, ProjectManager pm, int deadline, int dia){
        
        this.salarioAcc = 0;
        this.drive = d;
        this.sem = s;
        this.pm = pm;
        this.deadline = deadline;
        this.dia = dia;
    }
    
    public void ObtenerSalario(){
        
        this.salarioAcc += this.salario*24;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                ObtenerSalario();
                System.out.println("El director ha ganado: " + this.salarioAcc + "$");
                sleep(this.dia);
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void EnviarCaps(){
        
    }
    
    public void LaboresAdmin(){
        
    }
    
    public void SupervisarPm(){
        
    }
    
    public double GananciasCap(){
        return 0;
    }
}
