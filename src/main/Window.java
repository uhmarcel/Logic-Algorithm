/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.table.TableColumn;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class Window extends javax.swing.JFrame {

    private Object[][] table;
    private String[] header;
    private boolean[] input;
    private boolean mode = true;
    
    public Window() {
        this.setLocationRelativeTo(null);
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outJLabel = new javax.swing.JLabel();
        outJTextField = new javax.swing.JTextField();
        optionJPanel = new javax.swing.JPanel();
        varJLabel = new javax.swing.JLabel();
        varJSpinner = new javax.swing.JSpinner();
        modeJLabel = new javax.swing.JLabel();
        modeJComboBox = new javax.swing.JComboBox<>();
        authorJLabel = new javax.swing.JLabel();
        mainJPanel = new javax.swing.JPanel();
        mainJScrollPane = new javax.swing.JScrollPane();
        mainJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logic Algorithm");
        setResizable(false);

        outJLabel.setText("Statement:");

        outJTextField.setEditable(false);
        outJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outJTextField.setText("Algorithm output.");
        outJTextField.setMinimumSize(new java.awt.Dimension(448, 22));
        outJTextField.setPreferredSize(new java.awt.Dimension(448, 20));
        outJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outJTextFieldActionPerformed(evt);
            }
        });

        optionJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        varJLabel.setText("Variables:");

        varJSpinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 5, 1));
        varJSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                varJSpinnerStateChanged(evt);
            }
        });

        modeJLabel.setText("Mode:");

        modeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        modeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conjuntive", "Disjuntive" }));
        modeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeJComboBoxActionPerformed(evt);
            }
        });

        authorJLabel.setFont(new java.awt.Font("Arial", 2, 8)); // NOI18N
        authorJLabel.setForeground(new java.awt.Color(153, 153, 153));
        authorJLabel.setText("Marcel Riera");

        javax.swing.GroupLayout optionJPanelLayout = new javax.swing.GroupLayout(optionJPanel);
        optionJPanel.setLayout(optionJPanelLayout);
        optionJPanelLayout.setHorizontalGroup(
            optionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(optionJPanelLayout.createSequentialGroup()
                        .addGroup(optionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionJPanelLayout.createSequentialGroup()
                                .addComponent(varJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modeJLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(authorJLabel)))
                .addContainerGap())
        );
        optionJPanelLayout.setVerticalGroup(
            optionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varJLabel)
                    .addComponent(varJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(modeJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authorJLabel))
        );

        mainJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Truth Table"));
        mainJPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        mainJPanel.setMinimumSize(new java.awt.Dimension(382, 275));
        mainJPanel.setName(""); // NOI18N
        mainJPanel.setLayout(new java.awt.BorderLayout());

        mainJScrollPane.setPreferredSize(mainJTable.getPreferredSize());

        mainJTable.getTableHeader().setReorderingAllowed(false);
        setTable();
        mainJTable.setPreferredSize(new java.awt.Dimension(370, 16*table.length));
        mainJTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        mainJTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mainJTablePropertyChange(evt);
            }
        });
        mainJScrollPane.setViewportView(mainJTable);

        mainJPanel.add(mainJScrollPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(outJLabel))
                    .addComponent(outJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(optionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JPanel getMainJPanel() {
        return mainJPanel;
    }
    public JScrollPane getMainJScrollPane() {
        return mainJScrollPane;
    }
    public JSpinner getVarJSpinner() {
        return varJSpinner;
    }
    
    private boolean checkTable() {
        input = new boolean[table.length];
        for (int i=0; i<table.length; i++) {
            if (mainJTable.getValueAt(i, header.length-1)==null)
                return false;
            else if ((mainJTable.getValueAt(i, header.length-1)).equals("T"))
                input[i] = true;
            else if ((mainJTable.getValueAt(i, header.length-1)).equals("F"))
                input[i] = false;
        }
        return true;
    }
    
    private void setTable() {
        int cols = (int) varJSpinner.getValue();
        int rows = (int) Math.pow(2, cols);
        header = new String[cols+1];
        table = new Object[rows][cols+1];
        
        header[header.length-1] = "*";
        String a = "pqrsn";  // letters to use as variables
        for (int i=0; i < (header.length-1); i++) {
            header[i] = Character.toString(a.charAt(i));
        }
        for (int x=0; x < cols; x++) {
            int aux = (int) Math.pow(2,(cols-x))/2;  
            for (int y=0; y < rows; y++) {
                if (y%(aux*2) < aux)                     
                    table[y][x] = "T";
                else 
                    table[y][x] = "F";    
            }
        }
        mainJTable.setModel(new javax.swing.table.DefaultTableModel(table, header));
        
        JComboBox editor = new JComboBox();
        editor.addItem("T");
        editor.addItem("F");
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        double s = (mainJTable.getPreferredSize().getWidth()-70)/((table[0].length-1));
        for (int i=0; i<(table[0].length-1); i++) {
            TableColumn t = mainJTable.getColumnModel().getColumn(i);
            t.setPreferredWidth((int) s);
            t.setCellRenderer(centerRenderer);
        }
        
        TableColumn t = mainJTable.getColumnModel().getColumn(table[0].length-1);
        t.setCellEditor(new DefaultCellEditor(editor));
        t.setPreferredWidth(70);
        t.setCellRenderer(centerRenderer);  
    }
    
    private boolean format(String x) {
        if (x.equals("T")) return true;
        else if (x.equals("F")) return false;
        else {
            JOptionPane.showMessageDialog(null, "Error: null format :C");
            return false;
        }
    }
    
    private String generateStatement() {
        String output = new String();
        
        if (mode == true) {   // Conjuntive
            for (int i=0; i<table.length; i++) {
                if (input[i] == true) {
                    if (i!=0 && !output.equals(""))
                        output += "∨";
                    output += "(";

                    for (int n=0; n<table[0].length-1; n++) {

                        String x = (String) table[i][n];
                        String arg = (String) mainJTable.getColumnModel().getColumn(n).getHeaderValue();

                        if (n!=0) 
                            output += "∧";
                        if (format(x) == true) 
                            output += arg;
                        else
                            output += "¬" + arg;    
                    }
                    output += ")";
                } 
            }
        }
        else {
        for (int i=0; i<table.length; i++) {
                if (input[i] == false) {
                    if (i!=0 && !output.equals(""))
                        output += "∧";
                    output += "(";

                    for (int n=0; n<table[0].length-1; n++) {

                        String x = (String) table[i][n];
                        String arg = (String) mainJTable.getColumnModel().getColumn(n).getHeaderValue();

                        if (n!=0) 
                            output += "∨";
                        if (format(x) == false) 
                            output += arg;
                        else
                            output += "¬" + arg;    
                    }
                    output += ")";
                } 
            }    
        }
        return output;
    }
    
    private void outJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outJTextFieldActionPerformed
        
    }//GEN-LAST:event_outJTextFieldActionPerformed

    private void varJSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_varJSpinnerStateChanged
        setTable();
        mainJTable.setPreferredSize(new java.awt.Dimension(382, 16*table.length));
    }//GEN-LAST:event_varJSpinnerStateChanged
    
    private void mainJTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mainJTablePropertyChange
        if (checkTable())
            outJTextField.setText(generateStatement());
    }//GEN-LAST:event_mainJTablePropertyChange

    private void modeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeJComboBoxActionPerformed
        String x = (String) modeJComboBox.getSelectedItem();
        boolean oldMode = mode;
        if (x.equals("Conjuntive")) mode = true;
        else if (x.equals("Disjuntive")) mode = false;
        if ((mode!=oldMode)&&(checkTable())) {
            outJTextField.setText(generateStatement());
        }
    }//GEN-LAST:event_modeJComboBoxActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JScrollPane mainJScrollPane;
    private javax.swing.JTable mainJTable;
    private javax.swing.JComboBox<String> modeJComboBox;
    private javax.swing.JLabel modeJLabel;
    private javax.swing.JPanel optionJPanel;
    private javax.swing.JLabel outJLabel;
    private javax.swing.JTextField outJTextField;
    private javax.swing.JLabel varJLabel;
    private javax.swing.JSpinner varJSpinner;
    // End of variables declaration//GEN-END:variables
}
