/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author misaelinux
 */
public class Ventana extends JFrame implements ActionListener {

    JButton captura;
    JTable tabla;

    Ventana() {
        setTitle("Tablas");
        setLayout(null);
        setSize(600, 400);

        String datos[][] = {
            {"0-0", "0-1", "0-2"},
            {"1-0", "1-1", "1-2"}
        };
        String titulos[] = {"Columna 0", "Columna 1", "Columna 2"};
        tabla = new JTable(datos, titulos);
        captura = new JButton("Imprimir");
        captura.addActionListener(this);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 10, 300, 250);
        captura.setBounds(350, 10, 100, 30);
        add(scroll, BorderLayout.CENTER);
        add(captura);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int col = tabla.getColumnCount();
        int fil = tabla.getRowCount();
        System.out.println("Tabla de tamaño "+fil + " x " + col);
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(tabla.getValueAt(i, j) + "\t");
            }
            System.out.println("");
        }
    }

}
