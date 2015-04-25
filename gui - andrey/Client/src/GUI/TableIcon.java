package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.*;

public class TableIcon extends JFrame
{
    public String[] tokens;
    public Object[][] data;
    public ImageIcon[] icons;
    public static TableIcon frame;
    public JButton btnAdd;
    public JPanel southPanel;
        
    public TableIcon(int x)
    {
        
        icons = new ImageIcon[10]; 
        icons[0] = new ImageIcon(getClass().getClassLoader().getResource("img/honey.png"));
        icons[1] = new ImageIcon(getClass().getClassLoader().getResource("img/herbs.png"));
        icons[2] = new ImageIcon(getClass().getClassLoader().getResource("img/clay.png"));
        icons[3] = new ImageIcon(getClass().getClassLoader().getResource("img/mineral.png"));
        icons[4] = new ImageIcon(getClass().getClassLoader().getResource("img/potion.png"));
        icons[5] = new ImageIcon(getClass().getClassLoader().getResource("img/incense.png"));
        icons[6] = new ImageIcon(getClass().getClassLoader().getResource("img/gems.png"));
        icons[7] = new ImageIcon(getClass().getClassLoader().getResource("img/lifeelixir.png"));
        icons[8] = new ImageIcon(getClass().getClassLoader().getResource("img/manacrystal.png"));
        icons[9] = new ImageIcon(getClass().getClassLoader().getResource("img/philosopherstone.png"));
        String[] columnNames = {"Offered Item", "Number Offered", "Demanded Item", "Number Demanded", "Act"};
        if(x==0){
            InitData();
        }
        else if(x==1){
            InitData1();
        }
//        Object[][] data = {
//            {icons[0],1,icons[2],2,"Cancel"},
//            {icons[1],2,icons[3],1,"Fetch"},
//            {icons[4],1,icons[5],1,"Cancel"}    
//        }; 
                
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table;
        table = new JTable( model )
        {
            @Override
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
//        table.getColumn("Offered Item").setPreferredWidth(35);
//        table.getColumn("Demanded Item").setPreferredWidth(35);
//        table.getColumn("Number Offered").setPreferredWidth(60);
//        table.getColumn("Number Demanded").setPreferredWidth(70);
        table.getColumn("Offered Item").sizeWidthToFit();
        table.getColumn("Demanded Item").sizeWidthToFit();
        table.getColumn("Number Offered").sizeWidthToFit();
        table.getColumn("Number Demanded").sizeWidthToFit();
        
        table.getColumn("Act").setPreferredWidth(40);
        table.getColumn("Act").setCellRenderer(new ButtonRenderer());
        table.getColumn("Act").setCellEditor(new ButtonEditor(new JCheckBox()));
        table.setRowHeight(85);
        
        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );
        southPanel = new JPanel();
        btnAdd = new JButton("Cancel");
        southPanel.add(btnAdd);
        add(southPanel,BorderLayout.SOUTH);
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
    
    public void InitData(){
        tokens = new String[MainMenuGUI.C.getTradeBox().size()];  
        data = new Object[MainMenuGUI.C.getTradeBox().size()][5];
        for(int i = 0 ; i<MainMenuGUI.C.getTradeBox().size(); ++i){   
            data[i][0] = icons[MainMenuGUI.C.getTradeBox().get(i).mOfferedItem];
            data[i][1] = MainMenuGUI.C.getTradeBox().get(i).mNOfferedItem;
            data[i][2] = icons[MainMenuGUI.C.getTradeBox().get(i).mDemandedItem];
            data[i][3] = MainMenuGUI.C.getTradeBox().get(i).mNDemandedItem;
            if(MainMenuGUI.C.getTradeBox().get(i).mIsAvailable){
                data[i][4] = "Cancel";
            }
            else{
                data[i][4] = "Fetch";
            }
            tokens[i] = MainMenuGUI.C.getTradeBox().get(i).mToken;
        }
        System.out.println(data.length);
    }
    
    public void InitData1(){
        tokens = new String[MainMenuGUI.C.getItemFound().size()];  
        data = new Object[MainMenuGUI.C.getItemFound().size()][5];
        for(int i = 0 ; i<MainMenuGUI.C.getItemFound().size(); ++i){   
            if(MainMenuGUI.C.getItemFound().get(i).mIsAvailable){
                data[i][0] = icons[MainMenuGUI.C.getItemFound().get(i).mOfferedItem];
                data[i][1] = MainMenuGUI.C.getItemFound().get(i).mNOfferedItem;
                data[i][2] = icons[MainMenuGUI.C.getItemFound().get(i).mDemandedItem];
                data[i][3] = MainMenuGUI.C.getItemFound().get(i).mNDemandedItem;
                data[i][4] = "Accept";
            }
            tokens[i] = MainMenuGUI.C.getItemFound().get(i).mToken;
        }
        System.out.println(data.length);
    }
    
    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
          setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
          if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
          } else {
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
          }
          setText((value == null) ? "" : value.toString());
          return this;
        }
    }
    
    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;
        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            }
            else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            button.setName(String.valueOf(row));
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                // 
                MainMenuGUI.C.setOfferToken(tokens[Integer.parseInt(button.getName())]);
                if(label.equals("Fetch")){
                    MainMenuGUI.C.fetchItem();
                    if(MainMenuGUI.C.getStatus().equals("ok")){
                        JOptionPane.showMessageDialog( button , "Item Fetched");
                    }
                    else if(MainMenuGUI.C.getStatus().equals("fail")){
                        JOptionPane.showMessageDialog( button , MainMenuGUI.C.getDescription());
                    }
                    else{
                        JOptionPane.showMessageDialog( button , "Error!");
                    }
                }
                else if(label.equals("Cancel")){
                    MainMenuGUI.C.cancelOffer();
                    if(MainMenuGUI.C.getStatus().equals("ok")){
                        JOptionPane.showMessageDialog( button , "Offer Canceled");
                    }
                    else if(MainMenuGUI.C.getStatus().equals("fail")){
                        JOptionPane.showMessageDialog( button , MainMenuGUI.C.getDescription());
                    }
                    else{
                        JOptionPane.showMessageDialog( button , "Error!");
                    }
                }
                else if(label.equals("Accept")){
                    MainMenuGUI.C.sendAccept();
                    if(MainMenuGUI.C.getStatus().equals("ok")){
                        JOptionPane.showMessageDialog( button , "Item Accepted");
                    }
                    else if(MainMenuGUI.C.getStatus().equals("fail")){
                        JOptionPane.showMessageDialog( button , MainMenuGUI.C.getDescription());
                    }
                    else{
                        JOptionPane.showMessageDialog( button , "Error!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog( button , "Error!");
                }
                setVisible(false);
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
    
    public static void main(String[] args)
    {
        
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1366, 768);
    }

}

