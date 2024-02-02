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
public class DiseñadoresEsc extends Thread{
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int escenariosListos;
    private int duracionDia;

    public DiseñadoresEsc(Drive d, Semaphore m, int dia) {
        this.salario = 26;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.escenariosListos = 0;
        this.duracionDia = dia;
    }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
    }
    
    public void trabajando(){
        this.contador += 1;
        if (this.contador >= 4) {
            try {
                this.sem.acquire();
                this.drive.addAnimation(1);//no se que parametro va aqui
                this.sem.release();
                this.contador = 0;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(DiseñadoresEsc.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
