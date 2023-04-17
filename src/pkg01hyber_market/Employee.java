package pkg01hyber_market;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Employee extends javax.swing.JFrame {

    public Employee() {
        initComponents();
        SelectSeller();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectSeller() {
     try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from user1.EMPLOYEE");
            E_table.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        emp_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emp_phn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emp_dprt = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        E_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        actv_add = new javax.swing.JLabel();
        actv_update = new javax.swing.JLabel();
        actv_delete = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        emp_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emp_pass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emp_gender = new javax.swing.JComboBox<>();
        emp_salary = new javax.swing.JTextField();

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setToolTipText("");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("NAME");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("NAME");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 652));
        setSize(new java.awt.Dimension(1000, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        emp_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_id.setToolTipText("");
        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Id");

        emp_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_name.setToolTipText("");
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NAME");

        emp_phn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_phn.setToolTipText("");
        emp_phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_phnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PHONE NUMBER");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("DEPARTMENT");

        emp_dprt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_dprt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inventory", "Marketing", "Seller", "Admin", " " }));

        E_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        E_table.setSelectionBackground(new java.awt.Color(0, 0, 0));
        E_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        E_table.setShowGrid(false);
        E_table.setShowHorizontalLines(true);
        E_table.setShowVerticalLines(true);
        E_table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(E_table);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 200));

        actv_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_add.setForeground(new java.awt.Color(255, 255, 255));
        actv_add.setText("Incert Mode");
        actv_add.setEnabled(false);
        actv_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_addMouseClicked(evt);
            }
        });

        actv_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_update.setForeground(new java.awt.Color(255, 255, 255));
        actv_update.setText("Delete Mode");
        actv_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_updateMouseClicked(evt);
            }
        });

        actv_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_delete.setForeground(new java.awt.Color(255, 255, 255));
        actv_delete.setText("Update Mode");
        actv_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_deleteMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Log out");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actv_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actv_add, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actv_update, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(actv_add, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actv_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(actv_update, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("SALARY");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel2.setText("MANAGE EMPLOYEES");

        add_btn.setBackground(new java.awt.Color(0, 0, 0));
        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(0, 0, 0));
        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(0, 0, 0));
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setEnabled(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(0, 0, 0));
        clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        emp_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_username.setToolTipText("");
        emp_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_usernameActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("username");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("password");

        emp_pass.setMinimumSize(new java.awt.Dimension(64, 26));
        emp_pass.setPreferredSize(new java.awt.Dimension(64, 26));
        emp_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_passActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("GENDER");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel4.setText("EMPLOYEES LIST");

        emp_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        emp_salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_salary.setToolTipText("");
        emp_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_salaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(80, 80, 80)
                                        .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addGap(128, 128, 128))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emp_dprt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emp_phn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emp_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel9))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emp_username, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emp_gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emp_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel2)))))
                .addContainerGap(3067, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emp_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(emp_phn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emp_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emp_dprt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7))))
                        .addGap(3, 3, 3)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1974, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emp_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_salaryActionPerformed

    private void emp_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_passActionPerformed

    private void emp_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_usernameActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        emp_id.setText(null);
        emp_salary.setText(null);
        emp_username.setText(null);
        emp_pass.setText(null);
        emp_phn.setText(null);
        emp_name.setText(null);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        if (emp_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter ID To Be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
                String proId = emp_id.getText();
                String Query = "Delete from User1.EMPLOYEE where ID=" + proId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "EMPLOYEE Deleted Successfully");
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
           
            String Query1;
            String Query2;
            String Query3;
            String Query4;
            String Query5;
            String Query6;
            String Query7;
            Statement Add = Con.createStatement();
            
            if(!emp_name.getText().isEmpty()){
            Query1 = "Update user1.EMPLOYEE set NAME='"+ emp_name.getText()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query1);
            }
            
            if(!emp_username.getText().isEmpty()){
            Query2 = "Update user1.EMPLOYEE set USERNAME='"+ emp_username.getText()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query2);
            }
            
            if(!emp_phn.getText().isEmpty()){
            Query3 = "Update user1.EMPLOYEE set PHONE_NUMBER='"+ emp_phn.getText()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query3);
            }
            
            
            Query4 = "Update user1.EMPLOYEE set POSISION='"+ emp_dprt.getSelectedItem().toString()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query4);
            
            
            if(!emp_pass.getText().isEmpty()){
            Query5 = "Update user1.EMPLOYEE set PASSWORD='"+ emp_pass.getText()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query5);
            }
            
            
            Query6 = "Update user1.EMPLOYEE set GENDER='"+ emp_gender.getSelectedItem().toString()+"'" + "WHERE ID="+Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query6);
            
            
            if(!emp_salary.getText().isEmpty()){
            Query7 = "Update user1.EMPLOYEE set SALARY="+ Integer.parseInt(emp_salary.getText()) + "WHERE ID="+ Integer.parseInt(emp_id.getText());
            Add.executeUpdate(Query7);
            }
            
            
            JOptionPane.showMessageDialog(this, "EMPLOYEE's info Updated");
            SelectSeller();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        EmployeeClass e = new EmployeeClass();
        e.setId(Integer.parseInt(emp_id.getText()));
        e.setName(emp_name.getText());
        e.setGender(emp_gender.getSelectedItem().toString());
        e.setPhoneNumber(emp_phn.getText());
        e.setSalary(Integer.parseInt(emp_salary.getText()));
        e.setUserName(emp_username.getText());
        e.setPassword(emp_pass.getText());
        e.setDept(emp_dprt.getSelectedItem().toString());
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
            PreparedStatement add = Con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?,?,?,?)");
            add.setInt(1, e.getId());
            add.setString(2, e.getName());
            add.setString(3, e.getDept());
            add.setString(4, e.getUserName());
            add.setString(5, e.getPassword());
            add.setString(6, e.getGender());
            add.setString(7, e.getPhoneNumber());
            add.setInt(8, e.getSalary());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee Added Successfully");
            Con.close();
            SelectSeller();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void actv_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_deleteMouseClicked
        // TODO add your handling code here:
        actv_delete.setEnabled(false);
        actv_add.setEnabled(true);
        actv_update.setEnabled(true);
        add_btn.setEnabled(false);
        update_btn.setEnabled(true);
        delete_btn.setEnabled(false);
        emp_name.setEnabled(true);
        emp_phn.setEnabled(true);
        emp_dprt.setEnabled(true);
        emp_salary.setEnabled(true);
        emp_username.setEnabled(true);
        emp_gender.setEnabled(true);
        emp_pass.setEnabled(true);
    }//GEN-LAST:event_actv_deleteMouseClicked

    private void actv_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_updateMouseClicked
        // TODO add your handling code here:
        actv_delete.setEnabled(true);
        actv_add.setEnabled(true);
        actv_update.setEnabled(false);
        add_btn.setEnabled(false);
        update_btn.setEnabled(false);
        delete_btn.setEnabled(true);
        emp_name.setEnabled(false);
        emp_phn.setEnabled(false);
        emp_dprt.setEnabled(false);
        emp_salary.setEnabled(false);
        emp_username.setEnabled(false);
        emp_gender.setEnabled(false);
        emp_pass.setEnabled(false);
    }//GEN-LAST:event_actv_updateMouseClicked

    private void actv_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_addMouseClicked
        // TODO add your handling code here:
        actv_delete.setEnabled(true);
        actv_add.setEnabled(false);
        actv_update.setEnabled(true);
        add_btn.setEnabled(true);
        update_btn.setEnabled(false);
        delete_btn.setEnabled(false);
        emp_name.setEnabled(true);
        emp_phn.setEnabled(true);
        emp_dprt.setEnabled(true);
        emp_salary.setEnabled(true);
        emp_username.setEnabled(true);
        emp_gender.setEnabled(true);
        emp_pass.setEnabled(true);
    }//GEN-LAST:event_actv_addMouseClicked

    private void emp_phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_phnActionPerformed

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_nameActionPerformed

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable E_table;
    private javax.swing.JLabel actv_add;
    private javax.swing.JLabel actv_delete;
    private javax.swing.JLabel actv_update;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JComboBox<String> emp_dprt;
    private javax.swing.JComboBox<String> emp_gender;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField emp_name;
    private javax.swing.JPasswordField emp_pass;
    private javax.swing.JTextField emp_phn;
    private javax.swing.JTextField emp_salary;
    private javax.swing.JTextField emp_username;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
