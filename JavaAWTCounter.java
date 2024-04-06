import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class JavaAWTCounter extends Frame {
    TextField txtCounter = new TextField("0");
    Button btnCount = new Button("Count");
    int n = 0;
   

    public static void main(String[] args) {
        new JavaAWTCounter();
    }

    public JavaAWTCounter() {
        this.setTitle("Java AWT GUI Counter");
        this.setSize(800, 600);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setLayout( new BoxLayout(this, BoxLayout.Y_AXIS) );

        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 300);
        Font font2 = new Font(Font.MONOSPACED, Font.PLAIN, 100);

        txtCounter.setEditable(false);
        txtCounter.setFont(font1);
        txtCounter.setForeground(Color.WHITE);
        txtCounter.setBackground(Color.BLACK);
        this.add(txtCounter);

        btnCount.setFont(font2);
        btnCount.setForeground(Color.GRAY);
        btnCount.setBackground(Color.DARK_GRAY);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCounter.setText("" + ++n);
            }
        });
        this.add(btnCount);


        this.setVisible(true);
    }    
}