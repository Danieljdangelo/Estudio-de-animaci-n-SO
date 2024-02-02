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
public class ProjectManager extends Thread{
    
    private int salario;
    private Drive drive;
    private Semaphore sem;

    public ProjectManager(Drive d, Semaphore s) {
        this.salario = 40;
        this.drive = d;
        this.sem = s;
    }
    
    public void MandarCap(){
        
    }
}
