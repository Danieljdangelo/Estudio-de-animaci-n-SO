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
    private int salario;
    private Drive drive;
    private Semaphore sem;
    private float salarioAcumulado;
    private float contador;
    private int guionesListos;
    private float duracionDia;

    public Guionistas(Drive d, Semaphore m, int dia) {
        this.salario = 20;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.guionesListos = 0;
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
                Logger.getLogger(Guionistas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    @Override
    public void run(){//Esta funcion es la que hay que arreglar y replicar en las demás clases
        while (true){
            obtenerSalario();
            trabajando();
        }

    }
}
