/**
 * Menu Panel
 * 
 * Autoři:
 * xbieli05
 * xmatus29
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import labyrinth.Labyrinth;
import javax.swing.*;
import board.*;
import player.Player;
import treasure.CardPack;

/**
 * Menu.
 * @author marek
 */
public class MenuP extends javax.swing.JPanel {
    
    /**
     * Creates new form MenuP
     */
    public MenuP() {
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

        SetBoardSizeBG = new javax.swing.ButtonGroup();
        SetNumberOfPlayersBG = new javax.swing.ButtonGroup();
        SetCardPackSizeBG = new javax.swing.ButtonGroup();
        boardSize7RB = new javax.swing.JRadioButton();
        boardSize9RB = new javax.swing.JRadioButton();
        players4RB = new javax.swing.JRadioButton();
        players3RB = new javax.swing.JRadioButton();
        boardSize11RB = new javax.swing.JRadioButton();
        cardPackSize12RB = new javax.swing.JRadioButton();
        cardPackSize24RB = new javax.swing.JRadioButton();
        boardSize5RB = new javax.swing.JRadioButton();
        boardSizeL = new javax.swing.JLabel();
        cardPackSizeL = new javax.swing.JLabel();
        newGameRB = new javax.swing.JButton();
        playersL = new javax.swing.JLabel();
        players2RB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        SetBoardSizeBG.add(boardSize7RB);
        boardSize7RB.setText("7");
        boardSize7RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardSize7RBActionPerformed(evt);
            }
        });

        SetBoardSizeBG.add(boardSize9RB);
        boardSize9RB.setText("9");
        boardSize9RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardSize9RBActionPerformed(evt);
            }
        });

        SetNumberOfPlayersBG.add(players4RB);
        players4RB.setText("4");
        players4RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players4RBActionPerformed(evt);
            }
        });

        SetNumberOfPlayersBG.add(players3RB);
        players3RB.setText("3");
        players3RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players3RBActionPerformed(evt);
            }
        });

        SetBoardSizeBG.add(boardSize11RB);
        boardSize11RB.setText("11");
        boardSize11RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardSize11RBActionPerformed(evt);
            }
        });

        SetCardPackSizeBG.add(cardPackSize12RB);
        cardPackSize12RB.setText("12");
        cardPackSize12RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardPackSize12RBActionPerformed(evt);
            }
        });

        SetCardPackSizeBG.add(cardPackSize24RB);
        cardPackSize24RB.setText("24");
        cardPackSize24RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardPackSize24RBActionPerformed(evt);
            }
        });

        SetBoardSizeBG.add(boardSize5RB);
        boardSize5RB.setText("5");
        boardSize5RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardSize5RBActionPerformed(evt);
            }
        });

        boardSizeL.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        boardSizeL.setText("Zadej velikost desky:");

        cardPackSizeL.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        cardPackSizeL.setText("Zadej pocet karet v balicku:");

        newGameRB.setBackground(new java.awt.Color(51, 102, 255));
        newGameRB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newGameRB.setText("New Game");
        newGameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameRBActionPerformed(evt);
            }
        });

        playersL.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        playersL.setText("Zadej pocet hracu: ");

        SetNumberOfPlayersBG.add(players2RB);
        players2RB.setText("2");
        players2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players2RBActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/title2.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playersL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cardPackSize12RB)
                                        .addGap(18, 18, 18)
                                        .addComponent(cardPackSize24RB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(players2RB)
                                        .addGap(18, 18, 18)
                                        .addComponent(players3RB)
                                        .addGap(18, 18, 18)
                                        .addComponent(players4RB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boardSize5RB)
                                        .addGap(18, 18, 18)
                                        .addComponent(boardSize7RB)
                                        .addGap(18, 18, 18)
                                        .addComponent(boardSize9RB)
                                        .addGap(28, 28, 28)
                                        .addComponent(boardSize11RB))))
                            .addComponent(newGameRB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boardSizeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardPackSizeL, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(playersL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(players2RB)
                    .addComponent(players3RB)
                    .addComponent(players4RB))
                .addGap(49, 49, 49)
                .addComponent(boardSizeL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boardSize5RB)
                    .addComponent(boardSize7RB)
                    .addComponent(boardSize9RB)
                    .addComponent(boardSize11RB))
                .addGap(28, 28, 28)
                .addComponent(cardPackSizeL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardPackSize12RB)
                    .addComponent(cardPackSize24RB))
                .addGap(43, 43, 43)
                .addComponent(newGameRB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boardSize7RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardSize7RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.boardSize = 7;
        cardPackSize24RB.setVisible(true);
        System.out.println("Board size set on 7");
    }//GEN-LAST:event_boardSize7RBActionPerformed

    private void boardSize9RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardSize9RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.boardSize = 9;
        cardPackSize24RB.setVisible(true);
        System.out.println("Board size set on 9");
    }//GEN-LAST:event_boardSize9RBActionPerformed

    private void players4RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players4RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.numbeOfPlayers = 4;
        System.out.println("Number of players set on 4");
    }//GEN-LAST:event_players4RBActionPerformed

    private void players3RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players3RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.numbeOfPlayers = 3;
        System.out.println("Number of players set on 3");
    }//GEN-LAST:event_players3RBActionPerformed

    private void boardSize11RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardSize11RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.boardSize = 11;
        cardPackSize24RB.setVisible(true);
        System.out.println("Board size set on 11");
    }//GEN-LAST:event_boardSize11RBActionPerformed

    private void cardPackSize12RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPackSize12RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.cardPackSize = 12;
        System.out.println("Card pack size set on 12");
    }//GEN-LAST:event_cardPackSize12RBActionPerformed

    private void cardPackSize24RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPackSize24RBActionPerformed
        // TODO add your handling code here:
        Labyrinth.cardPackSize = 24;
        System.out.println("Card pack size set on 24");
    }//GEN-LAST:event_cardPackSize24RBActionPerformed

    private void boardSize5RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardSize5RBActionPerformed
        Labyrinth.boardSize = 5;
        System.out.println("Board size set on 5");
        cardPackSize12RB.doClick();
        cardPackSize24RB.setVisible(false);
    }//GEN-LAST:event_boardSize5RBActionPerformed

    private void newGameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameRBActionPerformed
        //create card pack for board
        Labyrinth.pack = new CardPack(Labyrinth.cardPackSize, Labyrinth.cardPackSize);
        Labyrinth.pack.shuffle();
        
        //create board
        Labyrinth.mazeBoard = MazeBoard.createMazeBoard(Labyrinth.boardSize);
        Labyrinth.mazeBoard.newGame();
        Labyrinth.mazeBoard.setMode(MazeBoard.MODE.TURN);
        
        //create new card pack for players
        Labyrinth.pack = new CardPack(Labyrinth.cardPackSize, Labyrinth.cardPackSize);
        Labyrinth.pack.shuffle();
        
        Player.createPlayers();
        
        //store initial state
        Labyrinth.saveMove();
        
        Labyrinth.gui.hideMenu();
        Labyrinth.gui.displayBoard();      
    }//GEN-LAST:event_newGameRBActionPerformed

    private void players2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players2RBActionPerformed
        Labyrinth.numbeOfPlayers = 2;
        System.out.println("Number of players set on 2");
    }//GEN-LAST:event_players2RBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SetBoardSizeBG;
    private javax.swing.ButtonGroup SetCardPackSizeBG;
    private javax.swing.ButtonGroup SetNumberOfPlayersBG;
    private javax.swing.JRadioButton boardSize11RB;
    private javax.swing.JRadioButton boardSize5RB;
    private javax.swing.JRadioButton boardSize7RB;
    private javax.swing.JRadioButton boardSize9RB;
    private javax.swing.JLabel boardSizeL;
    private javax.swing.JRadioButton cardPackSize12RB;
    private javax.swing.JRadioButton cardPackSize24RB;
    private javax.swing.JLabel cardPackSizeL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newGameRB;
    private javax.swing.JRadioButton players2RB;
    private javax.swing.JRadioButton players3RB;
    private javax.swing.JRadioButton players4RB;
    private javax.swing.JLabel playersL;
    // End of variables declaration//GEN-END:variables
}
