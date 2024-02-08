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
public class DiseñadoresEsc extends Thread{
    private int type;
    private int name;
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int escenariosListos;
    private int duracionDia;
    public Dashboard db;

    public DiseñadoresEsc(int type, int name, Drive d, Semaphore m, int dia, Dashboard db) {
        this.type = type;
        this.name = name;
        this.salario = 26;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.escenariosListos = 0;
        this.duracionDia = dia;
        this.db = db;
    }
    
    @Override
        public void run(){
            while(true){
                
                try {
                    obtenerSalario();
                    System.out.println("Diseñador: " + type + "." + name +  " ha ganado: "+this.salarioAcumulado+"$");
                    trabajando();
                    sleep(this.duracionDia);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(DiseñadoresEsc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
        this.drive.SacarCostosOperativos(this.salarioAcumulado);
//        db.setCostosOP(this.salarioAcumulado);
//        db.getCmpCostos().setText(Float.toString(db.getCostosOP()));
//        db.getCmpCostos1().setText(Float.toString(db.getCostosOP()));
    }
    
    public void trabajando(){
        this.contador += 0.34;
        if (this.contador >= 1) {
            this.contador = 0;
            try {
                this.sem.acquire();
                this.drive.addEscenarios(type);//no se que parametro va aqui
                this.sem.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(DiseñadoresEsc.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
