import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaSwingApp extends JFrame {
    JLabel lbl;
    JButton btn;

    public static void main(String[] args) {
        new JavaSwingApp();
    }

    public JavaSwingApp() {
        this.setTitle("Java GUI Swing App");
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());

        lbl = new JLabel("Hello, World!");
        this.add(lbl);

        btn = new JButton("Exit");
        this.add(btn);

        this.setVisible(true);
    }
}
