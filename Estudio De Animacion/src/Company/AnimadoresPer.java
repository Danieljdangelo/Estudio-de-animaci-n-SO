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
public class AnimadoresPer extends Thread{
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int duracionDia;

    public AnimadoresPer(Drive d, Semaphore m, int dia) {
        this.salario = 40;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.duracionDia = dia;
    }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
    }
    
    public void trabajando(){
        this.contador += 0.34;
        if (this.contador >= 1) {
            try {
                this.sem.acquire();
                this.drive.addAnimation(salario);
                this.sem.release();
                this.contador = 0;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimadoresPer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
