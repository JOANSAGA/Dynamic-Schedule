/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScheduleStructure;

/**
 *
 * @author angelponce
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        container = new javax.swing.JPanel();
        hoursPanel = new javax.swing.JPanel();
        daysPanel = new javax.swing.JPanel();
        mondayLabel = new javax.swing.JLabel();
        tuesdayLabel = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        tursdayLabel = new javax.swing.JLabel();
        fridayLabel = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        crossPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        configMenu = new javax.swing.JMenu();
        addRowOption = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        reestartOption = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        themeOption = new javax.swing.JMenuItem();
        separator3 = new javax.swing.JPopupMenu.Separator();
        exitOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 540));

        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(1200, 440));
        container.setLayout(new java.awt.GridBagLayout());

        hoursPanel.setBackground(new java.awt.Color(204, 255, 204));
        hoursPanel.setLayout(new java.awt.GridLayout(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 400;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        container.add(hoursPanel, gridBagConstraints);

        daysPanel.setBackground(new java.awt.Color(255, 204, 204));
        daysPanel.setLayout(new java.awt.GridLayout(1, 5));

        mondayLabel.setForeground(new java.awt.Color(0, 0, 0));
        mondayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mondayLabel.setText("Lunes");
        daysPanel.add(mondayLabel);

        tuesdayLabel.setForeground(new java.awt.Color(0, 0, 0));
        tuesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuesdayLabel.setText("Martes");
        daysPanel.add(tuesdayLabel);

        wednesdayLabel.setForeground(new java.awt.Color(0, 0, 0));
        wednesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wednesdayLabel.setText("Miércoles");
        daysPanel.add(wednesdayLabel);

        tursdayLabel.setForeground(new java.awt.Color(0, 0, 0));
        tursdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tursdayLabel.setText("Jueves");
        daysPanel.add(tursdayLabel);

        fridayLabel.setForeground(new java.awt.Color(0, 0, 0));
        fridayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fridayLabel.setText("Viernes");
        daysPanel.add(fridayLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1000;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.weightx = 1.0;
        container.add(daysPanel, gridBagConstraints);

        centerPanel.setBackground(new java.awt.Color(153, 153, 255));
        centerPanel.setLayout(new java.awt.GridLayout(1, 5));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1000;
        gridBagConstraints.ipady = 400;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        container.add(centerPanel, gridBagConstraints);

        crossPanel.setBackground(new java.awt.Color(204, 255, 255));
        crossPanel.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORA");
        crossPanel.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.weightx = 1.0;
        container.add(crossPanel, gridBagConstraints);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        configMenu.setText("Configuración");

        addRowOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        addRowOption.setText("Agregar fila");
        configMenu.add(addRowOption);
        configMenu.add(separator1);

        reestartOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reestart.png"))); // NOI18N
        reestartOption.setText("Reiniciar horario");
        configMenu.add(reestartOption);
        configMenu.add(separator2);

        themeOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/theme.png"))); // NOI18N
        themeOption.setText("Tema");
        configMenu.add(themeOption);
        configMenu.add(separator3);

        exitOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        exitOption.setText("Salir");
        configMenu.add(exitOption);

        menuBar.add(configMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addRowOption;
    public javax.swing.JPanel centerPanel;
    public javax.swing.JMenu configMenu;
    public javax.swing.JPanel container;
    public javax.swing.JPanel crossPanel;
    public javax.swing.JPanel daysPanel;
    public javax.swing.JMenuItem exitOption;
    private javax.swing.JLabel fridayLabel;
    public javax.swing.JPanel hoursPanel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel mondayLabel;
    public javax.swing.JMenuItem reestartOption;
    private javax.swing.JPopupMenu.Separator separator1;
    public javax.swing.JPopupMenu.Separator separator2;
    public javax.swing.JPopupMenu.Separator separator3;
    public javax.swing.JMenuItem themeOption;
    private javax.swing.JLabel tuesdayLabel;
    private javax.swing.JLabel tursdayLabel;
    private javax.swing.JLabel wednesdayLabel;
    // End of variables declaration//GEN-END:variables
}