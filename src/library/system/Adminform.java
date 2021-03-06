/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
public class Adminform extends javax.swing.JFrame {
    DB_Manager db = new DB_Manager("jdbc:ucanaccess://D:\\SignUp.accdb");
    /**
     * Creates new form Employee form
     */
    public Adminform() {
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

        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        explore = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        display = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        displayall = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addE = new javax.swing.JButton();
        removeE = new javax.swing.JButton();
        updateE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mark = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        borrow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");

        jLabel1.setText("Add a new book(s)");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel2.setText("Explore all books");

        explore.setText("Explore");
        explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploreActionPerformed(evt);
            }
        });

        jLabel3.setText("Update book information");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel4.setText("Delete book(s)");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Search book(s)");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel7.setText("Display employee information");

        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        jLabel8.setText("Display all employees information");

        displayall.setText("Display All");
        displayall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayallActionPerformed(evt);
            }
        });

        jLabel9.setText("View all student borrowers books information");

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel10.setText("Add an employee");

        jLabel11.setText("Remove an employee");

        jLabel12.setText("Update an employee");

        addE.setText("Add");
        addE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEActionPerformed(evt);
            }
        });

        removeE.setText("Remove");
        removeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEActionPerformed(evt);
            }
        });

        updateE.setText("Update");
        updateE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEActionPerformed(evt);
            }
        });

        jLabel6.setText("Mark a user as an employee");

        mark.setText("Mark");
        mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markActionPerformed(evt);
            }
        });

        jLabel13.setText("Borrow book");

        borrow.setText("Borrow");
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(explore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(mark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(displayall, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(view, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addE)
                        .addComponent(removeE)
                        .addComponent(updateE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, addE, delete, display, displayall, explore, removeE, search, update, updateE, view});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add)
                    .addComponent(jLabel7)
                    .addComponent(display))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(explore)
                    .addComponent(jLabel8)
                    .addComponent(displayall))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(update)
                    .addComponent(jLabel9)
                    .addComponent(view))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(delete)
                    .addComponent(jLabel10)
                    .addComponent(addE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(search)
                    .addComponent(jLabel11)
                    .addComponent(removeE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(updateE)
                    .addComponent(jLabel6)
                    .addComponent(mark))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(borrow))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addBooks a = new addBooks();
        a.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreActionPerformed

        Vector columnNames = new Vector();
        try {
            String sql = "select * from Books";
            ResultSet rs = db.select(sql);
            int columns =rs.getMetaData().getColumnCount();

            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(rs.getMetaData().getColumnName(i));
            }

            Vector data = new Vector();
            while (rs.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rs.getObject(i));
                }
                data.addElement(row);
            }
            new exploreview(data, columnNames).setVisible(true);
            db.releaseResources();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_exploreActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        updateForm uf = new updateForm();
        uf.setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteForm df = new deleteForm();
        df.setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchForm sf = new searchForm();
        sf.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        display d = new display();
        d.setVisible(true);
    }//GEN-LAST:event_displayActionPerformed

    private void displayallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayallActionPerformed
        Vector columnNames = new Vector();
        try {
            String sql = "select * from Users";
            ResultSet rs = db.select(sql);
            int columns =rs.getMetaData().getColumnCount();

            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(rs.getMetaData().getColumnName(i));
            }
            
            Vector data = new Vector();
            while (rs.next()) {
                String dbuser = rs.getString("user_type");
                if(dbuser.equals("Employee")){
                    Vector row = new Vector(columns);

                    for (int i = 1; i <= columns; i++) {
                        row.addElement(rs.getObject(i));
                    }
                    data.addElement(row);
                }
            }
            new displayAll(data, columnNames).setVisible(true);
            db.releaseResources();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_displayallActionPerformed

    private void addEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEActionPerformed
        addEmployee ae = new addEmployee();
        ae.setVisible(true);
    }//GEN-LAST:event_addEActionPerformed

    private void removeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEActionPerformed
        removeEmployee re = new removeEmployee();
        re.setVisible(true);
    }//GEN-LAST:event_removeEActionPerformed

    private void updateEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEActionPerformed
        updateEmployee ue = new updateEmployee();
        ue.setVisible(true);
    }//GEN-LAST:event_updateEActionPerformed

    private void markActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markActionPerformed
        markAsEmployee mae = new markAsEmployee();
        mae.setVisible(true);
    }//GEN-LAST:event_markActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        
    }//GEN-LAST:event_viewActionPerformed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        borrowFram br = new borrowFram();
        br.setVisible(true);
    }//GEN-LAST:event_borrowActionPerformed

    
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
            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addE;
    private javax.swing.JButton borrow;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton displayall;
    private javax.swing.JButton explore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mark;
    private javax.swing.JButton removeE;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JButton updateE;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
