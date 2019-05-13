package Bioclicker;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    public Resources resPool;
    public JFrame frame;

    public Game() {
        setPreferredSize(new Dimension(400, 400));

        long curTime = System.nanoTime();
        int milliPerTick = 100;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (System.nanoTime() - curTime >= 1000000 * milliPerTick) {
                run();
                curTime += 1000000 * milliPerTick;
            }
        }
    }

    public void run() {
        System.out.println("running");
        repaint();
    }

    // Method for actually drawing to the screen.
    // If this runs, the code is working.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("painting");
        setBackground(Color.BLUE);
    }


}
