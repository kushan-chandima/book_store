
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class ProfitIN extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pst = null;
ResultSet rs = null;
    /**
     * Creates new form ProfitIN
     * 
     * 
     * 
     */




    public ProfitIN() {
        initComponents();
        con = dbcon.con();
        
    }
    public int calins(){
        
        int total = 0;
         String d1 = null;
        String d2 = null;
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> D = new ArrayList<String>();
        
        try{
            String sql = "SELECT sta_id from customer_stationery where date between ? and ?";
             
            String val = jComboBox1.getSelectedItem().toString();
        
        if(val == "January"){
            d1 = "2020-01-01";
            d2 = "2020-01-31";
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "March"){
            d1 = "2020-03-01";
            d2 = "2020-03-31";
            
        }
        
        else if(val == "April"){
            d1 = "2020-04-01";
            d2 = "2020-04-30";
            
        }
        
        else if(val == "May"){
            d1 = "2020-05-01";
            d2 = "2020-05-31";
            
        }
        
        else if(val == "June"){
            d1 = "2020-06-01";
            d2 = "2020-06-30";
            
        }
        
        else if(val == "July"){
            d1 = "2020-07-01";
            d2 = "2020-07-31";
            
        }
        
        else if(val == "August"){
            d1 = "2020-08-01";
            d2 = "2020-08-31";
            
        }
        
        else if(val == "September"){
            d1 = "2020-09-01";
            d2 = "2020-09-30";
            
        }
        
        else if(val == "November"){
            d1 = "2020-10-01";
            d2 = "2020-10-31";
            
        }
        
        else if(val == "December"){
            d1 = "2020-12-01";
            d2 = "2020-12-30";
            
        }
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, d1);
            pst.setString(2, d2);
            rs = pst.executeQuery();
            
            while(rs.next()){
                B.add(rs.getString("sta_id"));
                
                
            }
            
          
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try{
              int size = B.size();
            int i = 0;
            
            String sql = "SELECT sell_price from stationery_table where sta_id =?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            
            while(i < size){
                
                pst.setString(1,B.get(i));
                rs = pst.executeQuery();
                while(rs.next()){
                    D.add(rs.getString("sell_price"));
                    
                }
                i = i +1 ;
            }
                
            int dsize = D.size();
            int j = 0;
            
            while (j < dsize){
                total =total +Integer.parseInt(D.get(j));
                j = j +1 ;
            }
            ifs.setText(Integer.toString(total));
            
        }
    catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return total;
}
    
    public int calinb(){
        
        int total = 0;
         String d1 = null;
        String d2 = null;
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> D = new ArrayList<String>();
        
        try{
            String sql = "SELECT book_id from customer_book where date between ? and ?";
             
            String val = jComboBox1.getSelectedItem().toString();
        
        if(val == "January"){
            d1 = "2020-01-01";
            d2 = "2020-01-31";
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "March"){
            d1 = "2020-03-01";
            d2 = "2020-03-31";
            
        }
        
        else if(val == "April"){
            d1 = "2020-04-01";
            d2 = "2020-04-30";
            
        }
        
        else if(val == "May"){
            d1 = "2020-05-01";
            d2 = "2020-05-31";
            
        }
        
        else if(val == "June"){
            d1 = "2020-06-01";
            d2 = "2020-06-30";
            
        }
        
        else if(val == "July"){
            d1 = "2020-07-01";
            d2 = "2020-07-31";
            
        }
        
        else if(val == "August"){
            d1 = "2020-08-01";
            d2 = "2020-08-31";
            
        }
        
        else if(val == "September"){
            d1 = "2020-09-01";
            d2 = "2020-09-30";
            
        }
        
        else if(val == "November"){
            d1 = "2020-10-01";
            d2 = "2020-10-31";
            
        }
        
        else if(val == "December"){
            d1 = "2020-12-01";
            d2 = "2020-12-30";
            
        }
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, d1);
            pst.setString(2, d2);
            rs = pst.executeQuery();
            
            while(rs.next()){
                B.add(rs.getString("book_id"));
                
                
            }
            
          
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try{
              int size = B.size();
            int i = 0;
            
            String sql = "SELECT sell_price from book_table where book_id =?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            
            while(i < size){
                
                pst.setString(1,B.get(i));
                rs = pst.executeQuery();
                while(rs.next()){
                    D.add(rs.getString("sell_price"));
                    
                }
                i = i +1 ;
            }
                
            int dsize = D.size();
            int j = 0;
            
            while (j < dsize){
                total =total +Integer.parseInt(D.get(j));
                j = j +1 ;
            }
            ifb.setText(Integer.toString(total));
        }
    catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return total;
}
    
    public int calexs() {
        
        int total = 0;
        String d1 = null;
        String d2 = null;
        ArrayList<String> B = new ArrayList<String>();
        
        
        try{
            String sql = "SELECT cost from supplier_stationery where date between ? and ?";
             
            String val = jComboBox1.getSelectedItem().toString();
        
        if(val == "January"){
            d1 = "2020-01-01";
            d2 = "2020-01-31";
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "March"){
            d1 = "2020-03-01";
            d2 = "2020-03-31";
            
        }
        
        else if(val == "April"){
            d1 = "2020-04-01";
            d2 = "2020-04-30";
            
        }
        
        else if(val == "May"){
            d1 = "2020-05-01";
            d2 = "2020-05-31";
            
        }
        
        else if(val == "June"){
            d1 = "2020-06-01";
            d2 = "2020-06-30";
            
        }
        
        else if(val == "July"){
            d1 = "2020-07-01";
            d2 = "2020-07-31";
            
        }
        
        else if(val == "August"){
            d1 = "2020-08-01";
            d2 = "2020-08-31";
            
        }
        
        else if(val == "September"){
            d1 = "2020-09-01";
            d2 = "2020-09-30";
            
        }
        
        else if(val == "November"){
            d1 = "2020-10-01";
            d2 = "2020-10-31";
            
        }
        
        else if(val == "December"){
            d1 = "2020-12-01";
            d2 = "2020-12-30";
            
        }
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, d1);
            pst.setString(2, d2);
            rs = pst.executeQuery();
            
            while(rs.next()){
                B.add(rs.getString("cost"));
                
                
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
       
          
         int size = B.size();
        
         // np.setText(B.get(0));
          //np.setText(E.get(0));
       
        int j = 0; 
         
         while(j < size ){
             
             total = total + Integer.parseInt(B.get(j));
             
             
             j = j + 1 ;
         }
         
          efs.setText(Integer.toString(total));
         
          
      return total;   
    }
    
    public int calexb(){
        
        int total = 0;
        String d1 = null;
        String d2 = null;
        ArrayList<String> B = new ArrayList<String>();
        
        
        try{
            String sql = "SELECT cost from publisher_book where date between ? and ?";
             
            String val = jComboBox1.getSelectedItem().toString();
        
        if(val == "January"){
            d1 = "2020-01-01";
            d2 = "2020-01-31";
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "February"){
            d1 = "2020-02-01";
            d2 = "2020-02-29";
            
        }
        
        else if(val == "March"){
            d1 = "2020-03-01";
            d2 = "2020-03-31";
            
        }
        
        else if(val == "April"){
            d1 = "2020-04-01";
            d2 = "2020-04-30";
            
        }
        
        else if(val == "May"){
            d1 = "2020-05-01";
            d2 = "2020-05-31";
            
        }
        
        else if(val == "June"){
            d1 = "2020-06-01";
            d2 = "2020-06-30";
            
        }
        
        else if(val == "July"){
            d1 = "2020-07-01";
            d2 = "2020-07-31";
            
        }
        
        else if(val == "August"){
            d1 = "2020-08-01";
            d2 = "2020-08-31";
            
        }
        
        else if(val == "September"){
            d1 = "2020-09-01";
            d2 = "2020-09-30";
            
        }
        
        else if(val == "November"){
            d1 = "2020-10-01";
            d2 = "2020-10-31";
            
        }
        
        else if(val == "December"){
            d1 = "2020-12-01";
            d2 = "2020-12-30";
            
        }
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, d1);
            pst.setString(2, d2);
            rs = pst.executeQuery();
            
            while(rs.next()){
                B.add(rs.getString("cost"));
                
                
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
       
          
         int size = B.size();
        
         // np.setText(B.get(0));
          //np.setText(E.get(0));
       
        int j = 0; 
         
         while(j < size ){
             
             total = total + Integer.parseInt(B.get(j));
             
             
             j = j + 1 ;
         }
         
          efb.setText(Integer.toString(total));
         
       
          return total;
    }
    
    
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ifb = new javax.swing.JTextField();
        ifs = new javax.swing.JTextField();
        efb = new javax.swing.JTextField();
        efs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        test = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Expenditures for Books");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Income from Books");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Expenditures for Stationeries");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Income from Stationeries");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Net Profit");

        np.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Income and Profit");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Select Month");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        test.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        test.setText("Display");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ifb)
                            .addComponent(ifs)
                            .addComponent(efb)
                            .addComponent(efs)
                            .addComponent(np, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, 0, 140, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88)
                .addComponent(test)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(test))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(np))
                .addGap(102, 102, 102))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 50, 710, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\books.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new AdminIN().setVisible(true);
        this.setVisible(false);
    }                                        

    private void testActionPerformed(java.awt.event.ActionEvent evt) {                                     
        int a = calexs();
        int b = calexb(); 
        int c = calinb();
        int d = calins();
        
        
        int e =  (c + d )- (a + b);
        np.setText(Integer.toString(e));
        
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
            java.util.logging.Logger.getLogger(ProfitIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfitIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfitIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfitIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField efb;
    private javax.swing.JTextField efs;
    private javax.swing.JTextField ifb;
    private javax.swing.JTextField ifs;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField np;
    private javax.swing.JButton test;
    // End of variables declaration                   
}
