/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Gerador.Gerador;

/**
 * @author Wendrick
 */

public class GeradorView extends javax.swing.JFrame {
    
    Gerador grd = new Gerador();
    int lista[] = new int[26];
    
    public GeradorView() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        H = new javax.swing.JRadioButton();
        I = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        G = new javax.swing.JRadioButton();
        J = new javax.swing.JRadioButton();
        K = new javax.swing.JRadioButton();
        L = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        N = new javax.swing.JRadioButton();
        O = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        Q = new javax.swing.JRadioButton();
        R = new javax.swing.JRadioButton();
        S = new javax.swing.JRadioButton();
        T = new javax.swing.JRadioButton();
        U = new javax.swing.JRadioButton();
        V = new javax.swing.JRadioButton();
        W = new javax.swing.JRadioButton();
        X = new javax.swing.JRadioButton();
        Y = new javax.swing.JRadioButton();
        Z = new javax.swing.JRadioButton();
        Nome = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        SuperButton = new javax.swing.JRadioButton();

        jPanel3.setBackground(new java.awt.Color(62, 1, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Necessário que a opção \"Usar letras selecionadas\" seja  marcada.");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setText("OK");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(62, 1, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerador Aleatórios de Nomes");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        A.setBackground(new java.awt.Color(62, 1, 49));
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A / a");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setBackground(new java.awt.Color(62, 1, 49));
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("B / b");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        D.setBackground(new java.awt.Color(62, 1, 49));
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("D / d");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setBackground(new java.awt.Color(62, 1, 49));
        E.setForeground(new java.awt.Color(255, 255, 255));
        E.setText("E / e");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(62, 1, 49));
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C / c");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        H.setBackground(new java.awt.Color(62, 1, 49));
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setText("H / h");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setBackground(new java.awt.Color(62, 1, 49));
        I.setForeground(new java.awt.Color(255, 255, 255));
        I.setText("I / i");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        F.setBackground(new java.awt.Color(62, 1, 49));
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setText("F / f");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setBackground(new java.awt.Color(62, 1, 49));
        G.setForeground(new java.awt.Color(255, 255, 255));
        G.setText("G / g");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        J.setBackground(new java.awt.Color(62, 1, 49));
        J.setForeground(new java.awt.Color(255, 255, 255));
        J.setText("J / j");
        J.setToolTipText("");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setBackground(new java.awt.Color(62, 1, 49));
        K.setForeground(new java.awt.Color(255, 255, 255));
        K.setText("K / k");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        L.setBackground(new java.awt.Color(62, 1, 49));
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setText("L / l");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setBackground(new java.awt.Color(62, 1, 49));
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setText("M / m");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        N.setBackground(new java.awt.Color(62, 1, 49));
        N.setForeground(new java.awt.Color(255, 255, 255));
        N.setText("N / n");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setBackground(new java.awt.Color(62, 1, 49));
        O.setForeground(new java.awt.Color(255, 255, 255));
        O.setText("O / o");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setBackground(new java.awt.Color(62, 1, 49));
        P.setForeground(new java.awt.Color(255, 255, 255));
        P.setText("P / p");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setBackground(new java.awt.Color(62, 1, 49));
        Q.setForeground(new java.awt.Color(255, 255, 255));
        Q.setText("Q / q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setBackground(new java.awt.Color(62, 1, 49));
        R.setForeground(new java.awt.Color(255, 255, 255));
        R.setText("R / r");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setBackground(new java.awt.Color(62, 1, 49));
        S.setForeground(new java.awt.Color(255, 255, 255));
        S.setText("S / s");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setBackground(new java.awt.Color(62, 1, 49));
        T.setForeground(new java.awt.Color(255, 255, 255));
        T.setText("T / t");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setBackground(new java.awt.Color(62, 1, 49));
        U.setForeground(new java.awt.Color(255, 255, 255));
        U.setText("U / u");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setBackground(new java.awt.Color(62, 1, 49));
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setText("V / v");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setBackground(new java.awt.Color(62, 1, 49));
        W.setForeground(new java.awt.Color(255, 255, 255));
        W.setText("W / w");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setBackground(new java.awt.Color(62, 1, 49));
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setText("X / x");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setBackground(new java.awt.Color(62, 1, 49));
        Y.setForeground(new java.awt.Color(255, 255, 255));
        Y.setText("Y / y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setBackground(new java.awt.Color(62, 1, 49));
        Z.setForeground(new java.awt.Color(255, 255, 255));
        Z.setText("Z / z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        Nome.setBackground(new java.awt.Color(255, 255, 255));
        Nome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome.setText("Nome Aleatório");

        Button1.setText("Gerar Nome");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("Limpar");

        Button4.setText("Cancelar");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        SuperButton.setBackground(new java.awt.Color(62, 1, 49));
        SuperButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        SuperButton.setForeground(new java.awt.Color(255, 255, 255));
        SuperButton.setText("Usar as letras selecionadas:");
        SuperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(A)
                                        .addGap(18, 18, 18)
                                        .addComponent(B))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(U)
                                            .addGap(18, 18, 18)
                                            .addComponent(V))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(K)
                                            .addGap(18, 18, 18)
                                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(C)
                                                    .addComponent(M))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(D)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(E))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(N)
                                                        .addGap(16, 16, 16)
                                                        .addComponent(O))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(W)
                                                .addGap(18, 18, 18)
                                                .addComponent(X)
                                                .addGap(18, 18, 18)
                                                .addComponent(Y)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(P)
                                                        .addComponent(F))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(15, 15, 15)
                                                            .addComponent(Q)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(R))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addGap(16, 16, 16)
                                                            .addComponent(G)
                                                            .addGap(15, 15, 15)
                                                            .addComponent(H)))
                                                    .addGap(26, 26, 26)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(I)
                                                        .addComponent(S))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(T)
                                                        .addComponent(J))))
                                            .addComponent(Z)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(SuperButton))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(E)
                    .addComponent(D)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(F)
                    .addComponent(G)
                    .addComponent(H)
                    .addComponent(I)
                    .addComponent(J))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K)
                    .addComponent(L)
                    .addComponent(M)
                    .addComponent(N)
                    .addComponent(O)
                    .addComponent(P)
                    .addComponent(Q)
                    .addComponent(R)
                    .addComponent(S)
                    .addComponent(T))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(U)
                    .addComponent(V)
                    .addComponent(W)
                    .addComponent(X)
                    .addComponent(Y)
                    .addComponent(Z))
                .addGap(34, 34, 34)
                .addComponent(SuperButton)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        if(A.isSelected()){
            lista[0] = 1;
        }else{
            lista[0] = 0;
        }
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        if(B.isSelected()){
            lista[1] = 1;
        }else{
            lista[1] = 0;
        }
    }//GEN-LAST:event_BActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        if(D.isSelected()){
            lista[3] = 1;
        }else{
            lista[3] = 0;
        }
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        if(E.isSelected()){
            lista[4] = 1;
        }else{
            lista[4] = 0;
        }
    }//GEN-LAST:event_EActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        if(C.isSelected()){
            lista[2] = 1;
        }else{
            lista[2] = 0;
        }
    }//GEN-LAST:event_CActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        if(H.isSelected()){
            lista[7] = 1;
        }else{
            lista[7] = 0;
        }
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        if(I.isSelected()){
            lista[8] = 1;
        }else{
            lista[8] = 0;
        }
    }//GEN-LAST:event_IActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        if(O.isSelected()){
            lista[14] = 1;
        }else{
            lista[14] = 0;
        }
    }//GEN-LAST:event_OActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        if(R.isSelected()){
            lista[17] = 1;
        }else{
            lista[17] = 0;
        }
    }//GEN-LAST:event_RActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        if(K.isSelected()){
            lista[10] = 1;
        }else{
            lista[10] = 0;
        }
    }//GEN-LAST:event_KActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        if(M.isSelected()){
            lista[12] = 1;
        }else{
            lista[12] = 0;
        }
    }//GEN-LAST:event_MActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        String letrasUsar[] = new String[grd.pegarNumeros(lista)];
        if(SuperButton.isSelected()){
            letrasUsar = grd.pegarLetras(lista, letrasUsar);
            Nome.setText(String.valueOf(grd.gerarNome(letrasUsar)));
        }else{
            jFrame1.setVisible(true);    
        }
    }//GEN-LAST:event_Button1ActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        if(F.isSelected()){
            lista[5] = 1;
        }else{
            lista[5] = 0;
        }
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        if(G.isSelected()){
            lista[6] = 1;
        }else{
            lista[6] = 0;
        }
    }//GEN-LAST:event_GActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        if(J.isSelected()){
            lista[9] = 1;
        }else{
            lista[9] = 0;
        }
    }//GEN-LAST:event_JActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        if(L.isSelected()){
            lista[11] = 1;
        }else{
            lista[11] = 0;
        }
    }//GEN-LAST:event_LActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        if(N.isSelected()){
            lista[13] = 1;
        }else{
            lista[13] = 0;
        }
    }//GEN-LAST:event_NActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        if(P.isSelected()){
            lista[15] = 1;
        }else{
            lista[15] = 0;
        }
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        if(Q.isSelected()){
            lista[16] = 1;
        }else{
            lista[16] = 0;
        }
    }//GEN-LAST:event_QActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        if(S.isSelected()){
            lista[18] = 1;
        }else{
            lista[18] = 0;
        }
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        if(T.isSelected()){
            lista[19] = 1;
        }else{
            lista[19] = 0;
        }
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        if(U.isSelected()){
            lista[20] = 1;
        }else{
            lista[20] = 0;
        }
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        if(V.isSelected()){
            lista[21] = 1;
        }else{
            lista[21] = 0;
        }
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        if(W.isSelected()){
            lista[22] = 1;
        }else{
            lista[22] = 0;
        }
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        if(X.isSelected()){
            lista[23] = 1;
        }else{
            lista[23] = 0;
        }
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        if(Y.isSelected()){
            lista[24] = 1;
        }else{
            lista[24] = 0;
        }
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        if(Z.isSelected()){
            lista[25] = 1;
        }else{
            lista[25] = 0;
        }
    }//GEN-LAST:event_ZActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Button4ActionPerformed

    private void SuperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperButtonActionPerformed
        
    }//GEN-LAST:event_SuperButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GeradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button4;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JRadioButton E;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton G;
    private javax.swing.JRadioButton H;
    private javax.swing.JRadioButton I;
    private javax.swing.JRadioButton J;
    private javax.swing.JRadioButton K;
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton M;
    private javax.swing.JRadioButton N;
    private javax.swing.JLabel Nome;
    private javax.swing.JRadioButton O;
    private javax.swing.JRadioButton P;
    private javax.swing.JRadioButton Q;
    private javax.swing.JRadioButton R;
    private javax.swing.JRadioButton S;
    private javax.swing.JRadioButton SuperButton;
    private javax.swing.JRadioButton T;
    private javax.swing.JRadioButton U;
    private javax.swing.JRadioButton V;
    private javax.swing.JRadioButton W;
    private javax.swing.JRadioButton X;
    private javax.swing.JRadioButton Y;
    private javax.swing.JRadioButton Z;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}