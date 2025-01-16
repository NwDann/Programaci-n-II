/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Clicºk nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author acer
 */
public class Icono {

    public void setImageLabel(JLabel labelname, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                    image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT)
        );
        labelname.setIcon(icon);
    }
    
}
