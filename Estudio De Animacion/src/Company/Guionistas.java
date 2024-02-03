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
public class Guionistas extends Thread{
    private int type;
    private int name;
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int guionesListos;
    private int duracionDia;

    public Guionistas(int type, int name, Drive d, Semaphore m, int dia) {
        this.type = type;
        this.name = name;
        this.salario = 20;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.guionesListos = 0;
        this.duracionDia = dia;
    }
    
    @Override
        public void run(){
            while(true){
                
                try {
                    obtenerSalario();
                    System.out.println("Guionista: " + type + "." + name +  " ha ganado: "+this.salarioAcumulado+"$");
                    trabajando();
                    sleep(this.duracionDia);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Guionistas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
    }
    
    public void trabajando(){
        this.contador += 0.34;
        if (this.contador >= 1) {
            this.contador = 0;
            try {
                this.sem.acquire();
                this.drive.addGuiones(0);
                this.sem.release();
 
            } catch (InterruptedException ex) {
                Logger.getLogger(Guionistas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
