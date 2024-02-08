/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import Class.ManejoDeData;
import Company.Drive;
import Company.Empresa;
import Company.Guionistas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author danieldangelo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Empresa company;
    public Empresa company2;
    ManejoDeData data = new ManejoDeData();
    public int guionesDB;
    public float costosOP;
    public float utilidadTTL;
    public float gananciaBruto;
    public float utilidadTTL1;
    public float gananciaBruto1;
    
    public Dashboard() {
        initComponents();
    }
    
    public void mostrar(int guiones){
        cmpGuiones.setText(String.valueOf(guiones));
    }
    
    public JTextField getField(){
        
        return cmpGuiones;
        
    }
    
    public JTextField getField1(){
        
        return cmpGuiones1;
        
    }
    
    public JTextField getFieldEscenarios(){

        return cmpEscenarios;

    }
    
    public JTextField getFieldEscenarios1(){

        return cmpEscenarios1;

    }

    public JTextField getFieldAnimaciones(){

        return cmpAnimaciones;

    }
    
    public JTextField getFieldAnimaciones1(){

        return cmpAnimaciones1;

    }

    public JTextField getFieldDoblajes(){

        return cmpDoblajes;

    }
    
    public JTextField getFieldDoblajes1(){

        return cmpDoblajes1;

    }
    
    public JTextField getFieldPlotTwists(){

        return cmpPlotDrive;

    }
    
    public JTextField getFieldPlotTwists1(){

        return cmpPlotDrive1;

    }

    public JTextField getFieldCapitulos(){
        
        return cmpCapEst;
    }
    
    public JTextField getFieldCapitulos1(){
        
        return cmpCapEst1;
    }
    
    public JTextField getFieldPlot(){
        
        return cmpPlotDrive;
    }
    
    public JTextField getFieldPlot1(){
        
        return cmpPlotDrive1;
    }
    
    public JTextField getFieldCapPlot(){
        
        return CapPlot;
    }
    
    public JTextField getFieldCapPlot1(){
        
        return cmpCapPlot1;
    }
    
    public JLabel getGbEnUso(){
        
        return gbEnUso;
    }
    
    public JTextField getPmLabel(){
        
        return cmpPM;
    }
    
    public JTextField getPmLabel1(){
        
        return cmpPM1;
    }
    
    
    public JTextField getPmFaltas(){
        
        return cmpFaltas;
    }
    
    public JTextField getPmFaltas1(){
        
        return cmpFaltas1;
    }
    
    public JTextField getSalarioDesc(){
        
        return cmpSalarioDesc;
    }
    
    public JTextField getSalarioDesc1(){
        
        return cmpSalarioDesc1;
    }
    
    public JTextField getCmpDeadline(){
        
        return cmpDeadline;
    }
    

    public JTextField getCmpDirector(){
        
        return cmpDirector;

    public JTextField getCmpDeadline1(){
        
        return cmpDeadline1;

    }
    
    public JTextField getCmpCostos(){
        
        return cmpCostos;
    }
    
    public JTextField getCmpCostos1(){
        
        return cmpCostos1;
    }
    
    public void setCostosOP(float costos){
        this.costosOP += costos;
//        getCmpCostos().setText(Float.toString(this.costosOP));
    }
    
    public float getCostosOP(){
        
        return this.costosOP;
    }
    
    public void setUtilidadTTL(float utilidad){
        this.utilidadTTL += utilidad;
    }
    
    public void setUtilidadTTL1(float utilidad){
        this.utilidadTTL1 += utilidad;
    }
    
    public float getUtilidadTTL(){
       return this.utilidadTTL;
    }
    
    public float getUtilidadTTL1(){
       return this.utilidadTTL1;
    }
    
    public JTextField getCmpUtilidad(){
        
        return cmpUtilidad;
    }
    
    public JTextField getCmpUtilidad1(){
        
        return cmpUtilidad1;
    }
    
    public void setGanaciaBruto(){
        this.gananciaBruto = this.utilidadTTL - this.costosOP;
    }
    
    public void setGanaciaBruto1(){
        this.gananciaBruto1 = this.utilidadTTL1 - this.costosOP;
    }
    
    public float getGananciaBruto(){
        return this.gananciaBruto;
    }
    
    public float getGananciaBruto1(){
        return this.gananciaBruto1;
    }
    
    public JTextField getCmpGanancia(){
        
        return cmpGanancias;
    }
    
    public JTextField getCmpGanancia1(){
        
        return cmpGanancias1;
    }
    
//    public JTextField getFieldPlotTwists(){
//
//        return cmpPlotDrive;
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        disneyTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new ImagePanel1("/Images/amarillo y azul.jpg");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveConfigBtn = new javax.swing.JButton();
        startSimBtn = new javax.swing.JButton();
        spnDuracion = new javax.swing.JSpinner();
        spnAnimadores = new javax.swing.JSpinner();
        spnEntrega = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnDiseñadores = new javax.swing.JSpinner();
        spnActores = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnPlotTwists = new javax.swing.JSpinner();
        spnGuionistas = new javax.swing.JSpinner();
        spnEnsambladores = new javax.swing.JSpinner();
        pnlImage1 = new ImagePanel1("/Images/Disney_vs_Nick.jpg");
        jPanel2 = new ImagePanel1("/Images/Nick.jpg");
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cmpDeadline = new javax.swing.JTextField();
        cmpGanancias = new javax.swing.JTextField();
        cmpCostos = new javax.swing.JTextField();
        cmpUtilidad = new javax.swing.JTextField();
        cmpPM = new javax.swing.JTextField();
        cmpFaltas = new javax.swing.JTextField();
        cmpSalarioDesc = new javax.swing.JTextField();
        cmpDirector = new javax.swing.JTextField();
        cmpGuionistas = new javax.swing.JTextField();
        cmpDiseñadores = new javax.swing.JTextField();
        cmpAnimadores = new javax.swing.JTextField();
        cmpActores = new javax.swing.JTextField();
        cmpPlotTwists = new javax.swing.JTextField();
        cmpEnsambladores = new javax.swing.JTextField();
        cmpGuiones = new javax.swing.JTextField();
        cmpEscenarios = new javax.swing.JTextField();
        cmpAnimaciones = new javax.swing.JTextField();
        cmpDoblajes = new javax.swing.JTextField();
        cmpPlotDrive = new javax.swing.JTextField();
        cmpCapEst = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cmpDia = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        gbEnUso = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        CapPlot = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel3 = new ImagePanel1("/Images/Disney.jpg");
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        cmpDeadline1 = new javax.swing.JTextField();
        cmpGanancias1 = new javax.swing.JTextField();
        cmpCostos1 = new javax.swing.JTextField();
        cmpUtilidad1 = new javax.swing.JTextField();
        cmpPM1 = new javax.swing.JTextField();
        cmpFaltas1 = new javax.swing.JTextField();
        cmpSalarioDesc1 = new javax.swing.JTextField();
        cmpDirector1 = new javax.swing.JTextField();
        cmpGuionistas1 = new javax.swing.JTextField();
        cmpDiseñadores1 = new javax.swing.JTextField();
        cmpAnimadores1 = new javax.swing.JTextField();
        cmpActores1 = new javax.swing.JTextField();
        cmpPlotTwists1 = new javax.swing.JTextField();
        cmpEnsambladores1 = new javax.swing.JTextField();
        cmpGuiones1 = new javax.swing.JTextField();
        cmpEscenarios1 = new javax.swing.JTextField();
        cmpAnimaciones1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        cmpDoblajes1 = new javax.swing.JTextField();
        cmpPlotDrive1 = new javax.swing.JTextField();
        cmpCapEst1 = new javax.swing.JTextField();
        cmpCapPlot1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cmpDia1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        gbEnUso1 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Configuración de las Simulaciones");

        jLabel2.setText("Duración del día:");

        jLabel3.setText("Número de Guionistas:");

        saveConfigBtn.setText("Guardar Configuración");
        saveConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveConfigBtnActionPerformed(evt);
            }
        });

        startSimBtn.setText("Iniciar Simulación");
        startSimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimBtnActionPerformed(evt);
            }
        });

        spnDuracion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spnAnimadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnEntrega.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("Número de Diseñadores de Escenarios:");

        jLabel5.setText("Número de Animadores de Personajes:");

        spnDiseñadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnActores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel6.setText("Número de Actores de Dobalje:");

        jLabel7.setText("Número de Guionistas de PlotTwist:");

        jLabel8.setText("Número de Ensambladores:");

        jLabel9.setText("Días disponibles para la entrega:");

        spnPlotTwists.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnGuionistas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnEnsambladores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveConfigBtn)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startSimBtn)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(spnEnsambladores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnPlotTwists, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnActores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnAnimadores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnDiseñadores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnGuionistas, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnDuracion, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(0, 135, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnGuionistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDiseñadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAnimadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnPlotTwists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnEnsambladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveConfigBtn)
                    .addComponent(startSimBtn))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout pnlImage1Layout = new javax.swing.GroupLayout(pnlImage1);
        pnlImage1.setLayout(pnlImage1Layout);
        pnlImage1Layout.setHorizontalGroup(
            pnlImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        pnlImage1Layout.setVerticalGroup(
            pnlImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        disneyTabbedPane.addTab("Configuración", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Ganancias en bruto: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 236, -1, -1));

        jLabel11.setText("Costos operativos:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 278, -1, -1));

        jLabel12.setText("Utilidad total:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 320, -1, -1));

        jLabel13.setText("Deadline:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 194, -1, -1));

        jLabel14.setText("Project Manager:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 362, -1, -1));

        jLabel15.setText("Director:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 488, -1, -1));

        jLabel16.setText("Cantidad de faltas:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 404, -1, -1));

        jLabel17.setText("Salario descontado:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 446, -1, -1));

        jLabel18.setText("Número de guionistas:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 150, -1, -1));

        jLabel19.setText("Número de diseñadores:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 192, -1, -1));

        jLabel20.setText("Número de animadores:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 234, -1, -1));

        jLabel21.setText("Número de Actores:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 278, -1, -1));

        jLabel22.setText("Número de guionistas de PlotTwists:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 320, -1, -1));

        jLabel23.setText("Número de ensambladores:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 362, -1, -1));

        jLabel24.setText("Guiones en Drive:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 416, -1, -1));

        jLabel25.setText("Animaciones en Drive:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 500, -1, -1));

        jLabel26.setText("Doblajes en Drive:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 542, -1, -1));

        jLabel27.setText("Escenarios en Drive:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 458, -1, -1));

        jLabel28.setText("PlotTwists en Drive:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        jLabel29.setText("Capítulos listos tipo estandar:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel31.setText("Simulación Nickelodeon:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, -1, -1));

        jLabel32.setText("/ 25");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        jLabel33.setText("/ 20");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel34.setText("/ 55");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        jLabel35.setText("/ 35");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, -1));

        jLabel36.setText("/ 10");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        cmpDeadline.setEditable(false);
        cmpDeadline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 189, 129, -1));

        cmpGanancias.setEditable(false);
        cmpGanancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpGanancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 231, 130, -1));

        cmpCostos.setEditable(false);
        cmpCostos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 273, 130, -1));

        cmpUtilidad.setEditable(false);
        cmpUtilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 315, 130, -1));

        cmpPM.setEditable(false);
        jPanel2.add(cmpPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 357, 129, -1));

        cmpFaltas.setEditable(false);
        jPanel2.add(cmpFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 399, 129, -1));

        cmpSalarioDesc.setEditable(false);
        jPanel2.add(cmpSalarioDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 441, 130, -1));

        cmpDirector.setEditable(false);
        jPanel2.add(cmpDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 483, 129, -1));

        cmpGuionistas.setEditable(false);
        cmpGuionistas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpGuionistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 145, 125, -1));

        cmpDiseñadores.setEditable(false);
        cmpDiseñadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpDiseñadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 187, 125, -1));

        cmpAnimadores.setEditable(false);
        cmpAnimadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpAnimadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 229, 125, -1));

        cmpActores.setEditable(false);
        cmpActores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 273, 125, -1));

        cmpPlotTwists.setEditable(false);
        cmpPlotTwists.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpPlotTwists, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 125, -1));

        cmpEnsambladores.setEditable(false);
        cmpEnsambladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cmpEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 125, -1));

        cmpGuiones.setEditable(false);
        cmpGuiones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmpGuiones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpGuionesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpGuionesKeyReleased(evt);
            }
        });
        jPanel2.add(cmpGuiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 411, 130, -1));

        cmpEscenarios.setEditable(false);
        cmpEscenarios.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(cmpEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 453, 130, -1));

        cmpAnimaciones.setEditable(false);
        cmpAnimaciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmpAnimaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpAnimacionesActionPerformed(evt);
            }
        });
        jPanel2.add(cmpAnimaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 495, 130, -1));

        cmpDoblajes.setEditable(false);
        cmpDoblajes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(cmpDoblajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 537, 130, -1));

        cmpPlotDrive.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmpPlotDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpPlotDriveActionPerformed(evt);
            }
        });
        jPanel2.add(cmpPlotDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 130, -1));

        cmpCapEst.setEditable(false);
        cmpCapEst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCapEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCapEstActionPerformed(evt);
            }
        });
        jPanel2.add(cmpCapEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 98, -1));

        jLabel37.setText("Duración del día:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 150, -1, -1));

        cmpDia.setEditable(false);
        cmpDia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(cmpDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 145, 104, -1));

        jLabel38.setText("ms");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 150, -1, -1));

        jLabel39.setText("Uso del Drive: ");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 568, -1, -1));

        gbEnUso.setText("45");
        jPanel2.add(gbEnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 568, -1, -1));

        jLabel41.setText("/");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 568, -1, -1));

        jLabel42.setText("135Gb");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 568, -1, -1));

        jLabel40.setText("Capitulos con PlotTwist: ");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        CapPlot.setEditable(false);
        CapPlot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CapPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapPlotActionPerformed(evt);
            }
        });
        jPanel2.add(CapPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 98, -1));

        jLabel30.setText("K");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 10, -1));

        jLabel76.setText("K");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 10, -1));

        jLabel77.setText("K");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 10, -1));

        disneyTabbedPane.addTab("Nickelodeon", jPanel2);

        jLabel43.setText("PlotTwists en Drive:");

        jLabel44.setText("Capítulos listos tipo estandar:");

        jLabel45.setText("Capìtulos listos tipo PlotTwists:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel46.setText("Simulación Disney:");

        jLabel47.setText("/ 25");

        jLabel48.setText("/ 20");

        jLabel49.setText("/ 55");

        jLabel50.setText("/ 35");

        jLabel51.setText("/ 10");

        cmpDeadline1.setEditable(false);
        cmpDeadline1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpGanancias1.setEditable(false);
        cmpGanancias1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpCostos1.setEditable(false);
        cmpCostos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpUtilidad1.setEditable(false);
        cmpUtilidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpPM1.setEditable(false);

        cmpFaltas1.setEditable(false);

        cmpSalarioDesc1.setEditable(false);

        cmpDirector1.setEditable(false);

        cmpGuionistas1.setEditable(false);
        cmpGuionistas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpDiseñadores1.setEditable(false);
        cmpDiseñadores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpAnimadores1.setEditable(false);
        cmpAnimadores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpActores1.setEditable(false);
        cmpActores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpPlotTwists1.setEditable(false);
        cmpPlotTwists1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpEnsambladores1.setEditable(false);
        cmpEnsambladores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmpGuiones1.setEditable(false);
        cmpGuiones1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmpGuiones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpGuiones1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpGuiones1KeyReleased(evt);
            }
        });

        cmpEscenarios1.setEditable(false);
        cmpEscenarios1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cmpAnimaciones1.setEditable(false);
        cmpAnimaciones1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cmpAnimaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpAnimaciones1ActionPerformed(evt);
            }
        });

        jLabel52.setText("Ganancias en bruto: ");

        jLabel53.setText("Costos operativos:");

        jLabel54.setText("Utilidad total:");

        jLabel55.setText("Deadline:");

        cmpDoblajes1.setEditable(false);
        cmpDoblajes1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cmpPlotDrive1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cmpCapEst1.setEditable(false);
        cmpCapEst1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCapEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCapEst1ActionPerformed(evt);
            }
        });

        cmpCapPlot1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel56.setText("Project Manager:");

        jLabel57.setText("Duración del día:");

        jLabel58.setText("Director:");

        cmpDia1.setEditable(false);
        cmpDia1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel59.setText("Cantidad de faltas:");

        jLabel60.setText("ms");

        jLabel61.setText("Salario descontado:");

        jLabel62.setText("Número de guionistas:");

        jLabel63.setText("Número de diseñadores:");

        jLabel64.setText("Número de animadores:");

        jLabel65.setText("Número de Actores:");

        jLabel66.setText("Número de guionistas de plottwists:");

        jLabel67.setText("Número de ensambladores:");

        jLabel68.setText("Uso del Drive: ");

        gbEnUso1.setText("45");

        jLabel69.setText("/");

        jLabel70.setText("135Gb");

        jLabel71.setText("Guiones en Drive:");

        jLabel72.setText("Capitulos con PlotTwist: ");

        jLabel73.setText("Animaciones en Drive:");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel74.setText("Doblajes en Drive:");

        jLabel75.setText("Escenarios em Drive:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(25, 25, 25)
                                .addComponent(cmpCapPlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel52)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel53)
                                        .addComponent(jLabel54)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel59)
                                        .addComponent(jLabel61)
                                        .addComponent(jLabel58)
                                        .addComponent(jLabel57))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmpDeadline1)
                                        .addComponent(cmpGanancias1)
                                        .addComponent(cmpCostos1)
                                        .addComponent(cmpUtilidad1)
                                        .addComponent(cmpPM1)
                                        .addComponent(cmpFaltas1)
                                        .addComponent(cmpSalarioDesc1)
                                        .addComponent(cmpDirector1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(cmpDia1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel60))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel72))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2)
                                        .addComponent(cmpCapEst1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmpPlotTwists1)
                                    .addComponent(cmpEnsambladores1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel43))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmpPlotDrive1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(cmpDoblajes1)
                                    .addComponent(cmpAnimaciones1)
                                    .addComponent(cmpGuiones1)
                                    .addComponent(cmpEscenarios1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(134, 134, 134)
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gbEnUso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpDiseñadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpGuionistas1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpAnimadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpActores1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 409, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(cmpGuionistas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(cmpDiseñadores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(cmpAnimadores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(cmpActores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(cmpPlotTwists1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(cmpEnsambladores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(cmpGuiones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(cmpEscenarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(cmpDeadline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmpGanancias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmpCostos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(cmpUtilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpPM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpFaltas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(cmpSalarioDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(cmpDirector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpAnimaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel49)
                    .addComponent(cmpCapEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpDoblajes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel74)
                            .addComponent(jLabel68)
                            .addComponent(gbEnUso1)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel72)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpPlotDrive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel51)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(cmpCapPlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        disneyTabbedPane.addTab("Disney Channel", jPanel3);

        getContentPane().add(disneyTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1470, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startSimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimBtnActionPerformed
        // TODO add your handling code here:
        
        int[] valores = data.leerTXT();
        int duration = valores[0];
        int screenWriters = valores[1];
        int designers = valores[2];
        int animators = valores[3];
        int actors = valores[4];
        int plotTwists = valores[5];
        int assemblers = valores[6];
        int delivery = valores[7];  
        
        company = new Empresa("Nickelodeon ",duration, screenWriters, designers, animators, actors, plotTwists, assemblers, delivery, this);
        //company2 = new Empresa("Disney", duration, screenWriters, designers, animators, actors, plotTwists, assemblers, delivery, this);
        
        
        company.createThreads();
        //company2.createThreads();
        
        cmpDia.setText(String.valueOf(duration));
        cmpGuionistas.setText(String.valueOf(screenWriters));
        cmpDiseñadores.setText(String.valueOf(designers));
        cmpAnimadores.setText(String.valueOf(animators));
        cmpActores.setText(String.valueOf(actors));
        cmpPlotTwists.setText(String.valueOf(plotTwists));
        cmpEnsambladores.setText(String.valueOf(assemblers));
        cmpDeadline.setText(String.valueOf(company.drive.delivery));
        
        cmpDia1.setText(String.valueOf(duration));
        cmpGuionistas1.setText(String.valueOf(screenWriters));
        cmpDiseñadores1.setText(String.valueOf(designers));
        cmpAnimadores1.setText(String.valueOf(animators));
        cmpActores1.setText(String.valueOf(actors));
        cmpPlotTwists1.setText(String.valueOf(plotTwists));
        cmpEnsambladores1.setText(String.valueOf(assemblers));
        cmpDeadline1.setText(String.valueOf(company.drive.delivery));

    }//GEN-LAST:event_startSimBtnActionPerformed

    private void saveConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConfigBtnActionPerformed
        // TODO add your handling code here:
        
        String duration = spnDuracion.getValue().toString();
        String screenwriters = spnGuionistas.getValue().toString();
        String designers = spnDiseñadores.getValue().toString();
        String animators = spnAnimadores.getValue().toString();
        String actors = spnActores.getValue().toString();
        String plotTwists = spnPlotTwists.getValue().toString();
        String assemblers = spnEnsambladores.getValue().toString();
        String delivery = spnEntrega.getValue().toString();
        
        int totalWorkers = Integer.parseInt(screenwriters) + Integer.parseInt(designers) + Integer.parseInt(animators) + Integer.parseInt(actors) + Integer.parseInt(plotTwists) + Integer.parseInt(assemblers);
        JOptionPane.showMessageDialog(null, totalWorkers);
        
        if( totalWorkers <= 15){
            data.escribirTXT(duration, screenwriters, designers, animators, actors, plotTwists, assemblers, delivery);  
        }else{
            JOptionPane.showMessageDialog(null, "La suma total de los trabajadores supera la cantidad disponible");
        }
    }//GEN-LAST:event_saveConfigBtnActionPerformed

    private void cmpAnimacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpAnimacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpAnimacionesActionPerformed

    private void cmpGuionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuionesKeyReleased

    private void cmpGuionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuionesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuionesKeyPressed

    private void cmpCapEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCapEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCapEstActionPerformed

    private void CapPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapPlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapPlotActionPerformed

    private void cmpGuiones1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuiones1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuiones1KeyPressed

    private void cmpGuiones1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuiones1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuiones1KeyReleased

    private void cmpAnimaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpAnimaciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpAnimaciones1ActionPerformed

    private void cmpCapEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCapEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCapEst1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cmpPlotDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpPlotDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpPlotDriveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CapPlot;
    private javax.swing.JTextField cmpActores;
    private javax.swing.JTextField cmpActores1;
    private javax.swing.JTextField cmpAnimaciones;
    private javax.swing.JTextField cmpAnimaciones1;
    private javax.swing.JTextField cmpAnimadores;
    private javax.swing.JTextField cmpAnimadores1;
    private javax.swing.JTextField cmpCapEst;
    private javax.swing.JTextField cmpCapEst1;
    private javax.swing.JTextField cmpCapPlot1;
    private javax.swing.JTextField cmpCostos;
    private javax.swing.JTextField cmpCostos1;
    private javax.swing.JTextField cmpDeadline;
    private javax.swing.JTextField cmpDeadline1;
    private javax.swing.JTextField cmpDia;
    private javax.swing.JTextField cmpDia1;
    private javax.swing.JTextField cmpDirector;
    private javax.swing.JTextField cmpDirector1;
    private javax.swing.JTextField cmpDiseñadores;
    private javax.swing.JTextField cmpDiseñadores1;
    private javax.swing.JTextField cmpDoblajes;
    private javax.swing.JTextField cmpDoblajes1;
    private javax.swing.JTextField cmpEnsambladores;
    private javax.swing.JTextField cmpEnsambladores1;
    private javax.swing.JTextField cmpEscenarios;
    private javax.swing.JTextField cmpEscenarios1;
    private javax.swing.JTextField cmpFaltas;
    private javax.swing.JTextField cmpFaltas1;
    private javax.swing.JTextField cmpGanancias;
    private javax.swing.JTextField cmpGanancias1;
    private javax.swing.JTextField cmpGuiones;
    private javax.swing.JTextField cmpGuiones1;
    private javax.swing.JTextField cmpGuionistas;
    private javax.swing.JTextField cmpGuionistas1;
    private javax.swing.JTextField cmpPM;
    private javax.swing.JTextField cmpPM1;
    private javax.swing.JTextField cmpPlotDrive;
    private javax.swing.JTextField cmpPlotDrive1;
    private javax.swing.JTextField cmpPlotTwists;
    private javax.swing.JTextField cmpPlotTwists1;
    private javax.swing.JTextField cmpSalarioDesc;
    private javax.swing.JTextField cmpSalarioDesc1;
    private javax.swing.JTextField cmpUtilidad;
    private javax.swing.JTextField cmpUtilidad1;
    private javax.swing.JTabbedPane disneyTabbedPane;
    private javax.swing.JLabel gbEnUso;
    private javax.swing.JLabel gbEnUso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlImage1;
    public javax.swing.JButton saveConfigBtn;
    private javax.swing.JSpinner spnActores;
    private javax.swing.JSpinner spnAnimadores;
    private javax.swing.JSpinner spnDiseñadores;
    private javax.swing.JSpinner spnDuracion;
    private javax.swing.JSpinner spnEnsambladores;
    private javax.swing.JSpinner spnEntrega;
    private javax.swing.JSpinner spnGuionistas;
    private javax.swing.JSpinner spnPlotTwists;
    private javax.swing.JButton startSimBtn;
    // End of variables declaration//GEN-END:variables

    
    class ImagePanel1 extends JPanel{
        private Image image;
        private final String path;
        
        public ImagePanel1(String path){
            this.path = path;
        }
        
        @Override
        public void paint(Graphics g){
            image = new ImageIcon(getClass().getResource(path)).getImage();
            
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
