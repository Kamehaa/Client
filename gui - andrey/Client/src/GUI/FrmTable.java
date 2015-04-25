/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrey
 */
public class FrmTable extends JFrame{
    private JTable table;
    private JButton btnAdd;
    private DefaultTableModel tableModel;
    private JTextField txtField1;
    private JTextField txtField2;
    private JTextField txtField3;
    private JTextField txtField4;
    private JButton actButton;


    private FrmTable() {
        createGUI();
    }

    private void createGUI() {
        setLayout(new BorderLayout());
        JScrollPane pane = new JScrollPane();
        table = new JTable();
        pane.setViewportView(table);
        JPanel eastPanel = new JPanel();
        btnAdd = new JButton("Add");
        eastPanel.add(btnAdd);
        JPanel northPanel = new JPanel();
        txtField1 = new JTextField();
        txtField2 = new JTextField();
        txtField3 = new JTextField();
        txtField4 = new JTextField();
        JLabel lblField1 = new JLabel("OfferedItem");
        JLabel lblField2 = new JLabel("NumberOffered");
        JLabel lblField3 = new JLabel("DemandedItem");
        JLabel lblField4 = new JLabel("NumberDemanded");
        JLabel lblField5 = new JLabel("Act");
        northPanel.add(lblField1);
        northPanel.add(txtField1);
        northPanel.add(lblField2);
        northPanel.add(txtField2);
        txtField1.setPreferredSize(lblField1.getPreferredSize());
        txtField2.setPreferredSize(lblField2.getPreferredSize());

        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);
        add(pane,BorderLayout.CENTER);
        tableModel = new DefaultTableModel(new Object[]{"OfferedItem","NumberOffered","DemandedItem","NumberDemanded","Act"},0);
        table.setModel(tableModel);
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = tableModel.getRowCount()+1;
                tableModel.addRow(new Object[]{txtField1.getText(),txtField1.getText(),txtField1.getText(),txtField1.getText(),new JButton("Act")});
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                FrmTable frm = new FrmTable();
                frm.setLocationByPlatform(true);
                frm.pack();
                frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frm.setVisible(true);

            }

        });
    }
} 
