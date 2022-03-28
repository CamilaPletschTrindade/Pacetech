/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camil
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        numero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 1;
                textoOperacao.setText(textoOperacao.getText() + "1");
            }
        });
        numero2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                textoOperacao.setText(textoOperacao.getText() + "2");
            }
        });
        
        numero3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                textoOperacao.setText(textoOperacao.getText() + "3");
            }
        });
        
        numero4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 4;
                textoOperacao.setText(textoOperacao.getText() + "4");
            }
        });
        
        numero5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 5;
                textoOperacao.setText(textoOperacao.getText() + "5");
            }
        });
        
        numero6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 6;
                textoOperacao.setText(textoOperacao.getText() + "6");
            }
        });
        
        numero7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 7;
                textoOperacao.setText(textoOperacao.getText() + "7");
            }
        });
        
        numero8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 8;
                textoOperacao.setText(textoOperacao.getText() + "8");
            }
        });
        
        numero9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 9;
                textoOperacao.setText(textoOperacao.getText() + "9");
            }
        });
        
        numero0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 0;
                textoOperacao.setText(textoOperacao.getText() + "0");
            }
        });

        adicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                textoOperacao.setText(memoria + " + ");
            }
        });
        
        subtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                textoOperacao.setText(memoria + " - ");
            }
        });
        
        multiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = 'X';
                memoria += leitura;
                leitura = 0;
                textoOperacao.setText(memoria + " X ");
            }
        });
        
        divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                textoOperacao.setText(memoria + " / ");
            }
        });
        
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                textoOperacao.setText(null);
                memoria = 0;
            }
        });
        
        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '.': {
                        memoria = memoria + '.';
                        break;
                    }
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                    
                    case '-': {
                        memoria -= leitura;
                        break;
                    }
                    
                    case 'X': {
                        memoria *= leitura;
                        break;
                    }
                    
                    case '/': {
                        memoria /= leitura;
                        break;
                    }
                    
                }
                leitura = 0;
                textoOperacao.setText("" + memoria);
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        adicao = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        textoOperacao = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numero8.setText("8");

        numero9.setText("9");

        divisao.setText("/");

        numero7.setText("7");

        numero5.setText("5");

        numero6.setText("6");

        numero4.setText("4");

        multiplicacao.setText("X");

        numero2.setText("2");

        numero1.setText("1");

        subtracao.setText("-");

        numero3.setText("3");

        adicao.setText("+");

        numero0.setText("0");

        ponto.setText(".");

        igual.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numero5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numero2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(numero6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                .addGap(20, 20, 20)
                                                .addComponent(multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(numero9, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                .addGap(20, 20, 20)
                                                .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(numero3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(numero0, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(ponto, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(adicao, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoOperacaoActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoOperacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoOperacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    private int leitura;
    private int memoria;
    private char operacao;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton divisao;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton ponto;
    private javax.swing.JButton subtracao;
    private javax.swing.JTextField textoOperacao;
    // End of variables declaration//GEN-END:variables
}
