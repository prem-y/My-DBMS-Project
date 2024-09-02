
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prems
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */

    public AddProduct() {
        initComponents();
    }
    
    int[] checkArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int count = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materialSelectedTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        materialTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Add Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Select Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter Product Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Material Details");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 116, -1, -1));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customer name", "Phone number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 368, 393));

        jButton1.setText("Add Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel5.setText("Product Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 153, -1, -1));
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 243, 267, -1));

        jLabel6.setText("Product name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 215, -1, -1));
        getContentPane().add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 181, 267, -1));

        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 345, -1, -1));
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 373, 267, -1));

        jLabel8.setText("Description");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 283, -1, -1));
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 311, 267, -1));

        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 413, -1, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 441, 267, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Materials Selected");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 507, -1, -1));

        materialSelectedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Id", "Material name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(materialSelectedTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 364, 201));

        materialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Id", "Material name", "Description", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        materialTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(materialTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 147, -1, 604));

        jButton2.setText("Add Materials");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 118, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Customer Details");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel12.setText("Customer name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 267, -1));

        jLabel13.setText("Customer Id");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));
        getContentPane().add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 267, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 30, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 757, 364, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 798, 364, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BigBG.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        txtProductId.setEditable(false); 
        txtCustomerId.setEditable(false); 
        txtCustomerName.setEditable(false); 
        count = 0;
        
        DefaultTableModel customerModel = (DefaultTableModel) customerTable.getModel();
        DefaultTableModel materialModel = (DefaultTableModel) materialTable.getModel();
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer;");
            while(rs.next()){
                customerModel.addRow(new Object[]{rs.getString("Customer_id"), rs.getString("Customer_name"), rs.getString("Phone_number")});
            }
            
            rs = st.executeQuery("select * from material where ProductID IS NULL;");
            while(rs.next()){
                materialModel.addRow(new Object[]{rs.getString("Material_id"), rs.getString("Material_name"), rs.getString("Description"), rs.getString("Quantity"), rs.getString("Price"), rs.getString("MVendor_id")});
            }
            
            rs = st.executeQuery("select count(*) as num from product;");
            int num=0;
            while(rs.next()){
                num = Integer.parseInt(rs.getString("num")); 
            }
            num+=1;
            txtProductId.setText("TBP"+num); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageCustomers().setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AddMaterial().setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        int index = customerTable.getSelectedRow();
        TableModel model = customerTable.getModel();
        String id = model.getValueAt(index, 0).toString();
        txtCustomerId.setText(id);
        String name = model.getValueAt(index, 1).toString();
        txtCustomerName.setText(name); 
    }//GEN-LAST:event_customerTableMouseClicked
    
    
    private void materialTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialTableMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel materialModel = (DefaultTableModel) materialTable.getModel();
        DefaultTableModel materialSelectedModel = (DefaultTableModel) materialSelectedTable.getModel();
        int index = materialTable.getSelectedRow();
        TableModel materialModel = materialTable.getModel();
        String id = materialModel.getValueAt(index, 0).toString();
        String name = materialModel.getValueAt(index, 1).toString();
        String phone = materialModel.getValueAt(index, 3).toString();
        
        int temp = 0, i;
        for(i = 0 ;i<=count;i++){
            if(checkArray[i]==index){
                temp = 1;
                break;
            }
        }

        if(temp == 0){
            materialSelectedModel.addRow(new Object[]{id,name,phone}); 
            checkArray[count] = index;
            count+=1;
        }
        else{
           JOptionPane.showMessageDialog(null, "Material already selected");
        }
        
        
        
    }//GEN-LAST:event_materialTableMouseClicked
    
    private boolean validateFields() {
        if (!txtProductId.getText().equals("") && !txtProductName.getText().equals("") && !txtDescription.getText().equals("") && !txtQuantity.getText().equals("") && !txtPrice.getText().equals("") && !txtCustomerId.getText().equals("") && !(count==0)) {
            return false;
        } else {
            return true;
        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String id = txtProductId.getText();
        String Pname = txtProductName.getText();
        String description = txtDescription.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String customerId = txtCustomerId.getText();
        
        if(validateFields()){
            JOptionPane.showMessageDialog(null, "Enter all the fields");
        }
        else{
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                PreparedStatement ps = con.prepareStatement("insert into product (Product_id,Product_name,Description,Product_quantity,Price,Customer_id) values(?,?,?,?,?,?)");
                ps.setString(1,id);
                ps.setString(2,Pname);
                ps.setString(3,description);
                ps.setInt(4,Integer.parseInt(quantity));
                ps.setInt(5,Integer.parseInt(price));
                ps.setString(6,customerId);
                ps.execute();
                
                TableModel materialModel = materialSelectedTable.getModel();
                String Mid = "";
                for(int i=0 ; i<count;i++){
//                    Mid = "'";
                    Mid = Mid+"'"+materialModel.getValueAt(i, 0).toString()+"'";
//                    Mid = "'";
                    if(i<count-1){
                        Mid += ",";
                       
                    }
                }
                System.out.println(Mid);
                  
                st.executeUpdate("update material set ProductID = '"+id+"' where Material_id in ("+Mid+")");
                   
                JOptionPane.showMessageDialog(null, "Product added Successfully");  
                setVisible(false);
                new ViewProduct().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        count = 0;
        setVisible(false);
        new AddProduct().setVisible(true); 
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable materialSelectedTable;
    private javax.swing.JTable materialTable;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}