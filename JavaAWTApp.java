import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWTApp {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("My First AWT GUI App");
        f.setSize(800, 600);
        f.setResizable(false);
        f.setLayout(new FlowLayout());
        f.addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                };
            }
        );

        Label l = new Label("Hello, World!");
        f.add(l);

        Button b = new Button("Exit");
        b.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                };
            }
        );
        f.add(b);

        
        f.setVisible(true);
    }
}