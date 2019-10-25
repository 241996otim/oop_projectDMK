/*
    STUDENT NAME                REG. NUMBER
 1. Thomas Otim Dominic         19/766/BIT-S
 2. Kirinya Moses Aventore      19/589/BSCS-S
 */

package org.iuea.oop.modall;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable{
    //variable declaration..
    private static JScrollPane jsp;
        
    public Table(String data[][], String headers[]){
        super(data, headers);
        super.setEnabled(false);
        super.getTableHeader().setFont(new java.awt.Font("Verdana", 1, 11));
        super.getTableHeader().setBackground(new Color(204, 204, 204));//0, 204, 255
        super.getTableHeader().setOpaque(false);
        super.setShowGrid(false);
        super.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        super.getColumnModel().getColumn(0).setPreferredWidth(6);
        this.setFont(new java.awt.Font("Verdana", 0, 11));
    }
       
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (row % 2 == 0){
            c.setBackground(new Color(240, 240, 240));
        }else{
            c.setBackground(Color.WHITE);
        }
        return c;
    }

    public static void createTable(JPanel panel, String headers[], String data[][], int w, int h) {
        jsp = new JScrollPane(new Table(data, headers));
        jsp.setPreferredSize(new Dimension(w, h));
        panel.add(jsp);
    }
    
}
