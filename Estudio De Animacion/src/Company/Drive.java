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
    public int capacidadTotal;
    
    
    public Drive(){
        this.animations = 0;
        this.doblajes = 0;
        this.escenarios = 0;
        this.guiones = 0;
        this.plotTwist = 0;
        this.capacidadTotal = 0;
    }
    
    
    //Los print son para correr en frio pero hay que mostrarlo en la interfaz
    public void addAnimation(int type){
        if (animations < 55){
            if (type == 0){
                this.animations += 1;
                System.out.println("animaciones disponibles:" + this.animations);
            }
        }else System.out.println("El drive esta lleno.");
    }
    
    public void addPlotTwist(int type){
        if (plotTwist < 10){
            if (type == 0) {
                this.plotTwist += 1;
                System.out.println("PlotTwists disponibles:" + this.plotTwist);
            }
        }else System.out.println("El drive esta lleno.");
    }
    
    public void addGuiones(int type){
        if (guiones < 25){
            if (type == 0){
                this.guiones += 1;
                System.out.println("guiones disponibles:" + this.guiones);
            }
        }else System.out.println("El drive esta lleno");
    }
    
    public void addEscenarios(int type){
        if (escenarios < 20){
            if (type == 0){
                this.escenarios += 1;
                System.out.println("escenarios disponibles:" + this.escenarios);
            }
        }else System.out.println("El drive esta lleno.");
    }
    
    public void addDoblajes(int type){
        if(doblajes < 35){
            if (type == 0){
                this.doblajes += 1;
                System.out.println("doblajes disponibles:" + this.doblajes);
            }
        }else System.out.println("El drive esta lleno.");
    }
    
    public int CapacidadDrive(){
        
        return this.capacidadTotal = animations + plotTwist + guiones + escenarios + doblajes;
        
    }
}