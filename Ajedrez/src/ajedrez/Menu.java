
package ajedrez;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugar = new javax.swing.JButton();
        Rank = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jugar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, 80, -1));

        Rank.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        Rank.setText("Ranking");
        Rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankActionPerformed(evt);
            }
        });
        getContentPane().add(Rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        Usuarios.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 165, -1, -1));

        Salir.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 220, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Administrar admin = new Administrar();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        Tablero tab = new Tablero();
        tab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JugarActionPerformed

    private void RankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankActionPerformed
        Ranking rank = new Ranking();
        rank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RankActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Rank;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Usuarios;
    // End of variables declaration//GEN-END:variables
}
