/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
    import java.io.File;
    import java.io.FileReader;
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
    import javax.swing.JOptionPane;
/**
 *
 * @author José
 */
public class ManejoDeData {
    private File masterData;
    
    public ManejoDeData(File masterData){
        this.masterData = masterData;
    }
    
    public ManejoDeData(){
        this(new File ("test\\dataSimulación.txt"));
    }
    
    public void leerTXT (){
        String line;
        String txt = "";
        File file = masterData;
        
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null){
                    if(!line.isEmpty()){
                        txt += line + "\n";
                    }
                }
            }
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null,"Ocurrio un problema al leer el archivo");
        }
    }
    
    public void escribirTXT (){
        File file = masterData;
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.print("Duración simulación: + Variable que almacena los segundos");
            pw.print("\n");
            pw.print("Deadline: + Variable que almacena el número de días");
            pw.print("\n");
            pw.print("Número de trabajadores y ensambladores: + ...");
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null,"Ocurrio un problema al escribir el archivo");
        }
        
    }
    
}
