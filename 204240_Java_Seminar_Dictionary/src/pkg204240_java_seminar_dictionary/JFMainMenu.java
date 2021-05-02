/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg204240_java_seminar_dictionary;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JLabel;

/**
 *
 * @author ngoti
 */
public class JFMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFMainMenu
     */
    final String fileName = "slang.txt";
    private TreeMap<String, String> DictionarySlangWord = new TreeMap();
    
    public JFMainMenu() {
        try {
            LoadData();
        } catch (IOException ex) {
            Logger.getLogger(JFMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jMenuItem1 = new javax.swing.JMenuItem();
        JPMenu = new javax.swing.JPanel();
        jBSearchSlangWord = new javax.swing.JButton();
        jBSearchDefenition = new javax.swing.JButton();
        jBShowHistory = new javax.swing.JButton();
        jBAddSlangWord = new javax.swing.JButton();
        jBEditSlangWord = new javax.swing.JButton();
        jBDeleteSlangWord = new javax.swing.JButton();
        jBResetSlangWord = new javax.swing.JButton();
        jBRandomSlangWord = new javax.swing.JButton();
        jBPuzzleSlangWord = new javax.swing.JButton();
        jBPuzzleDefenition = new javax.swing.JButton();
        JPContent = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        JPMenu.setBackground(new java.awt.Color(204, 255, 204));
        JPMenu.setName(""); // NOI18N

        jBSearchSlangWord.setText("Tìm kiếm Slang Word");
        jBSearchSlangWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchSlangWordActionPerformed(evt);
            }
        });

        jBSearchDefenition.setText("Tìm kiếm theo Defenition");

        jBShowHistory.setText("Hiển thị history");

        jBAddSlangWord.setText("Thêm Slang Word");

        jBEditSlangWord.setText("Chỉnh sửa Slang Word");

        jBDeleteSlangWord.setText("Xóa Slang Word");

        jBResetSlangWord.setText("Reset Slang Word gốc");

        jBRandomSlangWord.setText("Random Slang word");

        jBPuzzleSlangWord.setText("Đố vui Slang Word");

        jBPuzzleDefenition.setText("Đố vui Defenition");

        javax.swing.GroupLayout JPMenuLayout = new javax.swing.GroupLayout(JPMenu);
        JPMenu.setLayout(JPMenuLayout);
        JPMenuLayout.setHorizontalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBSearchSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBSearchDefenition, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBShowHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBAddSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBEditSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBDeleteSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBResetSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBRandomSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBPuzzleSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(jBPuzzleDefenition, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        JPMenuLayout.setVerticalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuLayout.createSequentialGroup()
                .addComponent(jBSearchSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSearchDefenition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBShowHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDeleteSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBResetSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRandomSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPuzzleSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPuzzleDefenition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPContentLayout = new javax.swing.GroupLayout(JPContent);
        JPContent.setLayout(JPContentLayout);
        JPContentLayout.setHorizontalGroup(
            JPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JPContentLayout.setVerticalGroup(
            JPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchSlangWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchSlangWordActionPerformed
        // TODO add your handling code here:
        addPanelSearchSlangWord();
    }//GEN-LAST:event_jBSearchSlangWordActionPerformed

    private void addPanelSearchSlangWord(){
        JPSearchSlangWord JPSearch = new JPSearchSlangWord(DictionarySlangWord);
        JPSearch.setBounds(0, 0, 750, 700);
        JPContent.add(JPSearch);
        JPContent.revalidate();
        JPContent.repaint();
    }
    
    private void LoadData() throws FileNotFoundException, IOException{

        // Đọc dữ liệu từ File với File và FileReader
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            String line = reader.readLine();

            while (line != null) {
                String[] slangWord = line.split("`");
                
                if(slangWord.length == 2)
                    DictionarySlangWord.put(slangWord[0], slangWord[1]);
                
                line = reader.readLine();
            }
            System.out.println(DictionarySlangWord);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                reader.close();
                // file.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(JFMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMainMenu().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPContent;
    private javax.swing.JPanel JPMenu;
    private javax.swing.JButton jBAddSlangWord;
    private javax.swing.JButton jBDeleteSlangWord;
    private javax.swing.JButton jBEditSlangWord;
    private javax.swing.JButton jBPuzzleDefenition;
    private javax.swing.JButton jBPuzzleSlangWord;
    private javax.swing.JButton jBRandomSlangWord;
    private javax.swing.JButton jBResetSlangWord;
    private javax.swing.JButton jBSearchDefenition;
    private javax.swing.JButton jBSearchSlangWord;
    private javax.swing.JButton jBShowHistory;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
