/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author danieldangelo
 */
public class Empresa {
        public int dayDuration;
        public int screenWriters;
        public int designers;
        public int animators;
        public int actors;
        public int plotTwists;
        public int assemblers;
        public int delivery;
        
        public Empresa(int dayDuration, int screenWriters, int designers, int animators, int actors, int plotTwists, int assemblers, int delivery){
            this.dayDuration  = dayDuration;
            this.screenWriters = screenWriters;
            this.designers = designers;
            this.animators = animators;
            this.actors = actors;
            this.plotTwists = plotTwists;
            this.assemblers = assemblers;
            this.delivery = delivery;
        }
    
        public void createThreads(){
            int counter1 = screenWriters + designers;
            int counter2 = screenWriters + designers + animators;
            int counter3 = screenWriters + designers + animators + actors;
            int counter4 = screenWriters + designers + animators + actors + plotTwists;
            int counter5 = screenWriters + designers + animators + actors + plotTwists + assemblers;
            
            Semaphore mainMutex = new Semaphore(1);
            Drive drive = new Drive(delivery);
            Thread threads[] = new Thread[counter5];
            Director director = new Director(drive, mainMutex);
            ProjectManager pm = new ProjectManager(drive, mainMutex, dayDuration, delivery);
            
            for(int i = 0; i < threads.length; i++){
                if(i < screenWriters){
                    threads[i] = new Guionistas(0, i+1, drive, mainMutex, dayDuration);
                }else if(i < counter1){
                    threads[i] = new DiseñadoresEsc(1, i+1, drive, mainMutex, dayDuration);
                }else if(i < counter2){
                    threads[i] = new AnimadoresPer(2, i+1, drive, mainMutex, dayDuration);
                }else if(i < counter3){
                    threads[i] = new ActoresDoblaje(3, i+1, drive, mainMutex, dayDuration);
                }else if (i < counter4){
                    threads[i] = new GuionistasPlot(4, i+1, drive, mainMutex, dayDuration);
                }else if (i <= counter5){
                    threads[i] = new Ensambladores(5,  i+1, drive, mainMutex, dayDuration);
                }
            }
            
            
//            for(int i = 0; i < screenWriters; i++){
//                threads[i] = new Guionistas(0, i, drive, mainMutex, dayDuration);
//            }
//            for(int i = screenWriters; i < counter1; i++){
//                threads[i] = new DiseñadoresEsc(1, i, drive, mainMutex, dayDuration);
//            }
//            for(int i = counter1; i < counter2; i++){
//                threads[i] = new AnimadoresPer(2, i, drive, mainMutex, dayDuration);
//            }
//            for(int i = counter2; i < counter3; i++){
//                threads[i] = new ActoresDoblaje(3, i, drive, mainMutex, dayDuration);
//            }
//            for(int i = counter3; i < counter4; i++){
//                threads[i] = new GuionistasPlot(4, i, drive, mainMutex, dayDuration);
//            }
//            for(int i = counter4; i < counter5; i++){
//                threads[i] = new Ensambladores(5,  i, drive, mainMutex, dayDuration);
//            }
            
//            JOptionPane.showMessageDialog(null, threads.length);
            


//               Descomentar para ejecutar todos los hilos
//            for(int i = 0; i < threads.length; i++){
//                threads[i].start();
//            }



            threads[0].start();
            threads[1].start();
            threads[2].start();
            threads[3].start();
//            threads[4].start();
//            threads[5].start();
//            threads[6].start();
//            threads[7].start();
//            threads[8].start();
//            threads[9].start();
//            threads[10].start();
//            threads[11].start();
//            threads[12].start();
//            threads[13].start();
//            threads[14].start();
        }
        
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
    
    
    
    
    
    
    
//    public Drive drive;
//    public Semaphore sem;
//    public int dia;
//    public int numGuionistas;
//    public int numDisenadoresEsc;
//    public int numAnimadoresPer;
//    public int numActoresDob;
//    public int numGuionistasPlot;
//    public int numEnsambladores;
//    public ProjectManager pm;
//    public Director dir;
//
//    public Empresa(int duracionDia, int guionistas, int disEsc, int animPer, int guinistasPlot, int actoresDob, int ensambladores){
//        this.drive = new Drive();
//        this.sem = new Semaphore(6);//No se cuantos hilos pueden entrar en la seccion critica al mismo tiempo
//        this.dia = duracionDia;
//        this.numGuionistas = guionistas;
//        this.numDisenadoresEsc = disEsc;
//        this.numAnimadoresPer = animPer;
//        this.numActoresDob = actoresDob;
//        this.numGuionistasPlot = guinistasPlot;
//        this.numEnsambladores = ensambladores;
//        this.pm = new ProjectManager(this.drive, this.sem);
//        this.dir = new Director(this.drive, this.sem);
//    }
//
//    
//    // Funciones para crear empleados segun el numero ingresado en la interfaz
//    
//    public void crearGuionistas(int numGuionistas){//Me tranque un pelo y creo que para que sea mas facil, hay que hacer un arreglo de cada tipo para poder manipular mejor cada objeto
//        while(numGuionistas != 0){
//            Guionistas guionista = new Guionistas(drive, sem, dia);
//            numGuionistas --;
//        }
//    }
//    
//    public void crearDisenadoresEsc(int numDisEsc){
//        while(numDisEsc != 0){
//            DiseñadoresEsc disenador = new DiseñadoresEsc(drive, sem, dia);
//            numDisEsc --;
//        }
//    }
//    
//    public void crearAnimadoresPers(int numAnimPers){
//        while(numAnimPers != 0){
//            AnimadoresPer animador = new AnimadoresPer(drive, sem, dia);
//            numAnimPers --;
//        }
//    }
//    
//    public void crearActoresDobl(int numActDob){
//        while(numActDob != 0){
//            ActoresDoblaje actores = new ActoresDoblaje(drive, sem, dia);
//            numActDob --;
//        }
//        
//    }
//    
//    public void crearGuionistasPlot(int numGuiPlot){
//        while(numGuiPlot != 0){
//            GuionistasPlot guinistasPlot = new GuionistasPlot(drive, sem, dia);
//            numGuiPlot --;
//        }
//        
//    }
//    
//    public void crearEnsambladores(int numEns){
//        while(numEns != 0){
//            Ensambladores ensambladores = new Ensambladores(sem, drive, dia);
//            numEns --;
//        }
//        
//    }
//    
//    // Funciones para agregar empleados mientras el programa corre
//    
//    // Funciones para sacar cuentas de ingresos y egresos
//    
//    // Funciones para operar
//    
//    public void Operar(){
//        
//    }
}

