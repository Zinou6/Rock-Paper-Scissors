// Ben Said   Zine El Abidine
package pierre_feuille_ciseaux;

import java.awt.Color;

/**
 *
 * @author Zinou
 */
public class PFC extends javax.swing.JFrame {

   private int Computer;
   private int ScoreComputer = 0;
   private int ScoreUser = 0;
   
   
    public PFC() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Rock = new javax.swing.JLabel();
        Scissors = new javax.swing.JLabel();
        Paper = new javax.swing.JLabel();
        ComputerChoice = new javax.swing.JLabel();
        YourChoice = new javax.swing.JLabel();
        ComScore = new javax.swing.JLabel();
        UserScore = new javax.swing.JLabel();
        ScoreUserAffich = new javax.swing.JLabel();
        ScoreComAffich = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pierre_Feuille_Ciseaux");
        setResizable(false);

        Panel.setLayout(null);

        Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Rock0.png"))); // NOI18N
        Rock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RockMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RockMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RockMouseReleased(evt);
            }
        });
        Panel.add(Rock);
        Rock.setBounds(320, 380, 113, 120);

        Scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/scissors0.png"))); // NOI18N
        Scissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScissorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ScissorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScissorsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScissorsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ScissorsMouseReleased(evt);
            }
        });
        Panel.add(Scissors);
        Scissors.setBounds(490, 380, 114, 120);

        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Paper0.png"))); // NOI18N
        Paper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaperMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PaperMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PaperMouseReleased(evt);
            }
        });
        Panel.add(Paper);
        Paper.setBounds(150, 380, 114, 120);
        Panel.add(ComputerChoice);
        ComputerChoice.setBounds(190, 120, 130, 120);
        Panel.add(YourChoice);
        YourChoice.setBounds(430, 120, 130, 120);

        ComScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ScoreComputer.png"))); // NOI18N
        Panel.add(ComScore);
        ComScore.setBounds(20, 110, 50, 50);

        UserScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ScoreUser.png"))); // NOI18N
        Panel.add(UserScore);
        UserScore.setBounds(660, 110, 50, 50);

        ScoreUserAffich.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScoreUserAffich.setForeground(new java.awt.Color(0, 153, 0));
        ScoreUserAffich.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ScoreUserAffich.setText("0");
        Panel.add(ScoreUserAffich);
        ScoreUserAffich.setBounds(614, 110, 40, 50);

        ScoreComAffich.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScoreComAffich.setForeground(new java.awt.Color(255, 0, 0));
        ScoreComAffich.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ScoreComAffich.setText("0");
        Panel.add(ScoreComAffich);
        ScoreComAffich.setBounds(80, 110, 40, 50);

        Result.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.add(Result);
        Result.setBounds(200, 40, 350, 50);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/CFP.png"))); // NOI18N
        Panel.add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 730, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsMouseClicked
       
        YourChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/YourScissors.png")));
        
        Computer =(int) ((int) 1 + (Math.random() * 3));
        
        switch (Computer){
            
            case 1:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComScissors.png")));
                Result.setText("Draw");
                Result.setForeground(Color.DARK_GRAY);
               break;
            case 2:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Compaper.png")));
                ScoreUser++;
                ScoreUserAffich.setText(""+ScoreUser);
                Result.setText("You Win");
                Result.setForeground(Color.GREEN);
                break;
            case 3:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComRock.png")));
                ScoreComputer++;
                ScoreComAffich.setText(""+ScoreComputer);
                Result.setText("You Lose");
                Result.setForeground(Color.red);
                break;
        }
    }//GEN-LAST:event_ScissorsMouseClicked

    private void ScissorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsMouseEntered
       
                Scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/scissorsTouch.png")));
    }//GEN-LAST:event_ScissorsMouseEntered

    private void ScissorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsMouseExited

                Scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/scissors0.png")));
    }//GEN-LAST:event_ScissorsMouseExited

    private void ScissorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsMousePressed
       
                Scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/scissorsClick.png")));
    }//GEN-LAST:event_ScissorsMousePressed

    private void ScissorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorsMouseReleased
       
                Scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/scissors0.png")));
    }//GEN-LAST:event_ScissorsMouseReleased

    private void RockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMouseClicked
        
                YourChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/YourRock.png")));
                
                Computer =(int) ((int) 1 + (Math.random() * 3));
                
                switch (Computer){
            
            case 1:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComScissors.png")));
                ScoreUser++;
                ScoreUserAffich.setText(""+ScoreUser);
                Result.setText("You Win");
                Result.setForeground(Color.GREEN);
                break;
            case 2:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Compaper.png")));
                ScoreComputer++;
                ScoreComAffich.setText(""+ScoreComputer);
                Result.setText("You Lose");
                Result.setForeground(Color.red);
                break;
            case 3:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComRock.png")));
                Result.setText("Draw");
                Result.setForeground(Color.DARK_GRAY);
                break;
                }
    }//GEN-LAST:event_RockMouseClicked

    private void RockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMouseEntered
            
                Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/RockTouch.png")));
    }//GEN-LAST:event_RockMouseEntered

    private void RockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMouseExited
        
                 Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Rock0.png")));
    }//GEN-LAST:event_RockMouseExited

    private void RockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMousePressed
        
                Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/RockClick.png")));
    }//GEN-LAST:event_RockMousePressed

    private void RockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMouseReleased
        
        Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Rock0.png")));
    }//GEN-LAST:event_RockMouseReleased

    private void PaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMouseClicked
        
        YourChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Yourpaper.png")));
        
        Computer =(int) ((int) 1 + (Math.random() * 3));
        
        switch (Computer){
            
            case 1:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComScissors.png")));
                ScoreComputer++;
                ScoreComAffich.setText(""+ScoreComputer);
                Result.setText("You Lose");
                Result.setForeground(Color.red);
                break;
            case 2:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Compaper.png")));
                Result.setText("Draw");
                Result.setForeground(Color.DARK_GRAY);
                break;
            case 3:
                ComputerChoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/ComRock.png")));
                ScoreUser++;
                ScoreUserAffich.setText(""+ScoreUser);
                Result.setText("You Win");
                Result.setForeground(Color.GREEN);
                break;
        }
    }//GEN-LAST:event_PaperMouseClicked

    private void PaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMouseEntered
        
        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/PaperTouch.png")));
    }//GEN-LAST:event_PaperMouseEntered

    private void PaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMouseExited
       
        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Paper0.png")));
    }//GEN-LAST:event_PaperMouseExited

    private void PaperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMousePressed
        
        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/PaperClick.png")));
    }//GEN-LAST:event_PaperMousePressed

    private void PaperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMouseReleased
       
        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierre_feuille_ciseaux/Paper0.png")));
    }//GEN-LAST:event_PaperMouseReleased

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
            java.util.logging.Logger.getLogger(PFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PFC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel ComScore;
    private javax.swing.JLabel ComputerChoice;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Paper;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel Rock;
    private javax.swing.JLabel Scissors;
    private javax.swing.JLabel ScoreComAffich;
    private javax.swing.JLabel ScoreUserAffich;
    private javax.swing.JLabel UserScore;
    private javax.swing.JLabel YourChoice;
    // End of variables declaration//GEN-END:variables
}
