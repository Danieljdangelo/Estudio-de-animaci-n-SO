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
public class Ensambladores extends Thread {
    
    private int salary = 50;
    private int salaryAcc;
    private int duracionDia;
    private int capituloListo;
    private Semaphore s;
    private Drive drive;

    public Ensambladores(Semaphore sem, Drive driv, int dia) {
        this.salary = salary;
        this.salaryAcc = 0;
        this.duracionDia = dia;
        this.s = sem;
        this.drive = driv;
    }
    
    public void GetSalario(){
        
        this.salaryAcc += this.salary*24;
        
    }
    
    public void Run(){
        while (true){
            try{
                GetSalario();
                EnsamblarCap();
                //Tiene que retornar el cap listo, mostrarlo y agregarlo al drive
                sleep(this.duracionDia);
            }catch (InterruptedException ex) {
                Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void EnsamblarCap(){
        //Tiene que ingresar al drive y ver cuantas partes hay para poder armar un cap, si estan las suficientes, las junta y sube al drive.
    }
}
