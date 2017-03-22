/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago Vinícius
 */
public class ListaQuartos extends javax.swing.JFrame {
    
    JFrame parent;
    
    public ListaQuartos(JFrame parent) {
        this.parent = parent;       
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        listaDeQuartos = new javax.swing.JTable();
        todos = new javax.swing.JButton();
        livres = new javax.swing.JButton();
        ocupados = new javax.swing.JButton();
        paraLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        listaDeQuartos.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(listaDeQuartos);

        todos.setText("Todos os quartos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        livres.setText("Quartos Livres");
        livres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livresActionPerformed(evt);
            }
        });

        ocupados.setText("Quartos Ocupados");
        ocupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupadosActionPerformed(evt);
            }
        });

        paraLimpar.setText("Quartos para Limpar");
        paraLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("LISTA DE QUARTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(todos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(livres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocupados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paraLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todos)
                    .addComponent(livres)
                    .addComponent(ocupados)
                    .addComponent(paraLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         parent.setEnabled(true);
         parent.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "root", "123456" );

            String sql = "SELECT * FROM quartos";
            PreparedStatement pstmt = con.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            
            listaDeQuartos.setModel(buildTableModel(rs));
            
            con.close();
        }
        catch(SQLException ex){

        }
    }//GEN-LAST:event_todosActionPerformed

    private void livresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livresActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "root", "123456" );

            String sql = "SELECT * FROM quartos WHERE ocupado=false";
            PreparedStatement pstmt = con.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            
            listaDeQuartos.setModel(buildTableModel(rs));
            
            con.close();
        }
        catch(SQLException ex){

        }
    }//GEN-LAST:event_livresActionPerformed

    private void ocupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupadosActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "root", "123456" );

            String sql = "SELECT * FROM quartos WHERE ocupado=true";
            PreparedStatement pstmt = con.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            
            listaDeQuartos.setModel(buildTableModel(rs));
            
            con.close();
        }
        catch(SQLException ex){

        }
    }//GEN-LAST:event_ocupadosActionPerformed

    private void paraLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraLimparActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "root", "123456" );

            String sql = "SELECT * FROM quartos WHERE precisa_limpar=true";
            PreparedStatement pstmt = con.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            
            listaDeQuartos.setModel(buildTableModel(rs));
            
            con.close();
        }
        catch(SQLException ex){

        }
    }//GEN-LAST:event_paraLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaDeQuartos;
    private javax.swing.JButton livres;
    private javax.swing.JButton ocupados;
    private javax.swing.JButton paraLimpar;
    private javax.swing.JButton todos;
    // End of variables declaration//GEN-END:variables

public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<String>> data = new Vector<Vector<String>>();
    while (rs.next()) {
        Vector<String> vector = new Vector<String>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            //Converts the default "true or false" values from SQL to "sim or não"           
            String value = rs.getString(columnIndex);
            if(value == "true"){
                value = "Sim";
            }
            else if(value == "false"){
                value = "Não";
            }
            
            vector.add(value);
        }
        data.add(vector);
    }
    
    DefaultTableModel table = new DefaultTableModel(data, columnNames);
   
    return table;

}


}
