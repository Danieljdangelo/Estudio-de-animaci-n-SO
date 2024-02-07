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
    private int delivery;
    private int dia;
    private Dashboard db;
    
    public Director(Dashboard db, Drive d, Semaphore s, ProjectManager pm, int delivery, int dia){
        
        this.salarioAcc = 0;
        this.db = db;
        this.drive = d;
        this.sem = s;
        this.pm = pm;
        this.delivery = delivery;
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
                SupervisarPm();
                
                if(this.drive.delivery <= 0){
                    EnviarCaps();
                    this.drive.ReiniciarDeadline();
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
    
    //no funciona
    public void EnviarCaps(){
        if (this.drive.delivery == 0){
            try {
                this.sem.acquire();
                this.drive.EntregarCaps();
                this.sem.release();
//                this.drive.setCapsDisponibles(0);//tiene que ir en la funcion del drive
//                this.drive.setCapsPlotTwist(0);//tiene que ir en la funcion del drive
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void LaboresAdmin(){
        
    }
    
    public void SupervisarPm(){
        if("Viendo anime".equals(db.getPmLabel().getText())){
            pm.setCantidadFaltas(pm.getCantidadFaltas()+1);
            pm.setSalarioDescontado(pm.getSalarioDescontado()+100);
            db.getPmFaltas().setText(Integer.toString(pm.getCantidadFaltas()));
            db.getSalarioDesc().setText(Integer.toString(pm.getSalarioDescontado()));
        }else{
            System.out.println("El PM está trabajando");
        }
            
    }
    
    public double GananciasCap(){
        return 0;
    }
}
