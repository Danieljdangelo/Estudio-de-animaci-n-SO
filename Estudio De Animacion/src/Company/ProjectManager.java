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
public class ProjectManager extends Thread{
    
    private int salario;
    private int salarioAcc;
    private Drive drive;
    private Semaphore sem;
    private boolean trabaja;
    public int dia;
    private int deadline;
    private Dashboard db;
    private int salarioDescontado;
    private int cantidadFaltas;

    public ProjectManager(Drive d, Semaphore s, int dia, int delivery, Dashboard db) {
        this.salario = 40;
        this.drive = d;
        this.sem = s;
        this.trabaja = false;
        this.dia = dia;
        this.deadline = delivery;
        this.db = db;
        this.salarioAcc = 0;
    }

    public int getSalarioDescontado() {
        return salarioDescontado;
    }

    public void setSalarioDescontado(int salarioDescontado) {
        this.salarioDescontado = salarioDescontado;
    }

    public int getCantidadFaltas() {
        return cantidadFaltas;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }
    @Override
    public void run(){
        while (true){
            try{
                getSalario();
                mostrarGbEnUso();
                System.out.println("El project manager ha ganado: " + this.salarioAcc);
                work();
                sleep(dia);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void getSalario(){
        this.salarioAcc += this.salario*24;
        this.drive.SacarCostosOperativos(this.salarioAcc - getSalarioDescontado());
        System.out.println("El project manager ha ganado: " + this.salarioAcc);
    }
    
    private void mostrarGbEnUso(){
        if("Disney".equals(this.drive.name)){
            db.getGbEnUso1().setText(Integer.toString(this.drive.CapacidadDrive()));
        }else{
            db.getGbEnUso().setText(Integer.toString(drive.CapacidadDrive()));
        }
    }
    
    private String verAnime(int dias) {
        String estado = "Viendo anime";
        try {
            sleep(dias);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }
    
    private String trabajar(int dias) {
        String estado = "Trabajando";
        try {
            sleep(dias);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }
    
    public void work(){
        if("Disney".equals(this.drive.name)){
            for (int hora = 1; hora <= 16; hora++) {
                if (hora % 2 == 1) {
                    db.getPmLabel1().setText(verAnime(hora/2));
                } else {
                    db.getPmLabel1().setText(trabajar(hora/2));
                }
            }
            for (int hora = 17; hora <= 24; hora++) {
                trabajar(1);
            }
            this.drive.ActualizarDeadlinePm();
        }else{
            for (int hora = 1; hora <= 16; hora++) {
                if (hora % 2 == 1) {
                    db.getPmLabel().setText(verAnime(hora/2));
                } else {
                    db.getPmLabel().setText(trabajar(hora/2));
                }
            }
            for (int hora = 17; hora <= 24; hora++) {
                trabajar(1);
            }
            this.drive.ActualizarDeadlinePm();
        }
    }
}
