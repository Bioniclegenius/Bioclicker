package Bioclicker;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
    public Resources resPool;
    public JFrame frame;
    
    public Game(){
        frame = new JFrame("Bioclicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.pack();
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setVisible(true);
    }
    
    public void Run(){
	    
    }
}
