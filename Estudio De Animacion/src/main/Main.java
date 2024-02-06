/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Class.ManejoDeData;
import Dashboard.Dashboard;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author danieldangelo
 */
public class Main {
    private static ManejoDeData mdd;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.setResizable(false);
        d.setLocationRelativeTo(null);
        
//        File masterdata = cargarMasterData();
//        if (masterdata != null) {
//            mdd = new ManejoDeData(masterdata);
//        }
    }   
            
//    private static File cargarMasterData() {
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setAcceptAllFileFilterUsed(false);
//        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto (TXT)", "txt"));
//        fileChooser.showOpenDialog(null);
//        File archivo = fileChooser.getSelectedFile();
//        if (archivo != null) {
//            return archivo;
//        }
//    
//        JOptionPane.showMessageDialog(null, "Asegúrese de seleccionar un archivo");
//        return null;
//    }
    
}
