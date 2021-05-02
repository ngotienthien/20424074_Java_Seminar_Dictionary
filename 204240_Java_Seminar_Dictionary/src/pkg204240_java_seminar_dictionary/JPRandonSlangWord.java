/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg204240_java_seminar_dictionary;

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
        jTSearch = new javax.swing.JTextField();
        jPResult = new javax.swing.JPanel();
        jLResult = new javax.swing.JLabel();
        jLSlangWord = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitle.setText("Random slang word");

        jTSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSearch.setToolTipText("");

        jLResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLSlangWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSlangWord.setText("Slang word of  ");

        javax.swing.GroupLayout jPResultLayout = new javax.swing.GroupLayout(jPResult);
        jPResult.setLayout(jPResultLayout);
        jPResultLayout.setHorizontalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 309, Short.MAX_VALUE))
        );
        jPResultLayout.setVerticalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLResult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jBSearch.setText("Tìm kiếm");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jPResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLTitle.getAccessibleContext().setAccessibleName("Random slang word mỗi ngày");
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
        String jTxtSearch = jTSearch.getText();
        jLSlangWord.setText("Defenition : " + jTxtSearch);
        jLResult.setText(DictionarySlangWord.get(jTxtSearch));
    }//GEN-LAST:event_jBSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLResult;
    private javax.swing.JLabel jLSlangWord;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPResult;
    private javax.swing.JTextField jTSearch;
    // End of variables declaration//GEN-END:variables
}
