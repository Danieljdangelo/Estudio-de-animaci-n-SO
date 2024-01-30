/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

/**
 *
 * @author danieldangelo
 */
public class Drive {
    
    public int animations;
    public int plotTwist;
    public int guiones;
    public int escenarios;
    public int doblajes;
    
    
    public Drive(){
        this.animations=0;
    }
    
    public void addAnimation(int type){
        if (type == 0){
            this.animations += 1;
            System.out.println("animaciones disponibles:" + this.animations);
        }
    }
    
    public void addPlotTwist(int type){
        if (type == 0) {
            this.plotTwist += 1;
            System.out.println("PlotTwists disponibles:" + this.plotTwist);
            
        }
    }
    
    public void addGuiones(int type){
        if (type == 0){
            this.guiones += 1;
            System.out.println("guiones disponibles:" + this.guiones);
        }
    }
    
    public void addEscenarios(int type){
        if (type == 0){
            this.escenarios += 1;
            System.out.println("escenarios disponibles:" + this.escenarios);
        }
    }
    
    public void addDoblajes(int type){
        if (type == 0){
            this.doblajes += 1;
            System.out.println("doblajes disponibles:" + this.doblajes);
        }
    }
    
}