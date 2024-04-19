/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import thogakade.controller.CustomerController;
import thogakade.controller.ItemController;
import thogakade.controller.OrderController;
import thogakade.Model.Customer;
import thogakade.Model.Item;
import thogakade.Model.Order;

/**
 *
 * @author niroth
 */
public class OrderForm extends javax.swing.JFrame {

    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        setLocationRelativeTo(null);
        // 1st way
        // util date (not sql date)
        Date date = new Date();
        String formatDate = formatDate(date);
        txtOrderDate.setText(formatDate);

        loadAllCustomers();
        loadAllItemCode();
        generateOrderId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbCustomerId = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbItemCode = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblQtyOnHand = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemDetails = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Place Order Form");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setText("Place Order Form");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("Order ID : ");

        lblOrderId.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblOrderId.setForeground(new java.awt.Color(255, 0, 0));
        lblOrderId.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setText("Order Date :");

        txtOrderDate.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setText("Customer ID : ");

        cmbCustomerId.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cmbCustomerId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerIdItemStateChanged(evt);
            }
        });
        cmbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setText("Customer Name :");

        lblCustomerName.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 0, 0));
        lblCustomerName.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setText("Code :");

        cmbItemCode.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cmbItemCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemCodeItemStateChanged(evt);
            }
        });
        cmbItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemCodeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setText("Description");

        lblDescription.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(0, 153, 251));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("jLabel10");
        lblDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setText("Unit Price");

        lblUnitPrice.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(0, 153, 251));
        lblUnitPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnitPrice.setText("jLabel12");
        lblUnitPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel13.setText("Qty. on Hand ");

        lblQtyOnHand.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblQtyOnHand.setForeground(new java.awt.Color(0, 153, 251));
        lblQtyOnHand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtyOnHand.setText("jLabel14");
        lblQtyOnHand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel15.setText("Qty. ");

        txtQty.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
        });

        tblItemDetails.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        tblItemDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Qty", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItemDetails.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblItemDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblItemDetails);

        btnAdd.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Total : ");

        lblTotal.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("jLabel17");

        btnPlaceOrder.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jButton1.setText("Commit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("addCustomer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(cmbItemCode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtOrderDate)
                                            .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblOrderId)
                                                .addGap(41, 41, 41))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(38, 38, 38)))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblQtyOnHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel15)))))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addGap(212, 212, 212)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblOrderId)
                    .addComponent(jLabel4)
                    .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblCustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription)
                    .addComponent(lblUnitPrice)
                    .addComponent(lblQtyOnHand)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblTotal)
                    .addComponent(btnPlaceOrder)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtOrderDate, txtQty});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerIdItemStateChanged
        //// 
        try {
            String customerId = cmbCustomerId.getSelectedItem().toString();
            Customer tempCustomer = CustomerController.searchCustomer(customerId);
            lblCustomerName.setText(tempCustomer.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmbCustomerIdItemStateChanged

    private void cmbItemCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemCodeItemStateChanged

        try {
            String itemCode = cmbItemCode.getSelectedItem().toString();
            Item tempItem = ItemController.searchItem(itemCode);
            lblDescription.setText(tempItem.getDescription());
            //lblQtyOnHand.setText(tempItem.getQtyOnHand()+"");
            lblQtyOnHand.setText(String.valueOf(tempItem.getQtyOnHand())); // best way
            lblUnitPrice.setText(String.valueOf(tempItem.getUnitPrice()));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_cmbItemCodeItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblItemDetails.getModel();
        int qty = Integer.parseInt(txtQty.getText());

        if (qty > Integer.parseInt(lblQtyOnHand.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity!");
            return;
        }

        double unitPrice = Double.parseDouble(lblUnitPrice.getText());
        double total = unitPrice * qty;

        int rowIndex = isAlreadyExists(cmbItemCode.getSelectedItem().toString());

        if (rowIndex == -1) {
            Object[] rowData = {
                cmbItemCode.getSelectedItem().toString(),
                lblDescription.getText(),
                qty,
                unitPrice,
                total
            };
            model.addRow(rowData);
        } else {
            qty += (int) model.getValueAt(rowIndex, 2);
            total = qty * unitPrice;

            if (qty > Integer.parseInt(lblQtyOnHand.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid Quantity!");
                return;
            }

            tblItemDetails.setValueAt(qty, rowIndex, 2);
            tblItemDetails.setValueAt(total, rowIndex, 4);

        }

        calculateTotalValue();


    }//GEN-LAST:event_btnAddActionPerformed

    private void tblItemDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailsMouseClicked
        //
        //to find selected Code

    }//GEN-LAST:event_tblItemDetailsMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        // romve 
        int selectedRow = tblItemDetails.getSelectedRow();
        if (selectedRow == -1) {
            // empty result
            return;
        }
        DefaultTableModel dfm = (DefaultTableModel) tblItemDetails.getModel();
        dfm.removeRow(selectedRow);

        calculateTotalValue();


    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAdd.doClick();
        }

    }//GEN-LAST:event_txtQtyKeyPressed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        Order order=new Order(id, date, customerId, itemDetailList);
        boolean isAdded = OrderController.addOrder(order); //placeOrdder
        if (isAdded) {
            //
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCustomerIdActionPerformed

    private void cmbItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemCodeActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemCodeActionPerformed

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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbCustomerId;
    private javax.swing.JComboBox<String> cmbItemCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblQtyOnHand;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTable tblItemDetails;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    private void loadAllCustomers() {
        try {
            ArrayList<Customer> allCustomers = CustomerController.getAllCustomers();
            for (Customer c : allCustomers) {
                cmbCustomerId.addItem(c.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadAllItemCode() {
        try {
            ArrayList<Item> itemList = ItemController.loadAllItems();
            for (Item tempItem : itemList) {
                cmbItemCode.addItem(tempItem.getCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int isAlreadyExists(String itemCode) {
        DefaultTableModel dtm = (DefaultTableModel) tblItemDetails.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 0);
            if (code.equals(itemCode)) {
                return i;
            }
        }
        return -1;
    }

    private void calculateTotalValue() {
        DefaultTableModel dtm = (DefaultTableModel) tblItemDetails.getModel();

        double total = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (Double) dtm.getValueAt(i, 4);

        }

        lblTotal.setText(String.valueOf(total));
    }

    private void generateOrderId() {

        try {
            String orderId = OrderController.generateOrderId();
            lblOrderId.setText(orderId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
