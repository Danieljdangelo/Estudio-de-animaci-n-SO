/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
    import java.io.File;
    import java.io.FileReader;
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
    
    public int[] leerTXT(){
        String line;
        String txt = "";
        File file = masterData;
        int[] valores = new int[8];
        int j = 0;
//        int i = 0;
        
        try{
//            String[] data;
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null){
//                    char[] characters = line.toCharArray();
//                    for (int i = 0; i < characters.length; i++){
//                        if(Character.isDigit(characters[i])){
//                            int number =  Character.getNumericValue(characters[i]);                            
//                            valores[j] = number;
//                            j++;
//                        }
//                        
//                    } 
                    

                     int number = Integer.parseInt(line);
                     
                     valores[j] = number;
                     j++;  
                }
                br.close();
                fr.close();
            }  
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null,"Ocurrio un problema al leer el archivo");
        }
//        for(int n = 0; n < valores.length; n++){
//            JOptionPane.showMessageDialog(null, valores[n]);
//        }
        
        return valores;
    }
    
    public void escribirTXT (String duracion, String guionistas, String diseñadores, String animadores, String actores, String plotTwists, String ensambladores, String entrega){
        File file = masterData;
        try{
            try (PrintWriter pw = new PrintWriter(file)) {
                pw.print(duracion);
                pw.print("\n" + guionistas);
                pw.print("\n" + diseñadores);
                pw.print("\n" + animadores);
                pw.print("\n" + actores);
                pw.print("\n" + plotTwists);
                pw.print("\n" + ensambladores);
                pw.print("\n" + entrega);
                
                
//                pw.print("Duración del día: " + duracion);
//                pw.print("\nNúmnero de guionistas: " + guionistas);
//                pw.print("\nNúmero de diseñadores de escenarios: " + diseñadores);
//                pw.print("\nNumero de animadores de personajes: " + animadores);
//                pw.print("\nNúmero de actores de doblaje: " + actores);
//                pw.print("\nNúmero de guionistas de PlotTwists: " + plotTwists);
//                pw.print("\nNúmero de ensambladores: " + ensambladores);
//                pw.print("\nDías disponibles para la entrega: " + entrega);
            }
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null,"Ocurrio un problema al escribir el archivo");
        }
        
    }
    
}
