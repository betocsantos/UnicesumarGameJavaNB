/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesumargamejavanb;

import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.UIManager.get;


/**
 *
 * @author beto_
 */
public class TelaGame extends javax.swing.JFrame {

    private static void add(UnicesumarGameJavaNB unicesumargamejavanb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form TelaGame
     */
    public TelaGame() {
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

        botaoIniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JEditorPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoIniciar.setText("INICIAR JOGO");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        painelPrincipal.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                painelPrincipalHyperlinkUpdate(evt);
            }
        });
        painelPrincipal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                painelPrincipalInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(painelPrincipal);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(botaoIniciar)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(botaoIniciar)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
        // TODO add your handling code here:
        UnicesumarGameJavaNB unicesumargamejavanb = new UnicesumarGameJavaNB();
        /*TelaGame.add(unicesumargamejavanb);
        unicesumargamejavanb.setVisible(true);*/
        //painelPrincipal.getClass();
        //jDesktopPane1.getClass();
        
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void painelPrincipalHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_painelPrincipalHyperlinkUpdate
        // TODO add your handling code here:
        
    }//GEN-LAST:event_painelPrincipalHyperlinkUpdate

    private void painelPrincipalInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_painelPrincipalInputMethodTextChanged
        // TODO add your handling code here:
        /*UnicesumarGameJavaNB.metodoUnicesumarGameJavaNB();
        painelPrincipal.setVisible(true);*/
        UnicesumarGameJavaNB unicesumargamejavanb = new UnicesumarGameJavaNB();
        TelaGame.add(unicesumargamejavanb);
        unicesumargamejavanb.setVisible(true);
    }//GEN-LAST:event_painelPrincipalInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//Método da classe principal.        
        System.out.println("Classe Tela");
        /*Scanner sc = new Scanner (System.in);
        UnicesumarGameJavaNB unicesumargamejavanb = new UnicesumarGameJavaNB();
        UnicesumarGameJavaNB.metodoUnicesumarGameJavaNB();*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
