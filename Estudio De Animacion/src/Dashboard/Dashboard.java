/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import Class.ManejoDeData;
import Company.Empresa;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author danieldangelo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    ManejoDeData data = new ManejoDeData();
    
    
    public Dashboard() {
//        ImagePanel1 panel = new ImagePanel1("/Images/Disney_vs_Nick.jpg");
        initComponents();
//        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
//        modeloSpinner.setMinimum(1);
//        spnDuracion.setModel(modeloSpinner);
    }

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
        jPanel3 = new ImagePanel1("/Images/Disney.jpg");

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
                .addGap(0, 181, Short.MAX_VALUE))
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

        jLabel10.setText("Ganancias en bruto: ");

        jLabel11.setText("Costos operativos:");

        jLabel12.setText("Utilidad total:");

        jLabel13.setText("Deadline:");

        jLabel14.setText("Project Manager:");

        jLabel15.setText("Director:");

        jLabel16.setText("Cantidad de faltas:");

        jLabel17.setText("Salario descontado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(422, 422, 422)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addContainerGap(694, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(46, 46, 46)
                .addComponent(jLabel15)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        disneyTabbedPane.addTab("Nickelodeon", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1450, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        disneyTabbedPane.addTab("Disney Channel", jPanel3);

        getContentPane().add(disneyTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 650));

        pack();
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
        
        Empresa company = new Empresa(duration, screenWriters, designers, animators, actors, plotTwists, assemblers, delivery);
        
        company.createThreads();
        
        
//        for(int n = 0; n < valores.length; n++){
//            JOptionPane.showMessageDialog(null, valores[n]);
//        }
    }//GEN-LAST:event_startSimBtnActionPerformed

    private void saveConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConfigBtnActionPerformed
        // TODO add your handling code here:
        
//        int duration = Integer.parseInt(spnDuracion.getValue().toString());
//        int screenwriters = Integer.parseInt(spnGuionistas.getValue().toString());
//        int designers = Integer.parseInt(spnDiseñadores.getValue().toString());
//        int animators = Integer.parseInt(spnAnimadores.getValue().toString());
//        int actors = Integer.parseInt(spnActores.getValue().toString());
//        int plotTwists = Integer.parseInt(spnPlotTwists.getValue().toString());
//        int assemblers = Integer.parseInt(spnEnsambladores.getValue().toString());
//        int delivery  =Integer.parseInt(spnEntrega.getValue().toString());
        
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
    private javax.swing.JTabbedPane disneyTabbedPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane4;
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

    
//    class ImagePanel1 extends JPanel{
//        private Image image;
//        private final String path;
//        private int x, y;
//        
//        public ImagePanel1(JPanel panel, String path){
//            this.path = path;
//            this.x = panel.getWidth();
//            this.y = panel.getHeight();
//            this.setSize(x, y);
//        }
//        
////        "/Images/Disney_vs_Nick.jpg"
//        
//        @Override
//        public void paint(Graphics g){
//            image = new ImageIcon(getClass().getResource(path)).getImage();
//            
//            g.drawImage(image, 0, 0, x, y, null);
//            
//            setOpaque(false);
//            
//            super.paint(g);
//        }
//    }
    
    class ImagePanel1 extends JPanel{
        private Image image;
        private final String path;
        
        public ImagePanel1(String path){
            this.path = path;
        }
        
//        "/Images/Disney_vs_Nick.jpg"
        
        @Override
        public void paint(Graphics g){
            image = new ImageIcon(getClass().getResource(path)).getImage();
            
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
