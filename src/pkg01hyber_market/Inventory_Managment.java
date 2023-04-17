
package pkg01hyber_market;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class Inventory_Managment extends javax.swing.JFrame {


    
    public Inventory_Managment() {
        initComponents();
        SelectSeller();
        amount_close();
        EXDate();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectSeller() {
     try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from user1.INVENTORY");
            show_product.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void amount_close(){
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
            St = Con.createStatement();
            String Query = "Select NO_ITEMS from User1.INVENTORY";
            Rs = St.executeQuery(Query);
            while (Rs.next()) {
                if (Integer.valueOf(Rs.getString("NO_ITEMS")) <= 1) {
                    JOptionPane.showMessageDialog(this, "Some of Products RunnigOut");
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void EXDate() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
            St = Con.createStatement();
            String Query = "select EXPIRE_DATE , PRODUCTION_DATE from user1.INVENTORY";
            Rs = St.executeQuery(Query);
            DefaultTableModel model = (DefaultTableModel) show_product.getModel();
            int i = 0;
            while (i < show_product.getRowCount()) {
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
                Date date1 = (Date) model.getValueAt(i, 4);
                Date date2 = (Date) model.getValueAt(i, 3);

                long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

                if (diff <= 30) {
                    JOptionPane.showMessageDialog(this, "Some of Products Expiry");
                }
                i++;
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            ex.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        no_items = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        setCategory = new javax.swing.JComboBox<>();
        clear_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_product = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        actv_add1 = new javax.swing.JLabel();
        actv_update2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        actv_delete1 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 665));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 735));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel2.setText("MANAGE PRODUCTS");

        barcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barcode.setToolTipText("");
        barcode.setFocusAccelerator('g');

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BarCode");

        Pname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pname.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NAME");

        no_items.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        no_items.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("QUANTITY");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CATEGORY");

        setCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose category", "bakery", "fresh Food", "dairy And Eggs", "forzen And Chield", "beverage", "sweet And Snacks", "cleaning And Beauty", "pets" }));

        clear_btn.setBackground(new java.awt.Color(0, 0, 0));
        clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(0, 0, 0));
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delet");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

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

        show_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        show_product.setSelectionBackground(new java.awt.Color(0, 0, 0));
        show_product.setSelectionForeground(new java.awt.Color(255, 255, 255));
        show_product.setShowGrid(false);
        show_product.setShowHorizontalLines(true);
        show_product.setShowVerticalLines(true);
        show_product.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(show_product);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 22)); // NOI18N
        jLabel8.setText("          Products list");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 200));

        actv_add1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_add1.setForeground(new java.awt.Color(255, 255, 255));
        actv_add1.setText("Incert Mode");
        actv_add1.setEnabled(false);
        actv_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_add1MouseClicked(evt);
            }
        });

        actv_update2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_update2.setForeground(new java.awt.Color(255, 255, 255));
        actv_update2.setText("Update Mode");
        actv_update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_update2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Log out");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        actv_delete1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actv_delete1.setForeground(new java.awt.Color(255, 255, 255));
        actv_delete1.setText("Delete Mode");
        actv_delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actv_delete1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(actv_add1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actv_update2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(actv_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(actv_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actv_update2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actv_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("BUY PRICE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("SELL PRICE");

        price1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price1.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("EXPIRE DATE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("PRODUCTION DATE");

        jDateChooser1.setDateFormatString("MM/dd/yyyy");

        jDateChooser2.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(153, 153, 153)
                                            .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(86, 86, 86)
                                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(price)
                                                .addComponent(Pname)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel6))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(no_items, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                .addComponent(price1)))))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(setCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        barcode.setText(null);
        Pname.setText(null);
        price.setText(null);
        price.setText(null);
        price1.setText(null);
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);
        no_items.setText(null);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        if (barcode.getText().isEmpty() ||  Pname.getText().isEmpty()  || price.getText().isEmpty()  || price1.getText().isEmpty() 
                || no_items.getText().isEmpty() || jDateChooser1.getCalendar().getTime().toString().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
        Product p =new Product();
        p.setBarCode(Integer.parseInt(barcode.getText()));
        p.setName(Pname.getText());
        p.setBuyPrice(Double.parseDouble(price.getText()));
        p.setSellPrice(Double.parseDouble(price1.getText()));
        p.setNo_of_items(Integer.parseInt(no_items.getText()));
        p.setType(setCategory.getSelectedItem().toString());
        p.setExpireDate((jDateChooser1.getCalendar().getTime()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        java.sql.Date exDate = new java.sql.Date(jDateChooser1.getCalendar().getTimeInMillis());
         p.setExpireDate((jDateChooser2.getCalendar().getTime()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        java.sql.Date PDate = new java.sql.Date(jDateChooser2.getCalendar().getTimeInMillis());

            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
                PreparedStatement add = Con.prepareStatement("insert into INVENTORY values(?,?,?,?,?,?,?,?,?,?,?)");
                add.setInt(1, p.getBarCode());
                add.setString(2, p.getName());
                add.setString(3, p.getType());
                add.setDate(4, exDate);
                add.setDate(5, PDate);
                add.setDouble(6, p.getBuyPrice());
                add.setDouble(7, p.getSellPrice());
                add.setInt(8, p.getSpecialAmount());
                add.setInt(9, p.getNo_of_items());
                add.setInt(10, p.getNo_of_SoldItems());
                add.setDouble(11, p.getSalesReturn());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
                Con.close();
                SelectSeller();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
//         if (ProdId.getText().isEmpty()  ProdName.getText().isEmpty()  ProdQty.getText().isEmpty() || ProdPrice.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Missing Information");
//        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
                String Query;
                String Query1;
                String Query2;
                String Query3;
                String Query6;
                Statement Add = Con.createStatement();
                if(!Pname.getText().isEmpty()){
                    Query = "Update User1.INVENTORY set NAME='"+ Pname.getText()+"'" + "WHERE BARCODE="+barcode.getText();
                    Add.executeUpdate(Query);
                }
                Query1 = "Update User1.INVENTORY set CATEGORY='"+ setCategory.getSelectedItem().toString()
                        +"'" + "WHERE BARCODE="+barcode.getText();
                if(!price.getText().isEmpty()){
                    Query2 = "Update User1.INVENTORY set BUY_PRICE="+ Double.parseDouble(price.getText())+ "WHERE BARCODE="+barcode.getText();
                    Add.executeUpdate(Query1);
                }
                 if(!price1.getText().isEmpty()){
                    Query3 = "Update User1.INVENTORY set SELL_PRICE="+ Double.parseDouble(price1.getText())+ "WHERE BARCODE="+barcode.getText();
                    Add.executeUpdate(Query3);
                 }
                 if(!no_items.getText().isEmpty()){
                    Query6 = "Update User1.INVENTORY set NO_ITEMS="+ Integer.parseInt(no_items.getText())+ "WHERE BARCODE="+barcode.getText();
                  Add.executeUpdate(Query6);  
                 }
                 
                JOptionPane.showMessageDialog(this, "Product Updated");
                SelectSeller();
            } catch (SQLException e) {
                e.printStackTrace();
            }
//        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void actv_update2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_update2MouseClicked
        // TODO add your handling code here:
        add_btn.setEnabled(false);
            update_btn.setEnabled(true);
            delete_btn.setEnabled(false);
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
            actv_add1.setEnabled(true);
            actv_update2.setEnabled(false);
            actv_delete1.setEnabled(true);
            setCategory.setEnabled(true);
            price.setEnabled(true);
            price1.setEnabled(true);
            no_items.setEnabled(true);
            Pname.setEnabled(true);
    }//GEN-LAST:event_actv_update2MouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        if (barcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Product To Be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/user1", "user1", "1234");
                String proId = barcode.getText();
                String Query = "Delete from user1.INVENTORY where BARCODE=" + proId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void actv_delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_delete1MouseClicked
        // TODO add your handling code here:
        add_btn.setEnabled(false);
            update_btn.setEnabled(false);
            delete_btn.setEnabled(true);
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
            actv_add1.setEnabled(true);
            actv_update2.setEnabled(true);
            actv_delete1.setEnabled(false);
            setCategory.setEnabled(false);
            price.setEnabled(false);
            price1.setEnabled(false);
            no_items.setEnabled(false);
            Pname.setEnabled(false);
    }//GEN-LAST:event_actv_delete1MouseClicked

    private void actv_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actv_add1MouseClicked
        // TODO add your handling code here:
        add_btn.setEnabled(true);
            update_btn.setEnabled(false);
            delete_btn.setEnabled(false);
            jDateChooser1.setEnabled(true);
            jDateChooser2.setEnabled(true);
            actv_add1.setEnabled(false);
            actv_update2.setEnabled(true);
            actv_delete1.setEnabled(true);
            setCategory.setEnabled(true);
            price.setEnabled(true);
            price1.setEnabled(true);
            no_items.setEnabled(true);
            Pname.setEnabled(true);
    }//GEN-LAST:event_actv_add1MouseClicked

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
            java.util.logging.Logger.getLogger(Inventory_Managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_Managment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pname;
    private javax.swing.JLabel actv_add1;
    private javax.swing.JLabel actv_delete1;
    private javax.swing.JLabel actv_update2;
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField barcode;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no_items;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JComboBox<String> setCategory;
    private javax.swing.JTable show_product;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
