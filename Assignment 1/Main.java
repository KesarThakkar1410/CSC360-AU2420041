import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a hollow square
        g.drawRect(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hollow Square");

        frame.add(new Main());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}