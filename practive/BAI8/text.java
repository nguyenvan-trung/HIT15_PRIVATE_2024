package BAI8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class text {
    public static void main(String[] args) {
        Circle dem = new Circle();
        dem.input();
        System.out.println(dem.toString());
        JFrame frame = new JFrame("Circle Drawing");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dem.drawn(g);  
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
