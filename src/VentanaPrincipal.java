
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAbrir = new javax.swing.JDialog();
        jFileChooserAbrir = new javax.swing.JFileChooser();
        jDialogArchivoMostrado = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPanelAbrir = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        GuardarComo = new javax.swing.JMenuItem();

        jDialogAbrir.setSize(new java.awt.Dimension(723, 420));

        javax.swing.GroupLayout jDialogAbrirLayout = new javax.swing.GroupLayout(jDialogAbrir.getContentPane());
        jDialogAbrir.getContentPane().setLayout(jDialogAbrirLayout);
        jDialogAbrirLayout.setHorizontalGroup(
            jDialogAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        jDialogAbrirLayout.setVerticalGroup(
            jDialogAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        jDialogArchivoMostrado.setSize(new java.awt.Dimension(723, 420));

        jScrollPane1.setViewportView(textPanelAbrir);

        javax.swing.GroupLayout jDialogArchivoMostradoLayout = new javax.swing.GroupLayout(jDialogArchivoMostrado.getContentPane());
        jDialogArchivoMostrado.getContentPane().setLayout(jDialogArchivoMostradoLayout);
        jDialogArchivoMostradoLayout.setHorizontalGroup(
            jDialogArchivoMostradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogArchivoMostradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogArchivoMostradoLayout.setVerticalGroup(
            jDialogArchivoMostradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogArchivoMostradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        Abrir.setText("Abrir");
        Abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AbrirMousePressed(evt);
            }
        });
        jMenu1.add(Abrir);

        Guardar.setText("Guardar");
        jMenu1.add(Guardar);

        GuardarComo.setText("Guardar como..");
        jMenu1.add(GuardarComo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirMousePressed
        jDialogAbrir.setVisible(true); //muestra el dialog con el jFileChooser

        //con esto solo se podran mostrar archivos txt y xml
        jFileChooserAbrir.setFileFilter(new FileNameExtensionFilter("arhivos de texto txt", "txt"));
        jFileChooserAbrir.setFileFilter(new FileNameExtensionFilter("arhivos de imagen xml", "xml"));

        JFileChooser selectorArchivos = new JFileChooser();
        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showOpenDialog(this);

        File archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado
        
        StringBuilder lectura = new StringBuilder(); //creo un StringBuilder para guardar las lineas que se leen en el while
        
        String nombre = archivo.getName(); //obtengo el nombre del archivo completo para comprobar su extension
        
        String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length()); //separo la extension del nombre para usarla en el if
        
        if (extension.equalsIgnoreCase("txt") || extension.equalsIgnoreCase("xml")) { //solo si la extension es xml o txt entrara en el try
            try {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea = br.readLine();
                while (linea != null) {
                    lectura.append(linea).append("\n"); //le voy añadiendo las lineas con salto de linea
                    linea = br.readLine();
                }
                String resul = lectura.toString(); //cambio el StringBuilder a String para pasarselo al textPanel
                textPanelAbrir.setText(resul);
                br.close();
            } catch (FileNotFoundException e) {
                textPanelAbrir.setText("Fichero no encontrado");
            } catch (Exception e) {
                textPanelAbrir.setText("Error en la lectura del fichero");
            }

            jDialogAbrir.setVisible(false);
            jDialogArchivoMostrado.setVisible(true);
            
        } else {
            jDialogAbrir.setVisible(false);
            jDialogArchivoMostrado.setVisible(true);
            textPanelAbrir.setText("Extensión del archivo no válida");
        }

    }//GEN-LAST:event_AbrirMousePressed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem GuardarComo;
    private javax.swing.JDialog jDialogAbrir;
    private javax.swing.JDialog jDialogArchivoMostrado;
    private javax.swing.JFileChooser jFileChooserAbrir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane textPanelAbrir;
    // End of variables declaration//GEN-END:variables
}
