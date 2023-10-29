/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplayer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Anhadh Sran
 */
public class SongTile extends JPanel {
    public SongTile() {
        this.setOpaque(true);
        this.setBackground(new Color(35, 45, 40));
        this.setLayout(new GridLayout(1, 5));
        this.setPreferredSize(new Dimension(3000, 100));
    }
}
