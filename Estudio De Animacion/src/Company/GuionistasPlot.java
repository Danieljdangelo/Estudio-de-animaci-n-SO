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
public class GuionistasPlot extends Thread{
    private int type;
    private int name;
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int duracionDia;
    public Dashboard db;

    public GuionistasPlot(int type, int name, Drive d, Semaphore m, int dia, Dashboard db) {
        this.type = type;
        this.name = name;
        this.salario = 34;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.duracionDia = dia;
        this.db= db;
    }
    
    @Override
        public void run(){
            while(true){
                
                try {
                    obtenerSalario();
                    System.out.println("Guionista de Plot: " + type + "." + name +  " ha ganado: "+this.salarioAcumulado+"$");
                    trabajando();
                    sleep(this.duracionDia);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(GuionistasPlot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
        db.setCostosOP(this.salarioAcumulado);
        db.getCmpCostos().setText(Float.toString(db.getCostosOP()));
    }
    
    public void trabajando(){
        this.contador += 0.34;
        if (this.contador >= 1) {
            this.contador = 0;
            try {
                this.sem.acquire();
                this.drive.addPlotTwist(4);
                this.sem.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(GuionistasPlot.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
