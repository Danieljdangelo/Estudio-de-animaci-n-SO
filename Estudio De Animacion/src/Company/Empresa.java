/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Dashboard.Dashboard;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author danieldangelo
 */
public class Empresa {
        public String name;
        public int dayDuration;
        public int screenWriters;
        public int designers;
        public int animators;
        public int actors;
        public int plotTwists;
        public int assemblers;
        public int delivery;
        public Drive drive;
        public Dashboard db;
        
        public Empresa(String name, int dayDuration, int screenWriters, int designers, int animators, int actors, int plotTwists, int assemblers, int delivery, Dashboard db){
            this.name = name;
            this.dayDuration  = dayDuration;
            this.screenWriters = screenWriters;
            this.designers = designers;
            this.animators = animators;
            this.actors = actors;
            this.plotTwists = plotTwists;
            this.assemblers = assemblers;
            this.delivery = delivery;
            this.drive = new Drive(name, delivery, db, this);
            this.db = db;
            
        }

    public String getName() {
        
        return name;
    }
    
    public Drive getDrive(){

        return this.drive;
    }
        
    public void createThreads(){

        Semaphore mainMutex = new Semaphore(1);
        ProjectManager pm = new ProjectManager(drive, mainMutex, dayDuration, delivery, db);
        Director director = new Director(db, drive, mainMutex, pm, delivery, dayDuration, this);

        int counter1 = screenWriters + designers;
        int counter2 = screenWriters + designers + animators;
        int counter3 = screenWriters + designers + animators + actors;
        int counter4 = screenWriters + designers + animators + actors + plotTwists;
        int counter5 = screenWriters + designers + animators + actors + plotTwists + assemblers;


        Thread threads[] = new Thread[counter5];


        for(int i = 0; i < threads.length; i++){
            if(i < screenWriters){
                threads[i] = new Guionistas(0, i+1, drive, mainMutex, dayDuration, db);
            }else if(i < counter1){
                threads[i] = new DiseñadoresEsc(1, i+1, drive, mainMutex, dayDuration, db);
            }else if(i < counter2){
                threads[i] = new AnimadoresPer(2, i+1, drive, mainMutex, dayDuration, db);
            }else if(i < counter3){
                threads[i] = new ActoresDoblaje(3, i+1, drive, mainMutex, dayDuration, db);
            }else if (i < counter4){
                threads[i] = new GuionistasPlot(4, i+1, drive, mainMutex, dayDuration, db);
            }else if (i <= counter5){
                threads[i] = new Ensambladores(5,  i+1, drive, mainMutex, dayDuration, db);
            }
        }
//          Descomentar para ejecutar todos los hilos
            pm.start();
            director.start();
            for(int i = 0; i < threads.length; i++){
                threads[i].start();
            }
        }
}

