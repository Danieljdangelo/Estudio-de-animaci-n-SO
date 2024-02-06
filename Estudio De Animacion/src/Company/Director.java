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
public class Director extends Thread{
    
    private int salario = 60;
    private float salarioAcc;
    private Drive drive;
    private Semaphore sem;
    private ProjectManager pm;
    private int deadline;
    private int dia;
    private Dashboard db;
    
    public Director(Dashboard db, Drive d, Semaphore s, ProjectManager pm, int deadline, int dia){
        
        this.salarioAcc = 0;
        this.db = db;
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
                if(this.drive.deadline <= 0){
                    EnviarCaps();
                    //db.getCmpDeadline().setText(Integer.toString(deadline));//Encontrar forma de actualizar deadline de la interfaz
                    sleep(this.dia);
                }else{
                    //LaboresAdmin();
                    //SupervisarPm();
                    sleep(this.dia);
                }
                
                System.out.println("El director ha ganado: " + this.salarioAcc + "$");
                sleep(this.dia);
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void EnviarCaps(){
        if (this.drive.deadline == 0){
            try {
                this.sem.acquire();
                this.drive.EntregarCaps(10);
                this.sem.release();
                //this.drive.capsDisponibles = 0;//tiene que ir en la funcion del drive
                //this.drive.capsPlotTwist = 0;//tiene que ir en la funcion del drive
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void LaboresAdmin(){
        
    }
    
    public void SupervisarPm(){
        
    }
    
    public double GananciasCap(){
        return 0;
    }
}
