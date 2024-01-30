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
public class GuionistasPlot{
        private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;

    public GuionistasPlot(int salario, Drive d, Semaphore m) {
        this.salario = salario;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
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
                Logger.getLogger(GuionistasPlot.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
