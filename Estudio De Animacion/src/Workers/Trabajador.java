/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

/**
 *
 * @author danieldangelo
 */
public class Trabajador {
    private boolean trabaja;
    private int salario;
    private int drive;

    public Trabajador(boolean trabaja, int salario, int drive) {
        this.trabaja = trabaja;
        this.salario = salario;
        this.drive = drive;
    }
    
    public Trabajador(){
        this.trabaja = true;
        this.salario = 0;
        this.drive = 0;
    }
    
}
