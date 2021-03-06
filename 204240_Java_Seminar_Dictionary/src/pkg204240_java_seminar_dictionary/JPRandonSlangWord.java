/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg204240_java_seminar_dictionary;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import javax.swing.JLabel;

/**
 *
 * @author ngoti
 */
public class JPRandonSlangWord extends javax.swing.JPanel {

    /**
     * Creates new form JPSearchSlangWord
     */
    
    private TreeMap<String, String> DictionarySlangWord = new TreeMap<>();
    
    public JPRandonSlangWord(TreeMap _DictionarySlangWord) {
        DictionarySlangWord = _DictionarySlangWord;
        initComponents();
        loadRandomSlangWord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitle = new javax.swing.JLabel();
        jPResult = new javax.swing.JPanel();
        jLSlangWord = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtWord = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitle.setText("Random slang word");

        jLSlangWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSlangWord.setText("Word on this Day");

        jTxtWord.setColumns(20);
        jTxtWord.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTxtWord.setRows(5);
        jScrollPane1.setViewportView(jTxtWord);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Ramdom");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPResultLayout = new javax.swing.GroupLayout(jPResult);
        jPResult.setLayout(jPResultLayout);
        jPResultLayout.setHorizontalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPResultLayout.createSequentialGroup()
                        .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(303, Short.MAX_VALUE))))
        );
        jPResultLayout.setVerticalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitle)
                .addGap(97, 97, 97)
                .addComponent(jPResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLTitle.getAccessibleContext().setAccessibleName("Random slang word m???i ng??y");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadRandomSlangWord();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadRandomSlangWord(){
        Random       random    = new Random();
        ArrayList<String> keys      = new ArrayList<String>(DictionarySlangWord.keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        String       value     = DictionarySlangWord.get(randomKey);
        String SlangRandom = randomKey + "  |  " + value;
        jTxtWord.setText(SlangRandom);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLSlangWord;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtWord;
    // End of variables declaration//GEN-END:variables
}
