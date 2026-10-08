import javax.swing.*;
import java.awt.*;

public class FlowchartCanvas extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Gambar Kotak Start
        g2d.drawRect(50, 50, 100, 40);
        g2d.drawString("Start", 85, 75);

        // Panah Penghubung
        g2d.drawLine(100, 90, 100, 130);

        // Gambar Kotak Proses
        g2d.drawRect(50, 130, 100, 40);
        g2d.drawString("Proses", 80, 155);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flowchart Manual");
        frame.add(new FlowchartCanvas());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}