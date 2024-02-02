/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import java.util.concurrent.Semaphore;

/**
 *
 * @author danieldangelo
 */
public class Empresa {
//        public int dayDuration;
//        public int screenWriters;
//        public int designers;
//        public int animators;
//        public int actors;
//        public int plotTwists;
//        public int assemblers;
//        public int delivary;
//        Semaphore mainMutex = new Semaphore(1);
//        Drive drive = new Drive();
//        
//        public Empresa(int dayDuration, int screenWriters, int designers, int animators, int actors, int plotTwists, int assemblers, int delivery){
//            
//        }
    
//    public Drive drive;
//    public Semaphore semaphore;
    //guionistas
    //diseñadores de escenarios
    //animador de personajes
    //actores de doblaje
    //guionistas de plottwist
    //ensambladores
    //project manager
    //director
    public Drive drive;
    public Semaphore sem;
    public int dia;
    public int numGuionistas;
    public int numDisenadoresEsc;
    public int numAnimadoresPer;
    public int numActoresDob;
    public int numGuionistasPlot;
    public int numEnsambladores;
    public ProjectManager pm;
    public Director dir;

    public Empresa(int duracionDia, int guionistas, int disEsc, int animPer, int guinistasPlot, int actoresDob, int ensambladores){
        this.drive = new Drive();
        this.sem = new Semaphore(6);//No se cuantos hilos pueden entrar en la seccion critica al mismo tiempo
        this.dia = duracionDia;
        this.numGuionistas = guionistas;
        this.numDisenadoresEsc = disEsc;
        this.numAnimadoresPer = animPer;
        this.numActoresDob = actoresDob;
        this.numGuionistasPlot = guinistasPlot;
        this.numEnsambladores = ensambladores;
        this.pm = new ProjectManager(this.drive, this.sem);
        this.dir = new Director(this.drive, this.sem);
    }

    
    // Funciones para crear empleados segun el numero ingresado en la interfaz
    
    public void crearGuionistas(int numGuionistas){//Me tranque un pelo y creo que para que sea mas facil, hay que hacer un arreglo de cada tipo para poder manipular mejor cada objeto
        while(numGuionistas != 0){
            Guionistas guionista = new Guionistas(drive, sem, dia);
            numGuionistas --;
        }
    }
    
    public void crearDisenadoresEsc(int numDisEsc){
        while(numDisEsc != 0){
            DiseñadoresEsc disenador = new DiseñadoresEsc(drive, sem, dia);
            numDisEsc --;
        }
    }
    
    public void crearAnimadoresPers(int numAnimPers){
        while(numAnimPers != 0){
            AnimadoresPer animador = new AnimadoresPer(drive, sem, dia);
            numAnimPers --;
        }
    }
    
    public void crearActoresDobl(int numActDob){
        while(numActDob != 0){
            ActoresDoblaje actores = new ActoresDoblaje(drive, sem, dia);
            numActDob --;
        }
        
    }
    
    public void crearGuionistasPlot(int numGuiPlot){
        while(numGuiPlot != 0){
            GuionistasPlot guinistasPlot = new GuionistasPlot(drive, sem, dia);
            numGuiPlot --;
        }
        
    }
    
    public void crearEnsambladores(int numEns){
        while(numEns != 0){
            Ensambladores ensambladores = new Ensambladores(sem, drive, dia);
            numEns --;
        }
        
    }
    
    // Funciones para agregar empleados mientras el programa corre
    
    // Funciones para sacar cuentas de ingresos y egresos
    
    // Funciones para operar
    
    public void Operar(){
        
    }
}

