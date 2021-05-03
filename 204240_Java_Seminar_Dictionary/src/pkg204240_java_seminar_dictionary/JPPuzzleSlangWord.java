/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg204240_java_seminar_dictionary;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeMap;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JRadioButton;

/**
 *
 * @author ngoti
 */
public class JPPuzzleSlangWord extends javax.swing.JPanel {

    /**
     * Creates new form JPSearchSlangWord
     */
    
    private TreeMap<String, String> DictionarySlangWord = new TreeMap<>();
    String answerKey = "";
    
    public JPPuzzleSlangWord(TreeMap _DictionarySlangWord) {
        DictionarySlangWord = _DictionarySlangWord;
        initComponents();
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAnswer = new javax.swing.ButtonGroup();
        jLTitle = new javax.swing.JLabel();
        jPResult = new javax.swing.JPanel();
        jLQuestion = new javax.swing.JLabel();
        jBtnAnswer = new javax.swing.JButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButttonA = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitle.setText("Đố vui slang word");

        jLQuestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuestion.setText("Chọn nghĩa của từ: ");

        jBtnAnswer.setText("Answer");
        jBtnAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnswerActionPerformed(evt);
            }
        });

        buttonGroupAnswer.add(jRadioButtonB);
        jRadioButtonB.setText("B");

        buttonGroupAnswer.add(jRadioButttonA);
        jRadioButttonA.setText("A");

        buttonGroupAnswer.add(jRadioButtonC);
        jRadioButtonC.setText("C");

        buttonGroupAnswer.add(jRadioButtonD);
        jRadioButtonD.setText("D");

        javax.swing.GroupLayout jPResultLayout = new javax.swing.GroupLayout(jPResult);
        jPResult.setLayout(jPResultLayout);
        jPResultLayout.setHorizontalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addGroup(jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPResultLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jBtnAnswer)
                        .addGap(0, 338, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPResultLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonD)
                    .addComponent(jRadioButtonC)
                    .addComponent(jRadioButttonA)
                    .addComponent(jRadioButtonB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPResultLayout.setVerticalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addComponent(jLQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jRadioButttonA)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonB)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonC)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jBtnAnswer)
                .addGap(181, 181, 181))
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
                        .addGap(249, 249, 249)
                        .addComponent(jLTitle)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitle)
                .addGap(18, 18, 18)
                .addComponent(jPResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnswerActionPerformed
        // TODO add your handling code here:
        ArrayList<AbstractButton> listRadioButton = Collections.list(buttonGroupAnswer.getElements());
        String defenitionAnswer = DictionarySlangWord.get(answerKey);
        for (AbstractButton button : listRadioButton) {
            
            if(button.isSelected()){
                String chooseAnswer = button.getText();
                if (chooseAnswer.equals(defenitionAnswer))
                {
                    showMessageDialog(null, "Bạn đã trả lời đúng");
                    loadData();
                    return;
                }
            }

        }
        
        showMessageDialog(null, "Bạn đã trả lời sai, câu trả lời đúng là : " + defenitionAnswer);
        loadData();
        return;
    }//GEN-LAST:event_jBtnAnswerActionPerformed

    private void loadData(){
        
        answerKey = getRandomKey();
        Random random = new Random();
        int randomAnswer = random.nextInt(3) + 1;

        ArrayList<AbstractButton> listRadioButton = Collections.list(buttonGroupAnswer.getElements());

        jLQuestion.setText("Chọn nghĩa của từ: " + answerKey);
        
                
        int i = 1;
        for (AbstractButton button : listRadioButton) {
            
            if (i == randomAnswer){
                button.setText(DictionarySlangWord.get(answerKey));
            }else{
                button.setText(DictionarySlangWord.get(getRandomKeyDifferentAnswerKey(answerKey)));
            }
            
            button.setSelected(false);
            
            i++;
        }

    }
    
    private void refreshButtonRadio(){
       
        
    }
    
    private String getRandomKeyDifferentAnswerKey(String ansKey){
        Random       random    = new Random();
        ArrayList<String> keys      = new ArrayList<String>(DictionarySlangWord.keySet());
        keys.remove(ansKey);
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        return randomKey;
    }
    
    private String getRandomKey(){
        Random       random    = new Random();
        ArrayList<String> keys      = new ArrayList<String>(DictionarySlangWord.keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        return randomKey;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAnswer;
    private javax.swing.JButton jBtnAnswer;
    private javax.swing.JLabel jLQuestion;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPResult;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JRadioButton jRadioButttonA;
    // End of variables declaration//GEN-END:variables
}
