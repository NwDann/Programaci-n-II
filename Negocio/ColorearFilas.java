/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author DyS
 */
public class ColorearFilas extends DefaultTableCellRenderer{
    //METODOS
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        //CONDICION
        if(table.getValueAt(row, 4).toString().equalsIgnoreCase("NO")){
            setBackground(Color.red);
            setForeground(Color.black);
            
        } else if(table.getValueAt(row, 3).toString().equals("VIP")){
            setBackground(Color.orange);
            setForeground(Color.black);
            
        } else if(table.getValueAt(row, 3).toString().equals("Turista")){
            setBackground(Color.cyan);
            setForeground(Color.black);
        } else {
            setBackground(Color.green);
            setForeground(Color.black);
        }
        
        return this;
    }
    
}
