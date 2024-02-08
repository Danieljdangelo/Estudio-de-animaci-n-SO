/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Dashboard.Dashboard;
import java.util.Random;
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
    private int type;
    private Empresa empresa;
    private Random random;
    
    public Director(Dashboard db, Drive d, Semaphore s, ProjectManager pm, int delivery, int dia, Empresa empresa){
        
        this.salarioAcc = 0;
        this.db = db;
        this.drive = d;
        this.sem = s;
        this.pm = pm;
        this.delivery = delivery;
        this.dia = dia;
        this.type = 10;
        this.empresa = empresa;
        this.random = new Random();
    }
    
    public void ObtenerSalario(){
        
        this.salarioAcc += this.salario*24;
        this.drive.SacarCostosOperativos(this.salarioAcc);
    }
    
    @Override
    public void run(){
        while(true){
            try {
                ObtenerSalario();
                LaboresAdmin();
                if(drive.delivery == 0){
                    EnviarCaps();
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
            try {
                this.sem.acquire();
                this.drive.EntregarCaps();
                this.drive.ReiniciarDeadline();
                this.sem.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    

    public void LaboresAdmin() throws InterruptedException{
        boolean estado = SupervisarPm();
        if("Disney".equals(this.drive.name)){
            try {
                if (estado == true){

                    db.getCmpDirector1().setText("Supervisando");

                    }else if (SupervisarPm() == false){
                    db.getCmpDirector1().setText("Trabajando");
                }   
                } catch (InterruptedException ex) {

                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);

            }
        }else{
            try {
                if (estado == true){

                    db.getCmpDirector().setText("Supervisando");

                    }else if (SupervisarPm() == false){
                    db.getCmpDirector().setText("Trabajando");
                }   
                } catch (InterruptedException ex) {

                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);

            }
        }    
    }
        
    public boolean SupervisarPm() throws InterruptedException{
        boolean estado = false;
        if("Disney".equals(this.drive.name)){
            if(empresa.delivery > 0){
                int horaAleatoria = random.nextInt(24);
                System.out.println("Hora aleatoria " + horaAleatoria);
                for (int minuto = 0; minuto <35; minuto++){
                    if("Viendo anime".equals(db.getPmLabel().getText())){
                        System.out.println("El PM ESTARA VIENDO ANIME");
                        pm.setCantidadFaltas(pm.getCantidadFaltas()+1);
                        pm.setSalarioDescontado(pm.getSalarioDescontado()+100);
                        db.getPmFaltas1().setText(Integer.toString(pm.getCantidadFaltas()));
                        db.getSalarioDesc1().setText(Integer.toString(pm.getSalarioDescontado()));
                        estado = true;
                    }else{
                        System.out.println("El PM está trabajando");
                        estado = false;
                    }
                }
            }  
        }else{
            if(empresa.delivery > 0){
                int horaAleatoria = random.nextInt(24);
                System.out.println("Hora aleatoria " + horaAleatoria);
                for (int minuto = 0; minuto <35; minuto++){
                    if("Viendo anime".equals(db.getPmLabel().getText())){
                        System.out.println("El PM ESTARA VIENDO ANIME");
                        pm.setCantidadFaltas(pm.getCantidadFaltas()+1);
                        pm.setSalarioDescontado(pm.getSalarioDescontado()+100);
                        db.getPmFaltas().setText(Integer.toString(pm.getCantidadFaltas()));
                        db.getSalarioDesc().setText(Integer.toString(pm.getSalarioDescontado()));
                        estado = true;
                    }else{
                        System.out.println("El PM está trabajando");
                        estado = false;
                    }
                }
            }
        }
        return estado;
    }
    

}
