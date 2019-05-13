package Bioclicker;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();
        this.add(game);

        this.pack();
        this.setMinimumSize(new Dimension(400, 400));
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Bioclicker");
    }
}